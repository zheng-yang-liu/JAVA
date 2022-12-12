package ch15继承.zy2;

/**
 * 多态练习作业
 *
 * @author thexu
 * @date 2022/12/13
 */
public class PolymorphicExercise {
    public static void main(String[] args) {
        int Days=5; //租赁天数
        int TotalAmount=0;// 总租赁费用
        //客户租用的多辆汽车信息及租用天数
        MotoVehicle[] motos = new MotoVehicle[4];
        motos[0] = new Car("宝马550i","京NY28588");
        motos[1] = new Car("宝马550i","京NNN3284");
        motos[2] = new Car("别克林荫大道","京NT43765");
        motos[3] = new Bus("金龙",34);
        //计算租金
        for(int i=0;i<motos.length;i++){
            if(i<3){
                Car car=new Car(motos[i].getType());
                TotalAmount =TotalAmount +car.CalculateRent(Days);
            }else{
                Bus bus=new Bus(motos[i].getSeatCount());
                TotalAmount =TotalAmount +bus.CalculateRent(Days);
            }
        }
        System.out.println("总金额："+TotalAmount);
    }
}
