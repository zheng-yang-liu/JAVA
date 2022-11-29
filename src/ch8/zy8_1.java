package ch8;
import java.util.*;
public class zy8_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hang;
        System.out.print("请输入行数：");
        hang=scanner.nextInt();
        for (int i=0;i<hang ;i++ ){
            for (int j=0;j<=hang-i-2 ;j++ ){
                System.out.print(" ");
            }
            for (int k=0;k<=i*2 ;k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
