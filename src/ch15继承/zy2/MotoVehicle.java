package ch15继承.zy2;

public abstract class MotoVehicle {
    String No; // 车牌号
    String Brand; // 品牌
    String Color; // 颜色
    int Mileage; // 里程

    public abstract int CalcRent(int days);// 计算租金
}
