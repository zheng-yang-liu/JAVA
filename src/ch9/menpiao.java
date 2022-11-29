package ch9;
import java.util.*;
public class menpiao {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            youke youke = new youke();
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

