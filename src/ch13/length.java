package ch13;
import java.util.*;
public class length {
    //获取字符串的长度
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //获取数组长度
        String s="123456789";
        int i;
        i=s.length();
        System.out.println(i);

        //concat()字符串连接
        String s2 = "你好,";
        String name = "张三!";
        String sentence = s2.concat(name);
        System. out. println(sentence);

        //indexOf()返回查找字符的第一次出现的位置
        // 返回字符“春”最后出现的位置是1
        String s3 = "青春无悔";
        int index = s3.indexOf('春');
        System.out.println(index);

        //lastIndexOf("青春");
        // 执行后，返回字符“青春”最后出现的位置是6。
        String s4 = "青春无悔无悔青春";
        int index4= s4.lastIndexOf("青春");
        System.out.println(index4);


        //substring(int index)方法返回从index开始以后的字符
        // 返回春无悔无悔青春
        String s5 = "青春无悔无悔青春";
        String s5_1=s5.substring(1);
        System.out.println(s5_1);


        //substring(int beginindex, int endindex)方法返回从begindex开始到endindex结束之间的字符
        //返回无悔无悔
        String s6 = "青春无悔无悔青春";
        String s6_1=s5.substring(2,6);
        System.out.println(s6_1);

        //5. trim( )方法该方法可以忽略字符串前后的空格，
        String s7 = "    你好再见    ";
        System.out.println("不删除空格："+s7);
        System.out.println("删除空格："+s7.trim());


    }
}
