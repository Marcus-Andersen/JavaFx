package Data.Puls;

public class PulsDataImplementation implements PulsData{
    private double time;
    private int puls;

    public EKGDataImplementation(int p, double time){
        this.time = time;
        this.puls = p;

    }
    @Override
    public double getVoltage() {
        return p;
    }

    @Override
    public void setVoltage(double voltage) {
        this.p = p;
    }

    @Override
    public double getTime() {
        return time;
    }

    @Override
    public void setTime(double time) {
        this.time = time;
    }


}