package InterfaceTest;
interface Cal {
    int cal(int a,int b);
}
public class test {
    public static void main(String[]args){
        Cal add=(a, b) -> {
            return a + b;
        };
        Cal subtract=(a, b) -> {
          return a-b;
        };
        Cal multiply=(a,b)->{
            return a*b;
        };
        int result1=add.cal(2,3);
        int result2= subtract.cal(3,2);
        int result3= multiply.cal(2,3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
