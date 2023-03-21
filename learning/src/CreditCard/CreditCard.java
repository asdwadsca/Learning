package CreditCard;

public class CreditCard {
    static int times=0;
    int use;
    public CreditCard(int use){
        this.use=use;
        times++;
    }
    public static void main(String[]args){
        new CreditCard(1);
        System.out.println("您有一次大额消费，交易金额：1550.0元。");
        new CreditCard(2);
        System.out.println("您有一次大额消费，交易金额：1920.0元。");
        new CreditCard(3);
        System.out.println("您有一次大额消费，交易金额：1979.0元。");
        new CreditCard(4);
        System.out.println("您有一次大额消费，交易金额：2259.0元。");
        new CreditCard(5);
        System.out.println("您有一次大额消费，交易金额：1835.0元。");
        new CreditCard(6);
        System.out.println("您有一次大额消费，交易金额：1799.0元。");
        new CreditCard(7);
        System.out.println("您有一次大额消费，交易金额：2688.0元。");
        System.out.println("您最近有"+times+"交易");
    }
}
