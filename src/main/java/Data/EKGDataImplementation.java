package Data;

public class EKGDataImplementation {

    private int time;

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    private double voltage;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public EKGDataImplementation(double voltage, int time){
        this.voltage = voltage;
        this.time = time;

    }
}
