package Data.SpO2;

import Business.EKGObserver;
import Data.Sims;

public class SpO2Simulator implements Sims {
    @Override
    public void record() {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    @Override
    public void setObserver(EKGObserver observer) {

    }
}
