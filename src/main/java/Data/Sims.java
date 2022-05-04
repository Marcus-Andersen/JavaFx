package Data;

import Business.ekg.EKGObserver;

public interface Sims {
    void record();
    void setObserver(EKGObserver observer);

}
