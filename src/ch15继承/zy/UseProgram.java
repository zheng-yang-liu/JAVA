package ch15继承.zy;
import java.util.*;
public class UseProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1、轿车");
        System.out.println("2、客车（金杯，金龙）");
        System.out.print("请选择：");
        int choosen=scanner.nextInt();
        switch(choosen){
            case 1:
                System.out.print("请输入租车的数量：");
                int CarCount=scanner.nextInt();
                System.out.println("轿车车型（《别克商务舱GL8》《宝马550i》《别克林荫大道》）");
                System.out.print("请输入轿车的车型：");
                String CarType=scanner.next();
                System.out.print("输入租用的天数");
                int days=scanner.nextInt();
                Car car=new Car(CarCount,CarType);
                System.out.println("租用金额为："+car.CalculateRent(days));
                break;
            case 2:
                System.out.print("请输入租车的数量：");
                int BusCount=scanner.nextInt();
                System.out.println("请输入客车的座位数");
                int SeatCount=scanner.nextInt();
                System.out.println("输入租用的天数");
                int Days=scanner.nextInt();
                Bus bus=new Bus(BusCount,SeatCount);
                System.out.println("租用金额为："+bus.CalculateRent(Days));
                break;
        }
    }
}
