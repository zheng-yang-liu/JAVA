package ch6;
import java.util.*;
public class zy6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chouse;
        System.out.print("欢迎进入青鸟游迷你戏平台\n" +"请选择您喜爱的游戏:\n");
        System.out.println("*****************************");
        System.out.println("1．斗地主");
        System.out.println("2．斗牛");
        System.out.println("3．泡泡龙");
        System.out.println("4．连连看");
        System.out.println("*****************************");
        System.out.print("请选择,输入数字：");
        chouse=scanner.nextInt();
        switch (chouse){
            case 1 :
                System.out.println("您已进入斗地主房间！");
                break;
            case 2 :
                System.out.println("您已进入斗牛房间！");
                break;
            case 3 :
                System.out.println("您已进入泡泡龙房间！");
                break;
            case 4 :
                System.out.println("您已进入连连看房间！");
                break;
        }

    }
}
