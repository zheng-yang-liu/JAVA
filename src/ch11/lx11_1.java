package ch11;

public class lx11_1 {
    String color="黄色";
    public void run(){
        System.out.println("正在跑");
    }
    public String read(){
        return "正在叫";
    }
    public String rob(){
        String ball="球";

        return ball;
    }


    public String getColor(){
        return color;
    }

    public String show(){

        return "这是一个"+getColor()+"的电动玩具狮子";
    }
}
