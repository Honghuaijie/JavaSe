package come.hong7.encapsulation.exer2;

/**
 * ClassName: Books
 * Package: come.hong7.encapsulation.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 15:23
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Books {
    private String bookName;
    private String author;
    private double price;

    // bookName的set方法
    public void setBookName(String bn){
        bookName = bn;
    }
    //bookName的get方法
    public String getBookName(){
        return bookName;
    }

    // author的set方法
    public void setAuthor(String at){
        author = at;
    }
    //author的get方法
    public String getAuthor(){
        return author;
    }

    // price的set方法
    public void setPrice(double pr){
        price = pr;
    }
    //price的get方法
    public double getPrice(){
        return price;
    }

    //图书信息介绍
    public void show(){
        System.out.println("bookName：" + getBookName() + " author："
                            + getAuthor() + " price：" + getPrice() );
    }
}
