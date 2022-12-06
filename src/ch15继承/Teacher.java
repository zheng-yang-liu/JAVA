package ch15继承;
/*执行顺序
父
子
孙
*/
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
    public void ShowInfo() {
        System.out.println("姓名："+name);
        System.out.println("学校："+school);
        System.out.println("班级："+class1);
    }
}
