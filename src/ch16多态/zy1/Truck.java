package ch16多态.zy1;

public class Truck extends MotoVehicle{
    int Tonnage;//吨位
    public Truck(int Tonnage){
        this.Tonnage = Tonnage;
    }
    //定义抽象方法，计算租金
    public int CalculateRent(int days){
        return days*50*Tonnage;
    }
}
