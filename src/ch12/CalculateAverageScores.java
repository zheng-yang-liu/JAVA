package ch12;
import java.util.*;
public class CalculateAverageScores {
    //计算平均值
    public double averageScores(int[] scores){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return (double) sum/scores.length;
    }
    //计算最大值
    public int MAx(int[] scores){
        return Arrays.stream(scores).max().getAsInt();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CalculateAverageScores calculate=new CalculateAverageScores();
        int[] scores=new int[5];
        System.out.println("请输入5为同学的成绩");
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入第"+(i+1)+"位同学的成绩：");
            scores[i]= scanner.nextInt();
        }
        System.out.println("平均值为"+calculate.averageScores(scores));
        System.out.println("最大值为"+calculate.MAx(scores));
    }

}
