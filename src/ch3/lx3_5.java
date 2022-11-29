package ch3;
import java.util.*;
public class lx3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你的跑步成绩：");
        double seconds=input.nextDouble();
        if(seconds<10){
            System.out.print("请输入你的性别（男/女）：");
            String space=input.nextLine();//吸收空格
            String sex=input.nextLine();
            if(sex.equals("男")){
                System.out.println("恭喜你进入男生组决赛");
            }else if(sex.equals("女")){
                System.out.println("恭喜你进入女生组决赛");
            }else{
                System.out.println("请好好填写信息");
            }
        }else{
            System.out.println("很遗憾淘汰了");
        }
    }
}
