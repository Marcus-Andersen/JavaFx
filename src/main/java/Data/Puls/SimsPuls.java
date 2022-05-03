package Data.Puls;

import Business.Puls.PulsObserver;

public interface SimsPuls {
    void record();
    void setObserver(PulsObserver observer);

}
