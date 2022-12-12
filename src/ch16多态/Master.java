package ch16多态;

public class Master {
    private String name="master";
    private int money;
    public Master(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void feed(Pet pet){
        pet.eat();
    }
    //public void feed(Dog dog){
    //    dog.eat();
    //}
    //public void feed(Penguin penguin){
    //    penguin.eat();
    //}
    public Pet getPet(int typeId){
        Pet pet=null;
        if(typeId==1){
            pet=new Dog("dd","ddd");
        }
        if(typeId==2){
            pet=new Penguin("sss","sss");
        }
        if(typeId==3){
            pet=new Cat("qq","qq");
        }
        return pet;
    }
    //instanceof检查对象是由属于一个类或者实现了一个接口返回true\false
    //使用时类类型必须有继承关系否则会出现编译错误
    public void play(Pet pet){
        if(pet instanceof Dog){
            Dog dog=(Dog)pet;//强制类型转换
            dog.feipan();
        }else if(pet instanceof Penguin){
            Penguin penguin=(Penguin)pet;
            penguin.swit();
        }
    }
}
