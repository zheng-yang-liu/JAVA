package ch13;

public class bufferConnect {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer ("青春无悔") ;
        int num=110;
        //在字符串后面追加字符串
        StringBuffer sb1 = sb.append ("我心永恒");
        System. out.println(sb1) ;
        //在字符串后面追加字符
        StringBuffer sb2 = sb1.append('啊') ;
        System.out.println(sb2);
        //在字符串后面追加整型数字
        StringBuffer sb3 = sb2.append (num);
        System.out.println(sb3);
    }
}
