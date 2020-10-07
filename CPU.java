public class CPU {
    private int speed;
    private int name;
    private int fre;
    CPU(int speed,int name){
        setSpeed(speed);
        setName(name);
    }
    CPU(int fre){
        setFre(fre);
    }

    public int getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed() {
        this.speed = speed;
    }

    public int getFre() {
        return fre;
    }

    public void setFre() {
        this.fre = fre;
    }


    public void setSpeed(int speed) {
        if (speed >0 && speed <10000) {
            this.speed = speed;
        }else{
            System.out.println("输入CPU速度错误");
        }
    }
    public void setName(int name) {
        this.name= name;

    }
    public void setFre(int fre) {
            this.fre = fre;
    }
}
