package ch6;

public class lx6_5 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
            if(sum>20){
                System.out.println("值为："+i);
                break;
            }
        }
        System.out.println("和为:"+sum);
    }
}
