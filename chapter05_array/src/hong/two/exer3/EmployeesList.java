package hong.two.exer3;

/**
 * ClassName: EmployeesList
 * Package: hong.two.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/25 10:46
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class EmployeesList {
    public static void main(String[] args) {
        String[][] employees = {
                {"10", "1", "段 誉", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"11", "3", "任我行", "23", "7000"},
                {"11", "4", "张三丰", "24", "7300"},
                {"12", "5", "周芷若", "28", "10000", "5000"},
                {"11", "6", "赵 敏", "22", "6800"},
                {"12", "7", "张无忌", "29", "10800","5200"},
                {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨 过", "26", "9800", "5500"},
                {"11", "10", "小龙女", "21", "6600"},
                {"11", "11", "郭 靖", "25", "7100"},
                {"12", "12", "黄 蓉", "27", "9600", "4800"}
        };

        System.out.println("员工类型\t\t编号\t\t姓名\t\t\t年龄\t\t薪资\t\t\t奖金\t\t\t股票");
        String employeesType="" ;
        for (int i = 0; i < employees.length; i++) {
            switch (employees[i][0]){
                case "10":employeesType = "普通职员";break;
                case "11":employeesType = "程序员";break;
                case "12":employeesType = "设计师";break;
                case "13":employeesType = "架构师";
            }
            System.out.print(employeesType + "\t\t");

            for (int j = 1; j < employees[i].length; j++) {
                System.out.print(employees[i][j] + "\t\t");
            }
            System.out.println();
        }

    }
}
