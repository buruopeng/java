public class PC {
    private CPU cpu;
    private HardDisk HD;
    PC(CPU cpu){
        setCPU(cpu);
    }
    PC(HardDisk HD){
        setHardDisk(HD);
    }
    void setCPU(CPU cpu){
        this.cpu=cpu;
    }
    void setHardDisk(HardDisk HD){
        this.HD=HD;
    }
    public void show(){
        System.out.println("CPU速度："+cpu.getSpeed());
        System.out.println("CPU名称："+cpu.getName());
        System.out.println("CPU频率："+cpu.getFre());
        System.out.println("硬盘容量："+HD.getAmount());
        System.out.println("硬盘状态："+HD.getCondition());
    }
}
