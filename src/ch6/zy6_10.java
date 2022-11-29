package ch6;
import java.util.*;
public class zy6_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int math;
        int idname;
        int age;
        int integral;
        System.out.print("青鸟游迷你戏平台>" +"添加用户信息\n");
        System.out.print("请输入要录入数量");
        math=scanner.nextInt();
        for (int i=0; i<math; i++) {
            System.out.print("请输入用户编号<四位整数>：");
            idname=scanner.nextInt();
            if(idname<1000 || idname>9999){
                System.out.println("录入错误");
                continue;
            }else{
                System.out.print("请输入用户年龄：");
                age=scanner.nextInt();if(age<10){
                    System.out.println("很抱歉您的年龄不适合玩游戏。");
                    continue;
                }
                System.out.print("请输入会员积分：");
                integral=scanner.nextInt();
                System.out.println("您录入的会员信息是:");
                System.out.println("用户编号：  "+idname+"年龄：  "+age+"会员积分：  "+integral);
            }
            }



    }
}
