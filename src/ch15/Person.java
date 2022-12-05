package ch15;

public class Person {
    String name;
    public Person() {
        System.out.println("执行了Person无参数的方法");
    }
    //重载
    public Person(String name) {
        this.name = name;
        System.out.println("执行了Person带参数的方法");
    }

}
