package Pool;

public class Pool {
    static int water=0;
    String AddWater;
    public Pool(String AddWater){
        this.AddWater=AddWater;
        water+=3;
    }
    public static void main(String[]args){
        new Pool("once");
        System.out.println("池里现在有水"+ water+"单位");
        new Pool("twice");
        System.out.println("池里现在有水"+ water+"单位");
    }
}
