package ch6;
import java.util.*;
public class zy6_1 {
    public static void main(String[] args) {
        double avg;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生姓名:");
        String name = scanner.next();
        for (int i = 0; i <5;i++) {
            System.out.print("请输入5门课的第"+(i+1)+"门课的成绩：");
            double achievement=scanner.nextDouble();
            if (achievement <0){
                System.out.println("输入错误");
                break;
            }else{
                sum += achievement;
            }
        }
        avg =sum/5;
        System.out.println(name+"的平均成绩为："+avg);
    }
}
