package ch15;

public class Teacher  extends Student{
    String class1;
    public Teacher(){
        System.out.println("执行了Teacher类的无参构造方法");
    }
    //重载
    public Teacher(String name, String school, String class1){
        super(name, school);
        this.class1 = class1;
        System.out.println("执行了Teacher类的带参构造方法");
    }
}
