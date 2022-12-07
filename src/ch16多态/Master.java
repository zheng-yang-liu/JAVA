package ch16多态;

public class Master {
    private String name="master";
    private int money;
    public Master(String name, int money){
        this.name = name;
        this.money = money;
    }
    public void feed(Pet pet){
        pet.eat();
    }
    //public void feed(Dog dog){
    //    dog.eat();
    //}
    //public void feed(Penguin penguin){
    //    penguin.eat();
    //}
}
