package ch9;
import java.util.*;
public class denglu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        String inputpassword;
        GLY gly1=new GLY();
        GLY gly2=new GLY();
        KH kh1=new KH();
        gly1.name="admin1";
        gly1.password="11111111";
        gly2.name="admin2";
        gly2.password="22225555";

        gly1.showInfo();
        gly2.showInfo();

        //回馈积分
        kh1.integration=3000;
        kh1.cardType="金卡";
        kh1.showInfo();
        if(kh1.cardType.equals("金卡") && kh1.integration>=1000){
            kh1.showInfo();
        }

        //修改管理员密码
        System.out.print("请输入用户名：");
        name=scanner.next();
        System.out.print("请输入密码：");
        inputpassword=scanner.next();
        if (name.equals(gly1.name) && inputpassword.equals(gly1.password)){
            System.out.print("请输入新密码：");
            gly1.password= scanner.next();
            System.out.println("新密码修改成功，新密码是："+gly1.password);
        }else{
            System.out.println("用户名或密码输入错误");
        }

    }
}
