package ch7数组;

public class lx7_13 {
    public static void main(String[] args) {
        int[] arrw=new int[]{1,3,-1,5,-2};
        int[] newarr=new int[arrw.length];
        System.out.println("原数组为：");
        for (int i = 0; i < arrw.length; i++) {
            System.out.println(arrw[i] + " ");
        }
        for (int i = arrw.length-1; i >=0; i--){
            if(arrw[i]<0){
                newarr[arrw.length-1-i]=0;
                continue;
            }
            newarr[arrw.length-1-i] = arrw[i];
        }
        System.out.print("逆序并处理后为：");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }
    }
}
