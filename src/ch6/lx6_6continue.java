package ch6;
import java.util.*;
public class lx6_6continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;//80以上
        int total;//班级人数
        double score;//分数
        System.out.print("请输入班级人数：");
        total = scanner.nextInt();
        for (int i = 1; i <= total; i++) {
            System.out.println("请输入"+i+"位同学的成绩");
            score = scanner.nextInt();
            if (score <80){
                System.err.println("分数低于80不进行优秀记录");
                continue;
            }else{
                //分数大于80进行记录
                count++;
            }
        }
        System.out.println("80分以上的有"+count+"人");
        double rate = count*1.0/total*100;
        System.out.println("80分以上的同学占"+rate+"%");
    }
}
