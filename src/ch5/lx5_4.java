package ch5;

public class lx5_4 {
    public static void main(String[] args) {
        int i = 1;
        int sum=0;
        while(i<=100){
            if(i%2 == 0) {
                sum += i;

            }
            i++;
        }
        System.out.println("100以内的偶数为"+sum);
    }
}
