package ch16多态;
import java.util.*;
public class EP {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Master master = new Master("lll",1000);
        System.out.println("欢迎光临宠物店");
        System.out.println("宠物类型（1、Dog2、penguin3、cat）");
        int typeId=scanner.nextInt();
        Pet pet=master.getPet(typeId);
        if(pet!=null) {
            System.out.println("领养成功！");
            master.feed(pet);
            master.play(pet);
        }else{
            System.out.println("领养失败");
        }

    }
}
