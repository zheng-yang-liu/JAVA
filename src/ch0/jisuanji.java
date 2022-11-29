package ch0;

public class jisuanji {
    String CPU="CPU";
    String zhuban="zhuban";
    String xianshiqi="xianshiqi";
    String yingpan="yingpan";
    String neicun="neicun";

    public void show(){
        System.out.println("CPU:"+CPU);
        System.out.println("主板:"+zhuban);
        System.out.println("显示器:"+xianshiqi);
        System.out.println("硬盘:"+yingpan);
        System.out.println("内存:"+neicun);
    }

    public static void main(String[] args) {
        jisuanji jis=new jisuanji();
        jis.show();
    }



}
