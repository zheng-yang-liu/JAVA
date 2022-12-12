package ch16多态;

public class Cat extends Pet{
    private String color;//颜色
    public Cat(String name,String color){
        super(name);
        this.color = color;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("颜色："+color);
    }

    @Override
    public void eat() {
        super.health+=4;
        System.out.println("猫咪"+super.name+"正在吃饭，健康值加4");
    }
}
