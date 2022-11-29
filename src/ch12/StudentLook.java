package ch12;
import java.util.*;
public class StudentLook {
    String[] names={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17",};
    public void lookup(int first,int second,String name){
        int sign=0;//标记
        for (int i = first-1; i <second ; i++) {
            if (names[i].equals(name)){
                System.out.println("找到了");
                sign=1;
                break;
            }
        }
        if (sign==0){
            System.out.println("没找到");
        }
    }
}
