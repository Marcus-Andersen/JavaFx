package Business.ekg;

import Data.EkgData;

public interface EKGObserver{
    void handle(EkgData ekgData);

}
