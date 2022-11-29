package ch7数组;


import java.util.*;


public class lx7_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //排序
        int[] scores= new int[5];
        for(int i=0;i<scores.length;i++){
            System.out.print("请输入第"+(i+1)+"位同学的成绩:");
            scores[i]= scanner.nextInt();
        }
        for(int i=0;i<scores.length;i++){
            System.out.println("不排序输出："+scores[i]);
            Arrays.sort(scores);
            System.out.println("(升序)排序输出："+scores[i]);
//            Arrays.sort(scores, Collections.reverseOrder());
            System.out.println("(升序)排序输出："+scores[i]);
        }

    }
}
