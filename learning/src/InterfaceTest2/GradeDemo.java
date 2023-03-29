package InterfaceTest2;
import java.util.Scanner;
interface CheckGrade{
    String check(int grade);
}

public class GradeDemo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        CheckGrade g=(n)->{
          if (n>=90&&n<=100){
              return "A";
          } else if (n>=80&&n<90) {
              return "B";
          } else if (n>=60&&n<80) {
              return "C";
          } else if (n>=0&&n<60) {
              return "D";
          }else {
              return "wrong";
          }
        };
        System.out.println(g.check(sc.nextInt()));
        sc.close();
    }
}

