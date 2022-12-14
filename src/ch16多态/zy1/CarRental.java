package ch16多态.zy1;
import java.util.*;

/**
 * 汽车租赁
 *
 * @author thexu
 * @date 2022/12/14
 */
public class CarRental {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Days; //租赁天数
        int TotalAmount=0;// 总租赁费用
        //客户租用的多辆汽车信息及租用天数
        System.out.print("请输入客户姓名：");
        String CustomerName=scanner.next();
        Customer customer1=new Customer(CustomerName);
        System.out.print("请输入您要租车的数量：");
        int vehicleMuch=scanner.nextInt();
        System.out.print("请输入您要租车的天数：");
        Days=scanner.nextInt();
        MotoVehicle[] motos = new MotoVehicle[vehicleMuch];
        for (int i = 0; i < motos.length; i++) {
            System.out.println("请选择租车种类（1、汽车2、公交车3、卡车）");
            int choose=scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("轿车车型（别克商务舱GL8；宝马550i；别克林荫大道）");
                    System.out.print("请输入轿车的车型：");
                    String CarType=scanner.next();
                    motos[i]= new Car(CarType);
                    break;
                case 2:
                    System.out.print("请输入客车的座位数");
                    int SeatCount=scanner.nextInt();
                    motos[i]= new Bus(SeatCount);
                    break;
                case 3:
                    System.out.print("请输入吨位数：");
                    int Tonnage=scanner.nextInt();
                    motos[i]= new Truck(Tonnage);
                    break;
            }
            TotalAmount=TotalAmount + motos[i].CalculateRent(Days);
        }
        System.out.println("客户姓名："+customer1.customerName+" 租用天数:"+Days+" 天 总费用"+TotalAmount+"元");
    }
}
