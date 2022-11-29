package ch3;
import java.util.*;
public class lx3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你的java成绩：");
        int Jscore = input.nextInt();
        System.out.print("请输入你的音乐成绩：");
        int Mscore = input.nextInt();
        if(Jscore > 90 && Mscore >80 || Jscore ==100 && Mscore >70)
            System.out.println("能获得MP4奖励");
        else
            System.out.println("不能获得MP4奖励");

    }
}
