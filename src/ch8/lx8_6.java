package ch8;
import java.util.*;
public class lx8_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0;
        double[] scores=new double[4];
        double sum;
        for(int j=0;j<3;j++){
            sum=0;
            System.out.println("请输入第"+(j+1)+"个班级4名学生的成绩：");
            for (int i = 0; i < scores.length; i++) {
                System.out.print("请输入第"+(i+1)+"位学生的成绩：");
                scores[i]=scanner.nextDouble();
                sum+=scores[i];
                if(scores[i]>85){
                    count++;
                }
            }
            System.out.println("第"+(j+1)+"个班级平均分为:"+sum/scores.length);
        }
        System.out.println("85分以上的学生有"+count+"人");

    }
}
