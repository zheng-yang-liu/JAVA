package ch6;

public class zy6_4 {
    public static void main(String[] args) {
        for (int i = 1;i<=9;i++)
        {
            for (int j = 1;j<=i;j++)
            {
                System.out.print(i+"X"+j+"="+(i*j)+"  ");
            }
            System.out.println();
        }
    }
}
