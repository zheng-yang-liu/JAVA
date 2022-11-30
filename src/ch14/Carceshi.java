package ch14;

public class Carceshi {
    String color;
    int speed;
    int seat=5;


   //构造方法,创建对象时自动执行
    public Carceshi(String color,int speed){
        this.color=color;
        //System.out.println("执行了构造方法");
    }

    public void run() {
        System.out.println(this.color+"车在跑");
        //java中变量的查找方法，现在自己方法中寻找，如果没有就在this中查找
    }

    public static void main(String[] args) {
        Carceshi c1= new Carceshi("白色",120);
        Carceshi c2= new Carceshi("黑色",240);
        c1.run();
        c2.run();
        /*Carceshi car = new Carceshi();
        car.color="白色的";
        car.speed=80;
        car.run();
        Carceshi car2 = new Carceshi();
        car2.color="黑色的";
        car2.speed=80;
        car2.run();*/



    }
}
