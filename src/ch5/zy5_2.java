package ch5;

public class zy5_2 {
    public static void main(String[] args) {
        double c=0;     //摄氏度初始值为0
        int i=1;        //条目数初始值为1因为会先经行一次输出这样while就能只循环9次操作所以设置为1
        double f= 0;     //华摄氏度
        do {
            f = c* 9 / 5.0 + 32;
            System.out.println("摄氏度为"+c+"华摄氏度为"+f);
            c+=20;      //每20度为一项
            i++;
        }while(i<=10 && c<=250);        //运行条件为条目数不超过10以及温度不超过250
    }
}
