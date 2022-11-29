package ch9;
import java.util.*;
public class school {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        student student=new student();
//        student.name=scanner.next();
        student.name="煦炎";
        student.age=222;
        student.classNo="软件2101班";
        student.hobby="是";
        student.showInfo();
        System.out.println();
        System.out.println("********************************");
        teacher teacher=new teacher();
//        teacher.name=scanner.next();
        teacher.name="里是";
        teacher.major="软件技术";
        teacher.course="java";
        teacher.teacherYear=1000;
        teacher.showInfo();
    }
}
