package ch14;

public class Carceshi {
    String color;
    int speed;
    int seat=5;


    //run方法
    public void run() {
        System.out.println(this.color+"车在跑");
        //java中变量的查找方法，现在自己方法中寻找，如果没有就在this中查找
    }

    public static void main(String[] args) {
        Carceshi car = new Carceshi();
        car.color="白色的";
        car.speed=80;
        car.run();
        Carceshi car2 = new Carceshi();
        car2.color="黑色的";
        car2.speed=80;
        car2.run();

        //调用方法时，会自动将对象传递给方法，在方法中由this来接受
        //对象名，方法名();

    }
}
