package ch6;
import java.util.*;
public class zy6_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("青鸟游迷你戏平台>" +"游戏点击率\n");
        int click;
        int count = 0;
        double probability;
        for (int i = 0; i <4;i++) {
            System.out.print("请输入第"+(i+1)+"个游戏的点击率：");
            click = scanner.nextInt();
            if(click >100){
                count++;
            }
        }
        probability=count*1.0/4*100;
        System.out.println("点击率大于100的游戏个数是："+count);
        System.out.println("点击率大于100的游戏所占比率为："+probability+"%");


    }
}
