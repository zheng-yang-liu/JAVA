package ch16多态.zy1;

public class PolymorphicExercise {
    public static void main(String[] args) {
        int Days=5; //租赁天数
        int TotalAmount=0;// 总租赁费用
        //客户租用的多辆汽车信息及租用天数
        MotoVehicle[] motos = new MotoVehicle[4];
        motos[0] = new Car("宝马550i");
        motos[1] = new Car("宝马550i");
        motos[2] = new Car("别克林荫大道");
        motos[3] = new Bus(34);
        for (int i = 0; i < motos.length; i++) {

            TotalAmount=TotalAmount + motos[i].CalculateRent(Days);
        }
        System.out.println(TotalAmount);
    }
}
