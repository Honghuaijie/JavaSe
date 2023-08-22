package com.atguigu06.project.team.service;

import com.atguigu06.project.team.doman.PC;
import com.atguigu06.project.team.doman.*;

import static com.atguigu06.project.team.service.Data.*;

/**
 * ClassName: NameListService
 * Package: com.atguigu06.project.team.service
 * Description:公司员工类
 *负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 * @Author honghuaijie
 * @Create 2023/8/19 9:50
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class NameListService {
//    public static void main(String[] args) {
//        NameListService n1 = new NameListService();
//        Employee[] employees = n1.getAllEmployees();
//        try {
//            Employee e1 = n1.getEmployee(11);
//            System.out.println(e1.toString());
//        }catch (TeamException e){
//            e.printStackTrace();
//        }
//    }
    private final Employee[] employees = new Employee[Data.EMPLOYEES.length];


    //传入EQIPMENTS数组的下标，根据下标创建相对于的实现类
    public Equipment createEquipment(int index){
        int type = Integer.parseInt(EQIPMENTS[index][0]);

        String modelOrName = EQIPMENTS[index][1];
        String priceOrDisplayOrType = EQIPMENTS[index][2];
        switch (type){
            case PC: return new PC(modelOrName,priceOrDisplayOrType);
            case NOTEBOOK:return new NoteBook(modelOrName,Double.parseDouble(priceOrDisplayOrType));
            case PRINTER: return new Printer(modelOrName,priceOrDisplayOrType);

        }
        return null;
    }


    public NameListService(){
        System.out.println(1);
        String[][] eString =Data.EMPLOYEES;
        String[][] eqipments = Data.EQIPMENTS;
        Equipment equipment = null;
        for (int i = 0; i < eString.length; i++) {

            int code = Integer.parseInt(eString[i][0]);
            //获取通用的属性
            int id = Integer.parseInt(eString[i][1]);
            String name = eString[i][2];
            int age = Integer.parseInt(eString[i][3]);
            double salary = Double.parseDouble(eString[i][4]);

            switch (code){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);break;
                case PROGRAMMER:
                    employees[i] = new Programmer(id,name,age,salary,createEquipment(i));break;
                case DESIGNER:

                    employees[i] = new Designer(id,name,age,salary,createEquipment(i),Double.parseDouble(eString[i][5]));break;
                case ARCHITECT:

                    employees[i] = new Architect(id,name,age,salary,createEquipment(i),Double.parseDouble(eString[i][5]),Integer.parseInt(eString[i][6]));
            }
        }

    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if(id == employees[i].getId()){
                return employees[i];
            }
        }

        throw new TeamException("找不到指定的员工");

    }


}
