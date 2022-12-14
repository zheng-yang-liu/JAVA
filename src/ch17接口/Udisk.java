package ch17接口;

/**
 * U盘
 *
 * @author thexu
 * @date 2022/12/26
 */
public class Udisk implements USB{
    public void service(){
        System.out.println("U盘链接usb接口，开始传递数据");
    }

}
