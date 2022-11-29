package ch5;
import java.util.*;
public class do_while {
    public static void main(String[] args) {
//        do_while先进行循环操作在进行循环条件
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("上机编写程序");
            System.out.println("合格了吗？（y/n）");
            answer=scanner.next();
        }while(!answer.equals("Y"));
    }
}
