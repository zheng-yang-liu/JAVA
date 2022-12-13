package ch16多态.zy1;

/**
 * 父类车辆
 *
 * @author thexu
 * @date 2022/12/14
 *///机动车类(抽象类)
public abstract class MotoVehicle {
    private String No; // 车牌号
    private String Brand;//品牌
    private String Color;//颜色
    private int Mileage;//里程


    //定义抽象方法，计算租金
    public abstract int CalculateRent(int days);
}
