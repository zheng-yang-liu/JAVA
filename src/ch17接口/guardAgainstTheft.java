package ch17接口;

public class guardAgainstTheft extends door implements lock,bell {
    @Override
    public void lockup() {
        System.out.println("锁上了");
    }

    @Override
    public void lockoppen() {
        System.out.println("开锁了");
    }

    @Override
    public void takingPictures() {
        System.out.println("拍照了");
    }

    @Override
    public void open() {
        System.out.println("门开了");
    }

    @Override
    public void close() {
        System.out.println("门关了");
    }
}
