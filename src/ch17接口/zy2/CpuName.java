package ch17接口.zy2;

public class CpuName implements Cpu{
    @Override
    public String getName() {
        return "Inter";
    }

    @Override
    public String getzhuping() {
        return "3.8Ghz";
    }
}
