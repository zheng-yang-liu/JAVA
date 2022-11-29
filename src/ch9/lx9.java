package ch9;

import java.util.Scanner;

public class lx9 {
    String name;
    int age;

    public void showInfo(){
        if(age>=13 &&age<=59){
            System.out.println(name+"的年龄为"+age+",门票为60元");
        }else{
            System.out.println(name+"的年龄为"+age+",免费");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            lx9 youke =new lx9();
            System.out.print("请输入姓名：");
            youke.name= scanner.next();
            if (youke.name.equals("n")){
                System.out.println("退出程序");
                break;
            }
            System.out.print("请输入年龄：");
            youke.age= scanner.nextInt();
            youke.showInfo();
        }
    }
}
