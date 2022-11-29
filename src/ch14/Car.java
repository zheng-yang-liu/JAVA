package ch14;
//this的使用
//this可以代表对象更改和显示属性
//继承时使用
public class Car {
    String color;
    int speed;
    int seat=5;
    double price;

    //run方法
    public void run() {
        this.color="黑色的";
        System.out.println(color+"车在跑");
        //java中变量的查找方法，现在自己方法中寻找，如果没有就在this中查找
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.color="白色的";
        car.speed=80;
        car.price=1000.099;
        car.run();
        System.out.println(car.color);

        //调用方法时，会自动将对象传递给方法，在方法中由this来接受
        //对象名，方法名();

    }
}
