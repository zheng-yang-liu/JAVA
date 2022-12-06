package ch15继承.zy;

public class Car extends MotoVehicle{
    private String Type;//型号

    public Car(String No,String Type){
        super(No);
        this.Type = Type;
    }


}
