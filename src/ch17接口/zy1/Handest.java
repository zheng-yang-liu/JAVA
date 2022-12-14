package ch17接口.zy1;

/**
 * 手机(父类)
 *
 * @author thexu
 * @date 2022/12/26
 */
public abstract class Handest {
    //型号
    String model;
    //品牌
    String brand;

    //获取型号和品牌
    public Handest(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
}
