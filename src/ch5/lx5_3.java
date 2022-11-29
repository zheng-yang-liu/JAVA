package ch5;
import java.util.*;
public class lx5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("今天的学习任务是否完成(y/n)：");
        String ask = scanner.next();
        while(!ask.equals("y")){
            System.out.println("上午阅读教材，学习理论部分\n下午上机编程，掌握代码部分");
            System.out.print("今天的学习任务是否完成(y/n)：");
            ask =scanner.next();
        }
    }
}
