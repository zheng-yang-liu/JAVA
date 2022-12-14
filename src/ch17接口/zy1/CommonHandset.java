package ch17接口.zy1;

/**
 * 普通手机
 *
 * @author thexu
 * @date 2022/12/26
 */
public class CommonHandset extends Handest implements playWiring{
    //获取型号和品牌
    public CommonHandset(String model, String brand){
        super(model, brand);
    }
    //输出型号和品牌
    public void setModel(){
        System.out.println("这是一款型号为"+model+"的"+brand+"手机");
    }
    //发送文字图片

    @Override
    public void playwiring() {
        System.out.println("发送文字信息");
    }

    //播放视频播放音乐

    @Override
    public void playmoviemusic() {
        System.out.println("播放音乐《热血》");
    }

    //通话

    @Override
    public void shipin() {
        System.out.println("开始语音通话");
    }
}
