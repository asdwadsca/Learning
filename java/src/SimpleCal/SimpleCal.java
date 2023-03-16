package SimpleCal;
class SimpleCal {
    private int operand1,operand2;
    private char operator;

    SimpleCal(){}

    SimpleCal(int operand1,char operator,int operand2){
        this.operand1=operand1;
        this.operand2=operand2;
        this.operator=operator;
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
        System.out.println("运算结果；"+operand1+operator+operand2+"="+cal());
    }
    public static void main(String[]args){
        if (args.length!=3){
            System.out.println("请使用格式：java SimpleCal 操作数1 运算符 操作数2");
            System.out.println("例如java SimpleCal3+4");
            System.out.println("注意：操作数和运算符之间要用空格分隔。");
            System.exit(-1);
        }
        SimpleCal exp=new SimpleCal(Integer.parseInt(args[0]),
                args[1].charAt(0),
                Integer.parseInt(args[2]));
        exp.showResult();
    }
}