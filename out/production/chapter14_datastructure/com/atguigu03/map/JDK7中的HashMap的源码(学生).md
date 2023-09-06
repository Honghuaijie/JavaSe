# JDK7中HaxhMap源码分析

## 初始化

## 

```java
HashMap<String,Integer> map = new HashMap<>()
```

```
public HashMap() {
   this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
}
```



```java
public HashMap(int initialCapacity, float loadFactor) {
        // 略

        // Find a power of 2 >= initialCapacity
        int capacity = 1;  //用来计算计算最终数组的长度
        while (capacity < initialCapacity)   //保证数组的长度是2的幂
            capacity <<= 1;

        this.loadFactor = loadFactor;  //负载因子
        threshold = (int)Math.min(capacity * loadFactor, MAXIMUM_CAPACITY + 1);  //确定了临界值
        table = new Entry[capacity];  //初始化entry数组，长度为capacity
    }
```



其中

```java
static final int DEFAULT_INITIAL_CAPACITY = 16;   //默认初始容量-必须是2的幂。
static final float DEFAULT_LOAD_FACTOR = 0.75f;  //在构造函数中未指定时,使用的负载因子。
final float loadFactor;  //负载因子
```



## 添加\修改

```java
map.put("AA",123) 
```





```java
public V put(K key, V value) {
        if (key == null)  //key为null的情况下， 执行
            return putForNullKey(value);
        int hash = hash(key); //计算出hash值2
        int i = indexFor(hash, table.length);  //计算出要存放在的索引值
        for (Entry<K,V> e = table[i]; e != null; e = e.next) {  
            Object k;
            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) { //修改操作
                V oldValue = e.value;
                e.value = value;
                e.recordAccess(this);
                return oldValue;
            }
        }

        modCount++;
        addEntry(hash, key, value, i);
        return null;
    }
```



```java
private V putForNullKey(V value) {
        for (Entry<K,V> e = table[0]; e != null; e = e.next) { 
            if (e.key == null) { //判断索引位置上是否存在key为null的情况，如果存在，就直接修改其value值就可以了
                V oldValue = e.value;  //保存旧的value值
                e.value = value;  //将新的value值覆盖
                e.recordAccess(this);
                return oldValue;  //返回旧的value值
            }
        }
        modCount++;
        addEntry(0, null, value, 0);
        return null; // 因为是添加操作，所以返回null
    }
```



```java
void addEntry(int hash, K key, V value, int bucketIndex) {
        if ((size >= threshold) && (null != table[bucketIndex])) {  //判断是否需要扩容
            resize(2 * table.length);  //扩容原来长度的两倍
            hash = (null != key) ? hash(key) : 0; // 重新计算当前key的hash值2
            bucketIndex = indexFor(hash, table.length);  //重新计算索引
        }

        createEntry(hash, key, value, bucketIndex);
    }
```





```java
void createEntry(int hash, K key, V value, int bucketIndex) {  //添加entry，头插入模式
    Entry<K,V> e = table[bucketIndex]; 
    table[bucketIndex] = new Entry<>(hash, key, value, e);
    size++;
}
```