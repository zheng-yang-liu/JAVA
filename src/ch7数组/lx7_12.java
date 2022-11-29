package ch7数组;
import java.util.*;
public class lx7_12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] nums=new int[10];
        int[] count=new int[4];
        System.out.println("请输入10个数字");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scanner.nextInt();
        }
        for(int j=0;j< nums.length;j++){
            if(nums[j]==1){
                count[1]++;
            }
            if(nums[j]==2){
                count[2]++;
            }
            if(nums[j]==3){
                count[3]++;
            }
            if(nums[j]!=1&&nums[j]!=2&&nums[j]!=3){
                count[0]++;
            }
        }
        System.out.println("1的个数有："+count[1]);
        System.out.println("2的个数有："+count[2]);
        System.out.println("3的个数有："+count[3]);
        System.out.println("非法个数有："+count[0]);
    }
}
