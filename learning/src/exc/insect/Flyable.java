package exc.insect;

public interface Flyable {
    void fly();
}
abstract class Insect {
    int legs;
    public Insect(int legs){
        this.legs=legs;
    }
    abstract void reproduce();
}
class Fly extends Insect implements Flyable{
    public Fly(int legs){
        super(legs);
        System.out.println("苍蝇有"+legs+"条腿");
    }

    @Override
    void reproduce() {
        System.out.println("苍蝇的繁殖方式是产卵");
    }

    @Override
    public void fly() {
        System.out.println("苍蝇可以在空中飞行");
    }
}
class Test{
    public static void main(String[]args){
        Fly f1 = new Fly(6);
        f1.fly();
        f1.reproduce();
    }
}
