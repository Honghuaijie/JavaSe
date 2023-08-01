package come.hong6.package_import;

import java.util.Date;

/**
 * ClassName: ImportTest
 * Package: come.hong6.package_import
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 12:04
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ImportTest {

    //使用import方式指明
    Date date1 = new Date();
    //使用全类名的方式
    java.sql.Date date = new java.sql.Date(121232123);
}
