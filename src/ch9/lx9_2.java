package ch9;
import java.util.*;
public class lx9_2 {
    String name="本本";
    int health=100;
    int love=0;
    String strain;

    public void print_info(){
        System.out.println("宠物信息");
        System.out.println("昵称："+name);
        System.out.println("健康值："+health);
        System.out.println("亲密度："+love);
        System.out.println("品种："+strain);
    }
}
