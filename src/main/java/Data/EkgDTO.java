package Data;

import java.sql.Timestamp;

public class EkgDTO implements EkgData{
    private Timestamp time;
    private double voltage;

    public EkgDTO(double voltage, Timestamp time){
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
    public Timestamp getTime() {
        return time;
    }

    @Override
    public static void setTime(Timestamp time) {
        this.time = time;
    }

}
