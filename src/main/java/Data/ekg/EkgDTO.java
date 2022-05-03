package Data.ekg;

public class EkgDTO implements EkgData{
    private double time;
    private double voltage;

    public EkgDTO(double voltage, double time){
        this.voltage = voltage;
        this.time = time;

    }
    @Override
    public double getVoltage() {
        return voltage;
    }

    @Override
    public void setVoltage(double voltage) {
        this.voltage = voltage;
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
