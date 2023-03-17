package TestArrays;
import java.util.Arrays;
import java.util.Scanner;

public class TestArrays {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入5个数字，用空格隔开。");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int num4= sc.nextInt();
        int num5= sc.nextInt();
        int[] arr =new int[]{num1,num2,num3,num4,num5};
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
