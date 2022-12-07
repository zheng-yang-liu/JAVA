package ch16多态;
//多态（对象类类型转换）
public abstract class Pet {
    protected String name = "无名";
    protected int health = 0;
    protected int love=0;
    public Pet(String name){
    this.name = name;
        //System.out.println("执行了Pet有参构造方法");
    }
    //输出信息
    public void ShowInfo(){
        System.out.println("宠物自我介绍");
        System.out.println("昵称:"+name+"\n健康值:"+health+"\n亲密度:"+love);

    }
    //抽象方法
    public abstract void eat();
}
