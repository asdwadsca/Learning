package IdentityNumber;
import java.util.Scanner;
class IdentityNumber {
    private String Number;
    Scanner sc = new Scanner(System.in);

    public void setNumber() {
        Number= sc.next();
        sc.close();
    }

    public String getNumber() {
        return Number;
    }
    public String getAreaCode(){
        return Number.substring(0,6);
    }
    public String getBirthday(){
        return Number.substring(6,10)+"年"+
                Number.substring(10,12)+"月"+
                Number.substring(12,14)+"日";
    }
}
class test{
    public static void main(String[]args){
        IdentityNumber i1=new IdentityNumber();
        System.out.println("请输入18位身份证号码");
        i1.setNumber();
        System.out.println("输入的身份证号码为："+i1.getNumber());
        System.out.println("地区代码为："+i1.getAreaCode());
        System.out.println("出生年月为："+i1.getBirthday());

    }
}
