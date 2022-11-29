package ch8;
import java.util.*;
public class zy8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入菱形的行数：");
        int rows = scanner.nextInt();

        while(rows%2==0){
            System.out.print("请输入奇数：");
            rows = scanner.nextInt();
        }
        int n = (rows+1)/2;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for( int i = 1; i <= n-1; i++){
            for( int j = 1;j <= i; j++){
                System.out.print(" ");
            }
            for( int k =1; k <=2*(n-i)-1 ; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
