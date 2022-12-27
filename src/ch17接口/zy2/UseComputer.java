package ch17接口.zy2;

public class UseComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Cpu cpu=null;

        //内存
        Memory memory=null;
        //硬盘
        HardDisk harddisk=null;
        //获取cpu品牌和主频
        cpu= new CpuName();

        computer.getcpu(cpu);
        //获取内存
        memory=new MemoryRongliang();
        computer.getmemory(memory);
        //获取硬盘
        harddisk = new HardDiskrongliang();
        computer.getharddisk(harddisk);
        //输出
        computer.show();


    }
}
