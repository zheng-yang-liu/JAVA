package ch17接口.zy3;

public class Store {
    //static(返回为全局变量)
    public static Animal get(String choice) {
        if (choice.equals("dog")) {
            return new Dog();
        } else if (choice.equals("Pig")) {
            return new Pig();
        } else {
            return new Cat();
        }
    }
}
