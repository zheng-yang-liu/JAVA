package ch15;
//继承
public class ElectronicPet {
    public static void main(String[] args) {
        //创建pet类对象
        //Pet pet = new Pet("java");
        //pet.ShowInfo();//显示信息
        //System.out.println();

        //创建dog对象
        Dog dog = new Dog("大黄","金毛");
        dog.ShowInfo();
        System.out.println();

        //创建penguin对象
        Penguin penguin=new Penguin("华腾","男");
        penguin.ShowInfo();
    }
}
