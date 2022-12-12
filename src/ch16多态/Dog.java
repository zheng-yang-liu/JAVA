package ch16多态;

public class Dog extends Pet{
    private String strain;
    public Dog(String name,String strain) {
        super(name);
        this.strain = strain;
    }
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("品种："+strain);
    }
    public void eat(){
        super.health +=3;
        System.out.println("狗狗"+super.name+"吃饱了,健康值加3");
    };
    //玩飞盘
    public void feipan(){
        super.health-=10;
        super.love+=5;
        System.out.println("飞盘狗狗"+name+"健康值减10，亲密度加5");
    }

}
