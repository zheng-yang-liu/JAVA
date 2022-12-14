package ch15继承;
//继承-子类(语法extends Pet)
public class Penguin extends Pet {
    private String sex;//性别
    //构造方法
    public Penguin(String name,String sex) {
        super(name);//相当于Pet pet = new Pet(name);
        this.sex = sex;
    }
    //获取性别
    public String getSex(){
        return sex;
    }

    //对父类的方法进行重写
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("性别："+sex);
    }
}
