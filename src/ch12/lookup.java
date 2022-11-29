package ch12;

import java.util.*;

public class lookup {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int first;
        int second;
        String name;
        StudentLook lookup=new StudentLook();
        System.out.print("请输入开始位置：");
        first= scanner.nextInt();
        System.out.print("请输入结束位置：");
        second= scanner.nextInt();
        System.out.print("请输入要查找的姓名：");
        name= scanner.next();
        lookup.lookup(first, second,name);
    }
}
