package ch3;
import java.util.*;
public class lx3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入确诊病例：");
        int news = input.nextInt();

        System.out.print("请输入隔离天数：");
        int isolation = input.nextInt();

        System.out.print("请输入无外出天数：");
        int goout = input.nextInt();

        if(news == 0 && isolation >= 7 || goout == 14 && news == 0)
            System.out.println("能返校");
        else
            System.out.println("不能返校");
    }
}
