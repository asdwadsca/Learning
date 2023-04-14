package exc.Cat;


import java.awt.*;

class cat {
    private String name;
    private int age;
    private double weight;
    private Color color;

    public cat(String name, int age, double weight, Color color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color=color;
    }
    public String toString(){
        return "名字："+name+'\n'+"年龄："+age+'\n'+"重量："+weight+'\n'+"颜色："+color+'\n';
    }
}
class Test{
    public static void main(String[]args) {
        cat c1 = new cat("Java", 12, 21.0, Color.BLACK);
        cat c2 = new cat("C++", 12, 21.0, Color.white);
        cat c3 = new cat("Java", 12, 21.0,Color.BLACK);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}

