package ch7数组;

public class lx7_11 {
    public static void main(String[] args) {
        int[] points = new int[] {18,25,7,36,13,2,63,89};
        int min=points[0];
        int index=0;
        for (int i = 0; i < points.length; i++) {
            if(points[i]<min){
                min=points[i];
                index=i;
            }
        }
        System.out.println("最低分为："+min);
        System.out.println("最低分的下标为："+index);
    }
}
