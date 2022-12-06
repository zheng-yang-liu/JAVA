package ch15继承.zy;
//机动车类(抽象类)
public abstract class MotoVehicle {
    private String No;//车牌号
    private String Brand;//品牌
    private String Color;//颜色
    private int Mileage;//里程
    //带参数的构造方法no
    public MotoVehicle(String No){
        this.No = No;
    }
    //计算租金
    public void CalcRent(int days){

    }
}
