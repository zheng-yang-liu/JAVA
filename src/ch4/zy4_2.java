package ch4;
import java.util.*;
public class zy4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double actual;      //转换参加活动后的钱数
        int pd =1;      //定义while循环条件为1时进入
        System.out.print("请输入你的消费金额：");
        double amount = scanner.nextDouble();//买东西的钱数
        if (amount >=50){           //钱数大于等于50才有资格参加活动进入while循环
            while(pd == 1){        //我不会Java的清屏操作暂时只能这样了
                System.out.println("是否参加优惠换购活动：");
                System.out.println("1：满50元，加2元模购百事可乐饮料1瓶");
                System.out.println("2：满100元，加3玩接购500ml可乐一瓶");
                System.out.println("3：满100元，加18元换购5公斤面粉");
                System.out.println("4：满200元，加10元可换购1个苏白尔妙菜锅");
                System.out.println("5：满200元，加20元可换购欧莱雅爽肤水一瓶");
                System.out.println("0：不换购");
                System.out.print("请选择：");
                int xz = scanner.nextInt();
                switch (xz){
                    case 0:
                        actual = amount;    //金额转换
                        System.out.println("本次消费："+actual);
                        System.out.println("您没有选择优惠换购的活动");
                        pd =2;      //结束while循环
                        break;
                    case 1:     //钱数必然大于等于50所以不用判断
                        actual = amount+2;
                        System.out.println("本次消费："+actual);
                        System.out.println("成功换购：百事可乐一瓶");
                        pd =2;     //结束while循环
                        break;
                    case 2:
                        if (amount >=100){
                            actual = amount+3;
                            System.out.println("本次消费："+actual);
                            System.out.println("成功换购：500ml可乐一瓶");
                            pd =2;      //结束while循环
                        }else{
                            System.out.println("抱歉不满足此换购条件");
                            System.out.println("请重新选择您要参加的活动");
                        }
                        break;
                    case 3:
                        if (amount >=100){
                            actual = amount+18;
                            System.out.println("本次消费："+actual);
                            System.out.println("成功换购：5公斤面粉");
                            pd =2;      //结束while循环
                        }else{
                            System.out.println("抱歉不满足此换购条件");
                            System.out.println("请重新选择您要参加的活动");
                        }
                        break;
                    case 4:
                        if (amount >=200){
                            actual = amount+10;
                            System.out.println("本次消费："+actual);
                            System.out.println("成功换购：1个苏泊尔炒菜锅");
                            pd =2;      //结束while循环
                        }else{
                            System.out.println("抱歉您不满足此换购条件");
                            System.out.println("请重新选择您要参加的活动");
                        }
                        break;
                    case 5:
                        if (amount >=200){
                            actual = amount+20;
                            System.out.println("本次消费："+actual);
                            System.out.println("成功换购：欧莱雅舒服水一瓶");
                            pd =2;      //结束while循环
                        } else{
                            System.out.println("抱歉您不满足此换购条件");
                            System.out.println("请重新选择您要参加的活动");
                        }
                        break;
                    default:
                        System.out.println("不合法选择");
                        System.out.println("请重新选择您要参加的活动");
                        break;
                }
            }
        }else{
            System.out.println("本次消费："+amount);
            System.out.println("不满足换购资格");
        }
    }
}//刘政阳
