package Data.SpO2;

import Business.spo2.SpO2Observer;

public interface SpO2DataRecorder {
    void record();
    void setObserver(SpO2Observer spObserver);
}
