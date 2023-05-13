package exc.StudentManage;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    public Student(){}
    private String name, sid, age, address;

    public String getName() {
        return name;
    }

    public String getSid() {
        return sid;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


public class StudentManage {
    public static void main(String[]args){
        ArrayList<Student> arrayList = new ArrayList<>();
        while(true){
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择:");
            Scanner sc =new Scanner(System.in);
            int line = sc.nextInt();
            switch (line) {
                case 1 -> {
                    System.out.println("添加学生");
                    addStudent(arrayList);
                }
                case 2 -> {
                    System.out.println("删除学生");
                    deleteStudent(arrayList);
                }
                case 3 -> {
                    System.out.println("修改学生");
                    updateStudent(arrayList);
                }
                case 4 -> {
                    System.out.println("查看所有学生");
                    findAllStudent(arrayList);
                }
                case 5 -> {
                    System.out.println("谢谢使用");
                    System.exit(-1);
                }
            }
        }
    }
    public static void addStudent(ArrayList<Student>arrayList){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号:");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄:");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地:");
        String address = sc.nextLine();

        Student temp = new Student();
        temp.setSid(sid);
        temp.setName(name);
        temp.setAge(age);
        temp.setAddress(address);

        arrayList.add(temp);
        System.out.println("添加学生成功!");
    }
    public static void findAllStudent(ArrayList<Student> arrayList){
        if (arrayList.size() == 0){
            System.out.println("无信息，请添加后查询!");
        }
        System.out.println("学号\t\t 姓名\t\t\t 年龄\t\t 居住地");
        for (Student temp : arrayList) {
            System.out.println(temp.getSid() + "\t\t" +
                    temp.getName() + "\t\t" +
                    temp.getAge() + "岁\t" +
                    temp.getAddress()
            );
        }
    }
    public static void deleteStudent(ArrayList<Student> arrayList){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号:");
        String sid = sc.nextLine();
        for (Student s : arrayList) {
            if (s.getSid().equals(sid)){
                arrayList.remove(s);
                break;
            }
        }
        System.out.println("删除成功");
    }
    public static void updateStudent(ArrayList<Student> arrayList){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号:");
        String sid = sc.nextLine();
        System.out.println("请输入学生的新姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄:");
        String age = sc.nextLine();
        System.out.println("请输入学生的新居住地");
        String address = sc.nextLine();

        Student temp = new Student();
        temp.setSid(sid);
        temp.setName(name);
        temp.setAge(age);
        temp.setAddress(address);

        for (int i = 0; i<arrayList.size(); i++){
            Student student = arrayList.get(i);
            if (student.getSid().equals(sid)){
                arrayList.set(i,temp);
                break;
            }
        }
        System.out.println("修改成功!");
    }
}