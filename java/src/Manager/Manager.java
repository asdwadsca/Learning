package Manager;

class Employee{
    protected String employeeNumber;
    protected String name;
    protected String address;

    public Employee(){
        this("","","");
    }

    public Employee(String employeeNumber, String name, String address) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.address = address;
    }

    protected void showEmployee(){
        System.out.println("---------------");
        System.out.println("员工编号:"+employeeNumber);
        System.out.println("姓名:"+name);
        System.out.println("地址:"+address);
    }
}

public class Manager extends Employee{
    protected String department;

    public Manager(){
        this("","","","");
    }

    public Manager(String employeeNumber, String name, String address, String department) {
        super(employeeNumber, name, address);
        this.department = department;
    }
    protected void showManager(){
        super.showEmployee();
        System.out.println("管理的部门:"+department);
    }
}
class TestManager{
    public static void main(String[]args){
        Employee e=new Employee("100010","Zhangping","zhong shan road");
        e.showEmployee();

        Manager m=new Manager("100001","ZhangFan","dong fang hong road","market");
        m.showManager();
    }
}