package Business.spo2;

public interface SpO2Controller {
    void startRecording();
    void registerObserver(SpO2Observer spO2Observer);
}
