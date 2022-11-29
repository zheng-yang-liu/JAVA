package ch3;
import java.util.*;
public class lx3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("你是会员吗（是（y/Y）/否（n/N））：");
        String ask = scanner.next();
        System.out.print("请输入购物金额：");
        double amount = scanner.nextDouble();
        double actual;
        if(ask.equals("是") || ask.equals("y") || ask.equals("Y")){
            if(amount>=200){
                actual = amount*0.75;
                System.out.println("实际需花费："+actual+"元");
            }else{
                actual = amount*0.8;
                System.out.println("实际需花费："+actual+"元");
            }
        }else if(ask.equals("否") || ask.equals("n") || ask.equals("N")){
            if(amount>=100){
                actual = amount*0.9;
                System.out.println("实际需花费："+actual+"元");
            }else{
                actual = amount;
                System.out.println("实际需花费："+actual+"元");
            }
        }//刘政阳
    }
}
