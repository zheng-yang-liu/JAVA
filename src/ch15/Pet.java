package ch15;
//继承-父类（Dog，Penguin）的父类
public class Pet {
    //private私有的
    private String name="无名";
    private int health=100;
    private int love=0;
    //无参数构造方法
    public Pet(){
        health=90;
        System.out.println("执行了宠物类的无参数狗造方法");
    }
    //带参数的构造方法name
    public Pet(String name){
        this.name=name;
        System.out.println("执行了宠物类的带参数狗造方法");
    }
    //输出信息
    public void ShowInfo(){
        System.out.println("宠物自我介绍");
        System.out.println("昵称:"+name+"\n健康值:"+health+"\n亲密度:"+love);
    }
    //获取昵称
    public String getName(){
        return name;
    }
    //获取健康值
    public int getHealth(){
        return health;
    }
    //获取亲密度
    public int getLove(){
        return love;
    }
}
