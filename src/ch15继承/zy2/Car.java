package ch15继承.zy2;

public final class Car extends MotoVehicle {
    String Type;//型号
    int CarCount;//租车数量
    int DailyRent;//租用一天的费用

    //构造方法
    public Car(String Type, String No){
        super(No);
        this.Type = Type;
    }
    //方法获取品牌
    public String getType(){
        return Type;
    }

    //获取数量；型号
    public Car(String type){
        if(type.equals("别克商务舱GL8")){
            DailyRent = 600;
        }
        else if(type.equals("宝马550i")){
            DailyRent=500;
        }
        else if(type.equals("别克林荫大道")){
            DailyRent = 300;
        }

    }
    //重写父类中的抽象方法，计算租金
    public int CalculateRent(int days){
        return days*DailyRent;
    }
}
