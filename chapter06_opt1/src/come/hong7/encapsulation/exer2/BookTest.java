package come.hong7.encapsulation.exer2;

/**
 * ClassName: BookTest
 * Package: come.hong7.encapsulation.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 15:29
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class BookTest {
    public static void main(String[] args) {
        Books b1 = new Books();

        b1.setBookName("西游记");
        b1.setAuthor("吴承恩");
        b1.setPrice(99.9);

        b1.show();
    }
}
