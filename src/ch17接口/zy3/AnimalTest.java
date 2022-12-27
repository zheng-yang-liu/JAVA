package ch17接口.zy3;

public class AnimalTest {

    public static void main(String[] args) {
        Animal al = Store.get("pig");
        al.shout();
    }

}
