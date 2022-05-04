package Data;

import Business.ekg.EKGObserver;

import java.sql.Timestamp;

//hhh
public class EKGSimulator implements Sims {
    private EKGObserver observer;
    Timestamp time;

    @Override
    public void record() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //Dummy data generation
                    while(true) {
                        Thread.sleep(500);
                        if (observer != null) {
                            observer.handle(new EkgDTO(Math.random(),  time));

                        }

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }

    @Override
    public void setObserver(EKGObserver observer) { this.observer = observer; }
}
