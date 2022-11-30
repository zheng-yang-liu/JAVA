package ch14;

public class Dog {
    String name;
    int health;
    int love;
    //自定义构造方法
    public Dog(String name, int health, int love){
        this.name = name;
        this.health = health;
        this.love = love;
    }
    public void ShowInfo() {
        System.out.println(name + "\t" + health + "\t"+love+"\t");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("nihao",20,0);
        Dog dog2 = new Dog("zaijian",30,0);

        dog1.ShowInfo();
        dog2.ShowInfo();
    }
}
