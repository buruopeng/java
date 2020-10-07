public class Test {
    public static void main(String args[]){
        CPU cpu=new CPU(4);
        HardDisk HD=new HardDisk(128);
        cpu.setSpeed(2200);
        cpu.setName(7000);
        cpu.setFre(4);
        HD.setAmount(200);
        HD.setCondition("固态");
        PC pc=new PC(cpu);
        pc.setCPU(cpu);
        pc.setHardDisk(HD);
        pc.show();
    }
}
