package ch12;
import java.util.*;
public class Student {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StudentName studentName=new StudentName();

        for (int i = 0; i < 5; i++) {
            System.out.print("请输入第"+(i+1)+"个姓名：");
            studentName.Addname(scanner.next());
        }
        studentName.Showname();
    }
}
