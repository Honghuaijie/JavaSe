package com.atguigu04.compare;

/**
 * @author shkstart
 * @create 11:45
 */
public class Product implements Comparable{ //商品类

    private String name;//商品名称
    private double price;//价格

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    /**
     * 当前的类需要实现Comparable中的抽象方法：CompareTo（object o）
     * 在此方法中，指明如何判断当前类的对象的大小，比如按照价格的高低进行大小比较
     * @param o the object to be compared.
     * @return 返回值为正数，当前对象大，
     *          返回值为负数，当前对象小，
     *          返回值为0，一样大，
     */

//    @Override
//    public int compareTo(Object o) {
//        if(o == this){
//            return 0;
//        }
//
//        if (o instanceof Product){
//            Product product = (Product) o;
//            return  Double.compare(price, product.price);
//        }
//
//        throw new RuntimeException("类型不匹配");
//    }

    //当价格相等时，比较名字
    @Override
    public int compareTo(Object o) {
        if(o == this){
            return 0;
        }

        if (o instanceof Product){
            Product product = (Product) o;
            int value =   Double.compare(product.price, price);
            if (value !=0){
                return value;
            }

            return this.name.compareTo(product.name);
        }

        throw new RuntimeException("类型不匹配");
    }
}
