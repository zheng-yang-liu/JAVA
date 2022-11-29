package ch7数组;
import java.util.*;
public class lx7_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        降序
        int[] scores= new int[5];
        int max=0;
        for(int i=0;i<scores.length;i++){
            System.out.print("请输入第"+(i+1)+"位同学的成绩:");
            scores[i]= scanner.nextInt();
        }
        for(int i=0;i<scores.length;i++){
            if (scores[i] > max){
                max=scores[i];
            }
        }
        System.out.println(max);






//      冒泡排序
        System.out.println("冒泡排序");
        int staging;
        for(int j=1;j< scores.length;j++){
            for(int i=0;i< (scores.length-1);i++){
                if(scores[i+1] > scores[i]){
                    staging=scores[i];
                    scores[i]=scores[i+1];
                    scores[i+1]=staging;
                }
            }
        }
        for(int i=0;i< scores.length;i++){
            System.out.println(scores[i]);
        }










        for(int i=0;i< scores.length;i++){
            System.out.println("降序排序");
//            Arrays.sort(scores,Collections.reverseOrder() );
            System.out.println("(升序)排序输出："+scores[i]);
        }

    }

}
