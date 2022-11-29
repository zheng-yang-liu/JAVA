package ch8;

import java.util.*;

public class zy8_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputPass;
        int money;
        int sing=0;//标记
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入密码：");
            inputPass=scanner.nextInt();
            if(inputPass==111111){
                while(true){
                    System.out.print("请输入金额；");
                    money=scanner.nextInt();
                    if(money %100 ==0 && money>=0 && money<=1000){
                        System.out.println("您取了"+money+"元");
                        System.out.println("交易完成，请取卡！");
                        sing=1;
                        break;
                    }else{
                        System.out.print("您输入的金额不合法，");
                    }
                }
            }
            //循环3次且都出错进入
            if(i==2 && sing==0){
                System.out.println("密码错误，请取卡");
            }
            if(sing==1){
                break;
            }
        }
    }
}
