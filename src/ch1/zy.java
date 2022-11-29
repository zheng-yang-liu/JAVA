package ch1;
import java.util.*;
public class zy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入购物金额：");
        double original=input.nextDouble();
        double convert=original*0.8;
        System.out.println("实际需要付："+convert);
        if(convert>500)
            System.out.println("实际需付金额大于五百");
        //刘政阳
    }
}
