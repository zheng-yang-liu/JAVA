package ch3;
import java.util.*;
public class lx3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你期末的成绩");
        int score = input.nextInt();
        if (score>=80)
            System.out.println("成绩测评结果：良好");
        else if (score>=60)
            System.out.println("成绩测评结果：中等");
        else
            System.out.println("成绩测评结果：差");
    }
}
