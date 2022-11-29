package ch7数组;
import java.util.*;
public class lx7_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//      1、声明数组
//      语法1、数据类型[] 数组名;
        int[] one;
        double[] height;
//      语法2、数据类型 数组名[]
        int two[];
        String name[];
//      2、分配空间
//      语法:数组名 =new 数据类型[]
        one = new int[20];
        two = new int[10];
        height = new double[10];

        String[] names = new String[20];
        int[] score = new int[20];
//      3、赋值
        //      在声明数组是赋值
//        语法：数据类型[] 数组名 = {值1,...}
        int[] three = new int[]{1,2};
        System.out.println(three[0]);
        names[0] ="nihao";
        one[0] =1;
        System.out.println(names[0]+one[0]);
//      height.length获取数组长度
        for (int i = 0; i < height.length; i++) {
            height[i]= scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(height[i]);
        }


    }
}
