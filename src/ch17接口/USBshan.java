package ch17接口;

/**
 * usb风扇
 *
 * @author thexu
 * @date 2022/12/26
 */
public class USBshan implements USB{
    @Override
    public void service() {
        System.out.println("风扇链接usb接口，开始扇风");
    }
}
