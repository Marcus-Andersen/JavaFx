package Data.Puls;

import Data.PulsData;

public interface PulsObserver {
    void handle(PulsData pulsData);

}