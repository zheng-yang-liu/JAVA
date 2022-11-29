package ch6;
import java.util.*;
public class zy6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5;i++) {
            System.out.println("请输入姓名：");
            String name = scanner.next();
            System.out.print("请输入性别：");
            String sex = scanner.next();
            System.out.print("请输入学号：");
            int idname = scanner.nextInt();
            if(idname<1000 || idname>9999){
                System.out.println("录入失败");
                continue;
            }else{
                System.out.println("姓名："+name);
                System.out.println("性别："+sex);
                System.out.println("学号："+idname);
            }

        }
    }
}
