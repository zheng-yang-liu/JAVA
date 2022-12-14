package ch17接口;
//不能被实例化
public interface myInterface {
    //可以定义属性，不能定义变量只能定义常量 会自动使用final修饰属性（全局静态常量）
    //不能有构造方法
    //接口之间可以使用 extends 来实现继承
    public static final double p = 3.14;
    int i=3;
    void name();
}
