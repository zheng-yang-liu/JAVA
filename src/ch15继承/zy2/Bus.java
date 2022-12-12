package ch15继承.zy2;

public final class Bus extends MotoVehicle {
    int SeatCount;//座位数
    int DailyRent;//租用一天的费用
    int BueCount;//租车数量
    //构造方法

    public Bus(String Brand,int SeatCount){
        super(Brand,SeatCount);
        this.SeatCount = SeatCount;
    }
    //方法获取座位数
    public int getSeatCount(){
        return SeatCount;
    }
    //座位
    public Bus(int SeatCount) {
        if (SeatCount <= 16){
            DailyRent = 800;
        }else if (SeatCount > 16){
            DailyRent = 1500;
        }
    }
    //重写父类中的抽象方法，计算租金
    public int CalculateRent(int days){
        return days*DailyRent;
    }

}
