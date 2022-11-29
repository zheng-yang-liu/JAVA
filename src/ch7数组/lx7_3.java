package ch7数组;
import java.util.*;
public class lx7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] javacore = new int[5];
        int sum = 0;
        for (int i = 0; i < javacore.length;i++) {
            System.out.print("请输入"+(i+1)+"位的java成绩：");
            javacore[i] = scanner.nextInt();
            sum += javacore[i];
        }
        System.out.println(javacore.length+"位总成绩为："+sum);
        System.out.println(javacore.length+"位平均成绩为："+sum*1.0/javacore.length);

    }
}
