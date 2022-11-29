package ch12;

public class zhazhiji {
    public String juice(String fruit) {
        return "榨了一杯"+fruit+"汁";
    }
    public static void main(String[] args) {
        zhazhiji zzj = new zhazhiji();
        System.out.println(zzj.juice("苹果"));
    }

}
