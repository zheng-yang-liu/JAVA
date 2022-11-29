package ch3;
import java.util.*;
public class lx3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入小明的成绩：");
        double score = scanner.nextDouble();;
        if (score==100) {
            System.out.println("车");
        }else if (score>=90&&score<100) {
            System.out.println("MP4");
        }else if (score>=60&&score<90){
            System.out.println("参考书");
        }else if (score<60)
            System.out.println("什么都没有GUN");
        }

    }
