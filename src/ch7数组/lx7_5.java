package ch7数组;
import java.util.*;
public class lx7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] money = new double[5];
        double sum = 0;
        System.out.println("请输入消费记录");
        for(int i = 0; i<money.length; i++) {
            System.out.print("请输入第"+(i+1)+"笔金额：");
            money[i]= scanner.nextDouble();
        }
        System.out.println("序号\t\t\t\t金额（元）");
        for(int i = 0; i<money.length; i++) {
            sum+=money[i];
            System.out.println((i+1)+"\t\t\t\t"+money[i]);
        }
        System.out.println("总金额\t\t\t"+sum);
    }
}
