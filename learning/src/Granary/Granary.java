package Granary;

public class Granary {
    public static void main(String[]args){
    int diameter=10,height=3;
    final double PI=3.1415;
    double volume=diameter/2.0*diameter/2.0*PI*height;
    double reserves =volume*750;
        System.out.println("该粮仓体积为："+volume);
        System.out.println("该粮仓能存储粮食："+reserves+"千克");
    }
}
