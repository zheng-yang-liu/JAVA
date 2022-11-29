package ch7数组;


import java.util.*;

public class zy7_4_1 {
    public static void main(String[] args) {
        //一组字符a	b	c	e	f	p	u	z
        Scanner scanner=new Scanner(System.in);
        String[] arr=new String[9];
        char Alphabet;
        String Alphabet2;
        int index=arr.length-1;
        arr[0]="a";
        arr[1]="b";
        arr[2]="c";
        arr[3]="e";
        arr[4]="f";
        arr[5]="p";
        arr[6]="u";
        arr[7]="z";
        System.out.print("原顺序输出：");
        for (int i=0; i<8; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("请输入一个字符：");
//        Alphabet =scanner.next().charAt(0);
        Alphabet2 =scanner.next();
        //找到输入字符应放在数组下标的位置
        for(int i=0;i<arr.length;i++){
            if(Alphabet2.compareTo(arr[i])<0){
                index=i;
                break;
            }
        }
        //把index之后的元素全部往后移
        for(int i=arr.length-1;i>=index;i--){
            arr[i]=arr[i-1];
        }
        //把插入字符赋值
        arr[index] =Alphabet2;
        //重新打印数列
        System.out.println("插入字符的下标是:"+index);
        System.out.print("插入后的字符序列是");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
