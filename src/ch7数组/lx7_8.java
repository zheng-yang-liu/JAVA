package ch7数组;
import java.lang.reflect.Array;
import java.util.*;
public class lx7_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] scores = new int[]{99, 85, 82, 63, 60};
        int[] scores = new int[6];
        scores[0]=99;
        scores[1]=85;
        scores[2]=82;
        scores[3]=63;
        scores[4]=60;


        int index = scores.length;

        System.out.print("请输入新增的成绩：");
        int newscores = scanner.nextInt();



        for (int i = 0; i < scores.length; i++) {
            if(newscores > scores[i]) {
                index = i;
                break;
            }
        }

//        元素后移
        for(int j=scores.length-1;j>index;j--) {
            scores[j] = scores[j-1];
        }



        scores[index] = newscores;


        System.out.println("插入新元素的下标"+index);

        for(int k=0;k<scores.length;k++) {
            System.out.print(scores[k]+" ");
        }

    }
}
