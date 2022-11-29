package ch6;
import java.util.*;
public class lx6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 10;i++){
            System.out.print("共10圈，现在跑完了"+i+"还继续吗（y/n）:");
            String answer = scanner.next();
            if(answer.equals("n")){
                System.out.println("退赛");
                break;
            }
        }
    }
}
