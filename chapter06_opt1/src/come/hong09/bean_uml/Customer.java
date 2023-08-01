package come.hong09.bean_uml;

/**
 * ClassName: Customer
 * Package: come.hong09.bean_uml
 * Description:
 * 所谓Javabean：是指符合如下条件标准的Java类：
 *
 * -类是公共的
 * -有一个无参的公共的构造器
 * -有属性，且有对应的get、set方法
 *
 * @Author honghuaijie
 * @Create 2023/8/1 18:54
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Customer {
    private  int id ;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
