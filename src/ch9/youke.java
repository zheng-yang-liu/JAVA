package ch9;

public class youke {
    String name;
    int age;

    public void showInfo(){
        if(age>=13 &&age<=59){
            System.out.println(name+"的年龄为"+age+",门票为60元");
        }else{
            System.out.println(name+"的年龄为"+age+",免费");
        }

    }
}
