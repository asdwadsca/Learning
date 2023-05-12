package exc.num;

import java.util.Scanner;
public class num {
    static int sum(int n){
        int sum=0;
        int x=0,y=0,a;
        if(n%2==1){
            for (a=1;a<=n;a+=2){
                int z=1/a;
                x+=z;
            }
            for (a=2;a<=n-1;a+=2){
                int c=1/a;
                y=(-1)*(y+c);
            }
            sum=x+y;
        } else if (n%2==0) {
            for (a=1;a<=n-1;a+=2){
                int z =1/a;
                x+=z;
            }
            for (a=2;a<=n;a+=2){
                int c=1/a;
                y=(-1)*(y+c);
            }
            sum=x+y;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个正整数：");
        int x= sc.nextInt();
        System.out.println(sum(x));
    }
}
