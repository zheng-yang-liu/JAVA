package ch16多态;

public class ElectronicPet {
    public static void main(String[] args) {
       /* // 对象类类型转换
        Pet pet = new Penguin("dd","nan");
        Master  master=new Master("www", 100);
        //pet.eat();
        Dog dog=new Dog("ss", "100");
        master.feed(pet);*/
        Pet pet = new Cat("ss", "红色");
        pet.eat();

    }
}
