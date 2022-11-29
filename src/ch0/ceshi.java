package ch0;

public class ceshi {
    public static void main(String[] args) {
        yinxiong yx =new yinxiong();
        guaiwu gw=new guaiwu();
        wuqi wq=new wuqi();
        System.out.println("英雄信息是");
        yx.name="你好";
        yx.life=10000;
        yx.showInfo();
        System.out.println("怪物信息是");
        gw.name="再见";
        gw.life=10000;
        gw.type="小怪";
        gw.showInfo();
        System.out.println("武器信息是");
        wq.name="拜拜";
        wq.attack=10000;
        wq.showInfo();

    }
}
