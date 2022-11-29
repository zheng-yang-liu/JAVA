package ch7数组;
import java.util.*;
public class zy7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] math = new int[] {8,4,2,1,23,344,12};
        int sum = 0;
        int sign = 0;//标记
        for (int i = 0; i < math.length; i++) {
            System.out.println("第"+(i+1)+"个数是"+math[i]);
            sum += math[i];
        }
        System.out.println("数列中所有数的和为："+sum);
        System.out.print("请输入您猜的数：");
        int inputmath = scanner.nextInt();
        for(int j=0; j < math.length;j++){
            if(inputmath == math[j]){
                System.out.println("恭喜！数列中有这个数");
                sign =1;
            }
        }
        if(sign == 0){
            System.out.println("很遗憾！数列中没有您猜的数");
        }
    }
}
