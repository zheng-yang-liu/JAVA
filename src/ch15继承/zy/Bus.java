package ch15继承.zy;

public final class Bus extends MotoVehicle{
    int SeatCount;//座位数
    int DailyRent;//租用一天的费用
    int BueCount;//租车数量
    public Bus(int BueCount,int SeatCount) {//数量//座位
        if (SeatCount <= 16){
            DailyRent = 800;
        }else if (SeatCount > 16){
            DailyRent = 1500;
        }
        this.BueCount = BueCount;

    }
    //重写父类中的抽象方法，计算租金
    public int CalculateRent(int days){
        return days*DailyRent*BueCount;
    }

}
