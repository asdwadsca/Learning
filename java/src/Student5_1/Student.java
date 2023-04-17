package Student5_1;

class people{
    String name;
    int age;

    void introduceMyself(){
        System.out.println("----------------------");
        System.out.println("My name is"+name+".");
        System.out.println("I am "+age+"year old.");
    }
}
class Student extends people{
    String stuNO;
    int Java;

    void introduceMyself() {
        System.out.println("----------------------");
        System.out.println("My name is"+name+".");
        System.out.println("I am "+age+"year old.");
        //super.introduceMyself();
        System.out.println("我的学号是"+stuNO+".");
        System.out.println("我的Java语言成绩为"+Java+".");
    }
    public static void main(String[]args){
        Student s1=new Student();
        s1.name="liping";
        s1.age=21;
        s1.stuNO="20070901";
        s1.Java=89;
        s1.introduceMyself();
    }
}
