package Business.ekg;

import Data.ekg.EkgData;

public interface EKGObserver {
    void startRecording();

    void handle(EkgData ekgData);

}
