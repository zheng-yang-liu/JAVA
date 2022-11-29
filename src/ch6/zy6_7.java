package ch6;
import java.util.*;
public class zy6_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("青鸟游迷你戏平台>" +"游戏晋级\n");
        String select;
        int score;
        int math=0;
        double probability;
        for (int i = 0; i < 5;i++) {
            System.out.print("您正在玩第"+(i+1)+"局，成绩为：");
            score = scanner.nextInt();
            if((i+1)<5){
                if (score>80){
                    math++;
                }
                System.out.println("继续下一局吗？（yes/no）");
                select = scanner.next();
                if(select.equals("yes")) {
                    System.out.println("进入下一局游戏");
                }else{
                    System.out.println("您已经中途遇出游戏。");
                    break;
                }
            }else{
                if (score>80){
                    math++;
                }
                System.out.println("已完成全部游戏！");
            }
        }
        probability=math*1.0/5*100;
        if(probability>=80){
            System.out.println("恭喜！通过一级");
        }else if(probability>=60){
            System.out.println("恭喜！通过二级");
        }else{
            System.out.println("对不起,您未能晋级,继续加油啊!");
        }
    }
}
