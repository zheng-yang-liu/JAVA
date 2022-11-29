package ch4;
import java.util.*;
public class lx4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******登录菜单*******");
        System.out.println("1、登录系统");
        System.out.println("2、退出");
        System.out.println("*********************");
        System.out.print("请选择：");
        if(scanner.hasNextInt()){
            int xz1 = scanner.nextInt();
            switch (xz1) {
                case 1:
                    System.out.println("*******主菜单*******");
                    System.out.println("1.客户信息管理");
                    System.out.println("2.购物结算");
                    System.out.println("3.真情回馈");
                    System.out.println("4.注销");
                    int xz2 = scanner.nextInt();
                    System.out.print("请选择：");
                    switch (xz2) {
                        case 1:
                            System.out.println("*******选择了.客户信息管理*******");
                            break;
                        case 2:
                            System.out.println("*******选择了.购物结算*******");
                            break;
                        case 3:
                            System.out.println("*******选择了.真情回馈*******");
                            break;
                        case 4:
                            System.out.println("*******选择了.注销*******");
                            break;
                        default:
                            System.out.println("输入不合法");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("选择了注销功能");
                    break;
                default:
                    System.out.println("输入不合法");
                    break;
            }
        }else{
            System.out.println("你输入的不是数字");
        }
    }
}
