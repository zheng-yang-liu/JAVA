package ch3;
import java.util.*;
public class zy3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入我的存款：");
        int deposit=input.nextInt();
        if (deposit>=500)
            System.out.println("买凯迪拉克");
        else if (deposit>=100)
            System.out.println("买帕萨特");
        else if (deposit>=50)
            System.out.println("买伊兰特");
        else if (deposit>=10)
            System.out.println("买奥托");
        else
            System.out.println("买捷安特");
        //刘政阳
    }
}
