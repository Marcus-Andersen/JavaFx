package Business.ekg;

import Business.ekg.EKGObserver;

public interface EkgController {
    void startRecording();
    void registerObserver(EKGObserver ekgObserver);
}
