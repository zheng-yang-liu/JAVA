package ch15;

public class Student extends Person{
    String school;
    public Student(){
        System.out.println("执行了Student的无参数构造方法");
    }
    //重载
    public Student(String name,String school){
        super(name);//调用父类的有参构造方法不在使用父类的无参构造方法
        this.school = school;
        System.out.println("执行了Student的带参数构造方法");
    }
}
