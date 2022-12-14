package ch17接口.zy1;

public class shouji {
    public static void main(String[] args) {
        //智能手机
        AptitudeHandset ap = new AptitudeHandset("mate20Pro","华为");
        //普通手机
        CommonHandset co = new CommonHandset("G520c","诺基亚");
        //普通手机操作
        co.setModel();
        co.playmoviemusic();
        co.playwiring();
        co.shipin();
        System.out.println();
        //智能手机操作
        ap.setModel();
        ap.lianwang();
        ap.playmoviemusic();
        ap.paizhao();
        ap.playwiring();
        ap.shipin();
    }
}
