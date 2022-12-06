package ch15继承.zy;

public class Bus extends MotoVehicle{
    private int SeatCount;//座位数
    public Bus(String No,int SeatCount) {
        super(No);
        this.SeatCount = SeatCount;

    }

}
