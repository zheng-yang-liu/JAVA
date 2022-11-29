package ch9;
import java.util.*;
public class lx9_2_0 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String strain="";
        String sex="";
        System.out.println("欢迎光临爱宠宠物店");
        System.out.println("请输入要领养宠物的昵称");
        String name=scanner.next();
        System.out.println("领养（1）狗狗还是（2）企鹅");
        int key=scanner.nextInt();
        switch (key){
            case 1:
                System.out.println("请选择狗狗品种（1）拉布拉多（2）雪纳瑞犬");
                if(scanner.nextInt()==1){
                    strain="拉布拉多";
                }else{
                    strain="雪纳瑞犬";
                }
                //创建狗狗对象并赋值
                lx9_2 dog =new lx9_2();
                dog.name=name;
                dog.strain=strain;
                dog.print_info();
                break;
            case 2:
                System.out.println("请选择性别（1）Q仔（2）");
                if(scanner.nextInt()==1){
                    sex="Q仔";
                }else{
                    sex="Q妹";
                }
                lx9_2_2 penguin =new lx9_2_2();
                penguin.name=name;
                penguin.sex=sex;
                penguin.print_info();
                break;
        }

    }
}
