package ch15;
//继承-子类
/*
* 子类可以继承父类的那些东西
* 只能继承到父类的public修饰的protected修饰的属性和方法
* 继承到默认权限修饰符
* 无法继承到父类的构造方法但是可以使用
* 无法继承父类private修饰的属性和方法
* */
public class Dog extends Pet{
    private String strain;//品种
    //Dog的构造方法
    public Dog(String name,String strain){
        //super可以调用父类的构造方法和方法
        super(name);//相当于Pet pet = new Pet(name);
        this.strain = strain;
    }
    //获取品种
    public String getStrain(){
        return strain;
    }

}
