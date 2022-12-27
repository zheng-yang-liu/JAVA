package ch17接口.zy2;



public class Computer {
    //cpu
    Cpu cpu;
    //内存
    Memory memory;
    //硬盘
    HardDisk harddisk;
    //获取cup品牌和主频
    public void getcpu(Cpu cpu) {
        this.cpu = cpu;
    }
    //获取内存容量
    public void getmemory(Memory memory){
        this.memory = memory;
    }
    //获取硬盘容量
    public void getharddisk(HardDisk harddisk){
        this.harddisk =harddisk;
    }



    //输出
    public void show(){
        System.out.println("计算机的信息如下：");
        System.out.println("CPU的品牌: " +cpu.getName() +"主频"+cpu.getzhuping());
        System.out.println("硬盘容量："+memory.getMemory());
        System.out.println("内存容量："+harddisk.getyingpan());
    }




}
