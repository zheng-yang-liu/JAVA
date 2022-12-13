package ch16多态.zy1;

/**
 * 公共汽车
 *
 * @author thexu
 * @date 2022/12/14
 */
public final class Bus extends MotoVehicle {
    int SeatCount;//座位数
    int DailyRent;//租用一天的费用
    int BusCount;//租车数量

    public Bus(int SeatCount) {//座位
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
