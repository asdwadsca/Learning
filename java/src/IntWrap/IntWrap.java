package IntWrap;

public class IntWrap {
    private int i;

    public IntWrap(int i){
        this.i=i;
    }
    public String showNumber(){
        return "\n 二进制："+Integer.toBinaryString(i)+
                "\n八进制："+Integer.toOctalString(i)+
                "\n十六进制："+Integer.toHexString(i);
    }

    public static void main(String[] args){
        int t=Integer.parseInt(args[0]);
        IntWrap c=new IntWrap(t);
        System.out.println("十进制："+t+c.showNumber());
    }
}
