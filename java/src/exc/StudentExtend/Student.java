package exc.StudentExtend;

class Person{
    String name, age, sex;
    Person(){}

    public Person(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
public class Student extends Person{
    String name, age, sex;
    double English, Math;


    public Student(String name, String age, String sex) {
        super(name, age, sex);
    }

    public Student(String name, String age, String sex, double english, double math){
        this.age=age;
        this.English=english;
        this.name=name;
        this.sex=sex;
        this.Math=math;
    }

    public String toString(){
        return "我叫"+name+","+sex+",今年"+age+"岁";
    }
    double avg(){
        return (English+Math)/2;
    }
}
class Test{
    public static void main(String[]args){
        Student s1= new Student("Tom","18","男性",90,90);
        System.out.println(s1);
        Student s2=new Student("Jack","18","男性",90,90);
        System.out.print(s2);
        System.out.println(",平均成绩为"+s2.avg());
        Student[] a=new Student[]{s1, s2};
        for (Student i:a) {
            System.out.println(i);
        }
    }
}