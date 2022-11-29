package ch11;
import java.util.*;
public class inputcj {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        jisuan js =new jisuan();
        System.out.print("请输入java成绩:");
        js.java= scanner.nextDouble();
        System.out.print("请输入C成绩:");
        js.c= scanner.nextDouble();
        System.out.print("请输入db成绩:");
        js.db= scanner.nextDouble();
        System.out.println("总成绩绩是："+js.showadd());
        System.out.println("平均总成成绩是："+js.showavg());
        System.out.println("平均总成成绩是："+String.format("%.2f", js.showavg()));

    }
}
