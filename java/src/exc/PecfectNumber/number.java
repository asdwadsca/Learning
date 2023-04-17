package exc.PecfectNumber;

import java.util.Scanner;

public class number {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个整数:");
        int temp= sc.nextInt();
        int i, j, sum;
        for (i=1;i<temp;i++){
            sum=0;
            for (j=1;j<i/2+1;j++){
                if (i%j==0){
                    sum+=j;
                }
            }
            if (sum==i) {
                System.out.print(i+"factor are:");
                for (j=1;j<i/2+1;j++){
                    if (i%j==0){
                        System.out.print(j+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
