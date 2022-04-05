package Data.SpO2;

import Business.spo2.SpO2Observer;
import Data.ekg.Sims;

public class SpO2Simulator implements Sims {
    @Override
    public void record() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                double sp;
                int SpO2 = 97;
                while(true){
                    sp = Math.random();
                    if (sp =< 0.25){
                        SpO2 -= 1;
                    }
                    else if (sp => 0.75){
                        SpO2 += 1;
                    }
                }
            }
        }).start();
    }

    @Override
    public void setObserver(SpO2Observer spObserver) {this.spObserver;}
}
