package ch7数组;

import java.util.Arrays;

public class zy7_3 {
    public static void main(String[] args) {
        String[] arr=new String[]{"a", "c", "u", "b", "e", "p", "f", "z"};

        System.out.print("原顺序输出：");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.print("升顺序输出：");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("逆顺序输出：");
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
