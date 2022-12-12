package ch15继承.zy2;
//机动车类(抽象类)
public abstract class MotoVehicle {
    private String No; // 车牌号
    private String Brand;//品牌
    private String Color;//颜色
    private int Mileage;//里程
    private String type;//型号
    private int SeatCount;//座位数

    //方法
    public String getType() {
        return type;
    }

    public int getSeatCount(){
        return SeatCount;
    }
    //构造方法
    public MotoVehicle(){
        super();
    }
    public MotoVehicle(String NO){
        this.No = NO;
    }
    public MotoVehicle(String Brand,int SeatCount){
        this.Brand = Brand;
        this.SeatCount = SeatCount;
    }

    //定义抽象方法，计算租金
    public abstract int CalculateRent(int days);
}
