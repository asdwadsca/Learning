package exc.JavaGrade;

import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;


public class Grade {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list1 = new ArrayList<>();
    public void input() {
        for (int i = 1; i < 40; i++) {
            int a = sc.nextInt();
            if (a > 100 || a < 0) i = 41;
            list1.add(a);
        }
        list1.sort(Comparator.reverseOrder());
        list1.forEach((e)->{
            if (e==100){
                ArrayList<Integer> grade100=new ArrayList<>();
                grade100.add(e);

            } else if (e<99&&e>90) {
                ArrayList<Integer> grade90=new ArrayList<>();
                grade90.add(e);
            } else if (e<89&&e>80) {
                ArrayList<Integer> grade80=new ArrayList<>();
                grade80.add(e);
            }
        });

    }

    public static void main(String[] args) {
        Grade g1=new Grade();
        g1.input();
    }
}
