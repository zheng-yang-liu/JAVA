package ch7数组;
import java.util.*;
public class zy7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] money = new double[4];
        System.out.println("请输入4家店的价格");
        for(int i=0; i<4;i++) {
            System.out.print("第"+(i+1)+"家店的价格：");
            money[i]=scanner.nextDouble();
        }
        double min=money[0];
        for(int j=0; j<4; j++) {
            if(min > money[j]){
                min = money[j];
            }
        }
        System.out.println("最低价格为："+min);
    }
}
