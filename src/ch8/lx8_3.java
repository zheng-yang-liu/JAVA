package ch8;
import java.util.*;
public class lx8_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hang;
        int lie;
        System.out.print("请输入行数：");
        hang =scanner.nextInt();
        System.out.print("请输入列数：");
        lie = scanner.nextInt();
        for (int i = 0; i < hang; i++) {
            for(int j=0;j<lie;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
