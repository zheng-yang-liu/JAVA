package ch4;
import java.util.*;
public class lx4_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的名次：");
        int mc = scanner.nextInt();
        switch (mc){
            case 1:
                System.out.println("参加夏令营");
                break;
            case 2:
                System.out.println("奖励笔记本");
                break;
            case 3:
                System.out.println("奖励移动移动硬盘");
                break;
            default:
                System.out.println("什么都没有");
                break;
        }
    }
}
