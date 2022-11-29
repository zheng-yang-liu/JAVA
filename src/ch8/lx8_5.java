package ch8;

import java.util.*;

public class lx8_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hang;
        System.out.print("请输入行数：");
        hang=scanner.nextInt();
        for (int i = 1; i <=hang; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
