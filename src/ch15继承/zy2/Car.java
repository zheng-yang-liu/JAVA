package ch15继承.zy2;

public class Car extends MotoVehicle {
    String Type;	//型号
    int Daily_rate; // 日租费
    int Pedestrians; // 租车数量




    Car(int no,String type) {//no表示数量，type表示车型
        if(type.equals("别克商务舱GL8"))
            Daily_rate = 600;
        else if(type.equals("宝马550i"))
            Daily_rate=500;
        else if(type.equals("别克林荫大道"))
            Daily_rate = 300;
        this.Pedestrians = no;
    }
    public int CalcRent(int days) {
        return days*Daily_rate*Pedestrians;
    }
}

