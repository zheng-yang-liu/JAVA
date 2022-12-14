package ch17接口;

public class usbCeshi {
    public static void main(String[] args) {
        Udisk udisk = new Udisk();
        USBshan usbshan = new USBshan();
        udisk.service();
        usbshan.service();
    }
}
