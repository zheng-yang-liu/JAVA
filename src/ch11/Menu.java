package ch11;
import java.util.*;
public class Menu {
    //    实现显示登录菜单
    public void showLoginMenu() {
        Scanner scanner = new Scanner(System.in);
        String name;
        String password;
        System.out.println("登录菜单");
        System.out.println("1、登录菜单");
        System.out.println("2、退出");
        System.out.println("****************************");
        System.out.print("请选择：");
        switch (Choice()) {
            case 1:
                System.out.print("请输入用户名：");
                name = scanner.next();
                System.out.print("请输入密码：");
                password = scanner.next();
                if (name.equals("admin") && password.equals("12345")) {
                    showMainMenu();
                } else {
                    System.out.println("用户名或密码错误");
                    showLoginMenu();
                }
                break;
            case 2:
                System.out.println("已退出");
                break;
        }
    }
    //    实现显示主菜单
    public void showMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("主菜单");
        System.out.println("1、客户信息管理");
        System.out.println("2、真情回顾");
        System.out.println("****************************");
        System.out.print("请选择：（输入0返回上一级）");
        switch (Choice()) {
            case 0:
                showLoginMenu();
                break;
            case 1:
                showCustMenu();
                break;
            case 2:
                showSendGMenu();
                break;
        }
    }
    //    实现显示客户信息管理菜单
    public void showCustMenu() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("客户信息管理菜单");
        System.out.println("****************************");
        System.out.print("请选择：（输入0返回上一级）");
        switch (Choice()){
            case 0:
                showSendGMenu();
                break;
        }
    }

    //    实现显示真情回馈菜单
    public void showSendGMenu() {
        System.out.println("****************************");
        System.out.println("真情回馈菜单");
        System.out.println("1、幸运大放送");
        System.out.println("2、客户抽奖");
        System.out.println("3、生日快乐");
        System.out.println("****************************");
        System.out.print("请选择：（输入0返回上一级）");
        switch (Choice()){
            case 0:
                showSendGMenu();
                break;
            case 1:
                System.out.println("幸运大放送");
                break;
            case 2:
                System.out.println("客户抽奖");
                break;
            case 3:
                System.out.println("生日快乐");
                break;
        }
    }
    public int Choice(){
        Scanner scanner=new Scanner(System.in);
        int choice;
        choice =scanner.nextInt();
        return choice;

    }


}