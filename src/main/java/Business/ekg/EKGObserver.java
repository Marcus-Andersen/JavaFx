package Business.ekg;

import Data.ekg.EkgData;

public interface EKGObserver {
    void handle(EkgData ekgData);

}
