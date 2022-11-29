package ch7数组;
import java.util.*;
public class lx7_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String arr[] = new String[5];
        System.out.println("请输入5句话");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i+1) + "句话：");
            arr[i] = input.next();
        }
        System.out.println("-------------------");
        System.out.println("逆序输出5句话为：");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);
        }
    }
}
