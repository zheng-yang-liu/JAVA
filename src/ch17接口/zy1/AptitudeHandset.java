package ch17接口.zy1;

/**
 * 智能手机
 *
 * @author thexu
 * @date 2022/12/26
 */
public class AptitudeHandset extends Handest implements TheakePictures,Network,playWiring{
    //获取型号和品牌
    public AptitudeHandset(String model, String brand){
        super(model, brand);
    }
    //输出型号和品牌
    public void setModel(){
        System.out.println("这是一款型号为"+model+"的"+brand+"手机");
    }
    //拍照
    @Override
    public void paizhao() {
        System.out.println("咔嚓......拍照成功");
    }
    //链接网路
    @Override
    public void lianwang() {
        System.out.println("已经启动移动网络");
    }
    //发送文字图片
    @Override
    public void playwiring() {
        System.out.println("发表带有图片的文字信息");
    }
    //播放视频播放音乐

    @Override
    public void playmoviemusic() {
        System.out.println("开始播放视频《小时代》");
    }
    //通话
    @Override
    public void shipin() {
        System.out.println("开始视频通话");
    }
}
