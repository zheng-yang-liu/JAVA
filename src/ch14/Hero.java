package ch14;
//构造方法的作用
//可以有更多种自定义方法
public class Hero {
    //定义属性
    String name;
    String type;
    int age;
    String waihao;

    //显示信息
    public void ShoeInfo(){
        System.out.println(name + "\t" + type + "\t" + age+"\t"+waihao+"\t");
    }

    public static void main(String[] args) {
        Hero hero1 = new Hero("吕布","战士",32);
        hero1.ShoeInfo();
        Hero hero2 = new Hero("典韦","战士",22,"疯狗");
        hero2.ShoeInfo();
    }

    //构造方法（与下面重载）
    public Hero(String name, String type, int age, String waihao){
        this(name, type, age);
        this.waihao = waihao;
    }
    //构造方法
    public Hero(String name, String type, int age){
        this.name = name;
        this.type = type;
        this.age = age;
    }
}
