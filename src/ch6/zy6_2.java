package ch6;
import java.util.*;
public class zy6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个值：");
        int zhi=scanner.nextInt();
        for (int i=0,j=zhi ; i <=zhi; i++,j--){
            System.out.println(i+"+"+j+"="+(i+j));
        }
    }
}
