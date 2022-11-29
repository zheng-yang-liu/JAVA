package ch9;
import java.util.*;
public class lx9_1car {
    //定义属性（成员方法）
    String color;
    int speed;
    int seat;
    //成员方法
    public void start() {
        System.out.println("启动");
    }
    public void run() {
        System.out.println("能跑");
    }
    public void stop() {

        System.out.println("刹车");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //命名（使用）
        lx9_1car aodi = new lx9_1car();

        aodi.color="黑色";
        aodi.speed=180;
        aodi.seat=5;
        System.out.println(aodi.color);
        System.out.println(aodi.speed);
        System.out.println(aodi.seat);
        aodi.start();
        aodi.run();
        aodi.stop();

    }
}
