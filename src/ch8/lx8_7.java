package ch8;
import java.util.*;
public class lx8_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String ask;
        int count=0;
        for (int i = 0; i < 5; i++) {
            ask="y";
            System.out.println("第"+(i+1)+"家店");
            for(int j=0;j<3;j++){
                System.out.print("离开吗(y/n):");
                ask = scanner.next();
                if(ask.equals("y")){
                    break;
                }
                System.out.println("买了一件衣服");
                count++;
            }
            System.out.println("结账离开");
        }
        System.out.println("一共买了"+count+"件衣服");
    }
}
