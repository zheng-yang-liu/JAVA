package ch16多态;

public class Penguin extends Pet{
    private String sex;
    public Penguin(String name,String sex) {
        super(name);
        this.sex = sex;
    }
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("性别："+sex);
    }
    public void eat(){
        super.health +=3;
        System.out.println("企鹅"+super.name+"吃饱了,健康值加3");
    }
    public void swit(){
        System.out.println("游泳");
    }

}
