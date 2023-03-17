package SimpleCalScanner;
import java.util.Scanner;
class SimpleCal {
    private int operand1,operand2;
    private char operator;
    Scanner sc=new Scanner(System.in);

    public SimpleCal(){}

    public void setOperand1(){
        operand1= sc.nextInt();
    }

    public void setOperand2() {
        operand2= sc.nextInt();
        sc.close();
    }

    public void setOperator(){
       operator=sc.next().charAt(0);
    }

    private int cal(){
        int result=Integer.MIN_VALUE;
        if(operator=='+')
            result=operand1+operand2;
        else if (operator=='-')
            result=operand1-operand2;
        else if (operator=='*')
            result=operand1*operand2;
        else if (operator=='/'){
            if(operand2==0){
                System.out.println("分母不能为0！");
                System.exit(-1);
            }
            result=operand1/operand2;
        }
        else {
            System.out.println("输入的运算符错误！");
            System.exit(-1);
        }
        return result;
    }
    public void showResult(){
        System.out.println("运算结果："+operand1+operator+operand2+"="+cal());
    }
    public static void main(String[]args){
        SimpleCal s1=new SimpleCal();
        System.out.println("请输入算式。");
        System.out.println("格式“1 + 2“注意要用空格隔开。");
        s1.setOperand1();
        s1.setOperator();
        s1.setOperand2();
        s1.cal();
        s1.showResult();
    }
}
