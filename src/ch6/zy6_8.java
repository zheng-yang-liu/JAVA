package ch6;
import java.util.*;
public class zy6_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chouse;
        double time;
        double money;
        System.out.print("青鸟游迷你戏平台>" +"游戏币支付\n");
        System.out.println("请选择您的游戏类型：");
        System.out.println("1．牌类");
        System.out.println("2．休闲竞技类");
        System.out.print("请选择,输入数字：");
        chouse=scanner.nextInt();
        switch (chouse){
            case 1:
                System.out.println("请输入您的游戏时常：");
                time = scanner.nextInt();
                if(time>10){
                    money=(10*time)*0.5;
                    System.out.println("您玩的是牌类特戏，时长是："+time+"小时，\n可以享受5折优真您需要支付"+money+"个游币");
                }else{
                    money=(10*time)*0.8;
                    System.out.println("您玩的是牌类特戏，时长是："+time+"小时，\n可以享受8折优真您需要支付"+money+"个游币");
                }
                break;
            case 2:
                System.out.println("请输入您的游戏时常：");
                time = scanner.nextInt();
                if(time>10){
                    money=(20*time)*0.5;
                    System.out.println("您玩的是休闲商技类特戏，时长是："+time+"小时，\n可以享受5折优真您需要支付"+money+"个游币");
                }else{
                    money=(20*time)*0.8;
                    System.out.println("您玩的是休闲商技类特戏，时长是："+time+"小时，\n可以享受8折优真您需要支付"+money+"个游币");
                }
                break;
        }
    }
}
