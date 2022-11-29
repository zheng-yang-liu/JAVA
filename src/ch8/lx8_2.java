package ch8;

import java.util.*;

public class lx8_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hang;
        System.out.print("请输入行数：");
        hang=scanner.nextInt();
        for (int i = hang; i >=1; i--) {
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
