package exc.JavaGrade;


import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;


public class Grade {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();
    ArrayList<Integer> list4 = new ArrayList<>();
    ArrayList<Integer> list5 = new ArrayList<>();
    ArrayList<Integer> list6 = new ArrayList<>();
    ArrayList<Integer> list7 = new ArrayList<>();
    ArrayList<Integer> list8 = new ArrayList<>();
    ArrayList<Integer> list9 = new ArrayList<>();
    ArrayList<Integer> list10 = new ArrayList<>();
    ArrayList<Integer> list11 = new ArrayList<>();


    //获取输入的成绩并将其加入动态数组list，再按从大到小排序
    public void input() {
        for (int i = 0; i < 40; i++) {
            int a = sc.nextInt();
            if (a > 100 || a < 0) i = 40;
            list.add(a);
        }
        list.sort(Comparator.reverseOrder());
    }


    //将list中的参数按条件分类后加入到相应的动态数组
     public void sort() {
         list.forEach((e) -> {
             if (e == 100) {
                 list1.add(e);
             } else if (e <= 99 && e >= 90) {
                 list2.add(e);
             } else if (e <= 89 && e >= 80) {
                 list3.add(e);
             } else if (e <= 79 && e >= 70) {
                 list4.add(e);
             } else if (e <= 69 && e >= 60) {
                 list5.add(e);
             } else if (e <= 59 && e >= 50) {
                 list6.add(e);
             } else if (e <= 49 && e >= 40) {
                 list7.add(e);
             } else if (e <= 39 && e >= 30) {
                 list8.add(e);
             } else if (e <= 29 && e >= 20) {
                 list9.add(e);
             } else if (e <= 19 && e >= 10) {
                 list10.add(e);
             } else if (e <=9 && e >= 0 ) {
                 list11.add(e);
             }
         });
     }


    //按条件输出相应动态数组中的参数
    public void output(){
        System.out.print("100:");
        list1.forEach((e)-> System.out.print(e+" "));
        System.out.print("\n99-90:");
        list2.forEach((e)-> System.out.print(e+" "));
        System.out.print("\n89-80:");
        list3.forEach((e)-> System.out.print(e+" "));
        System.out.print("\n79-70:");
        list4.forEach((e)-> System.out.print(e+" "));
        System.out.print("\n69-60:");
        list5.forEach((e)-> System.out.print(e+" "));
        System.out.print("\n59-50:");
        list6.forEach((e)-> System.out.print(e+" "));
        System.out.print("\n49-40:");
        list7.forEach((e)-> System.out.print(e+" "));
        System.out.print("\n39-30");
        list8.forEach((e)-> System.out.print(e+" "));
        System.out.print("\n29-20");
        list9.forEach((e)-> System.out.print(e+" "));
        System.out.print("\n19-10:");
        list10.forEach((e)-> System.out.print(e+" "));
        System.out.print("\n9-0:");
        list11.forEach((e)-> System.out.print(e+" "));
    }


    //主函数
    public static void main(String[] args) {
        Grade g1=new Grade();
        g1.input();
        g1.sort();
        g1.output();
    }
}