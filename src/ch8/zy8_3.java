package ch8;
import java.util.*;
public class zy8_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[] money=new double[3];
        int count;
        for (int i = 0; i <3;i++) {
            count=0;
            System.out.println("请输入第"+(i+1)+"个人所购三个商品的价格：");
            for(int j=0;j<3;j++){
                money[j]=scanner.nextDouble();
                if(money[j]<300){
                    continue;
                }
                count++;
            }
            System.out.println("第"+(i+1)+"个人共有"+count+"件商品享受8折优惠");
        }
    }
}
