package Data.SpO2;

import Business.spo2.SpO2Observer;

public class SpO2Simulator implements SpO2DataRecorder {
    private SpO2Observer spObserver;

    @Override
    public void record() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                double sp;
                int SpO2 = 97;
                while(true){
                    sp = Math.random();
                    if (sp <= 0.25){
                        SpO2 -= 1;
                    }
                    else if (sp >= 0.75){
                        SpO2 += 1;
                        if (SpO2 > 100){
                            SpO2 = 99;
                        }
                    }
                }
            }
        }).start();
    }

    @Override
    public void setObserver(SpO2Observer spObserver) {this.spObserver = spObserver;}
}
