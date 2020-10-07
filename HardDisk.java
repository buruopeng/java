public class HardDisk {
    private int amount;
    private String condition;
    HardDisk(int amount){
        setAmount(amount);
    }
    HardDisk(String condition){
        setCondition(condition);
    }
    int getAmount(){
        return amount;
    }
    String getCondition(){
        return condition;
    }
     void setAmount(int amount){
        if(amount>0&&amount<300000)
        this.amount=amount;
        else{
            System.out.println("输入硬盘容量与实际不符");
        }
    }
     void setCondition(String condition){
     this.condition=condition;
    }
}
