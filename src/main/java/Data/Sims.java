package Data;

import Business.EKGObserver;

public interface Sims {
    void record();
    void setObserver(EKGObserver observer);

}