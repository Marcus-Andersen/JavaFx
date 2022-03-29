package Business;

import Data.EkgData;

public interface EKGObserver {
    void startRecording();

    void handle(EkgData ekgData);

}
