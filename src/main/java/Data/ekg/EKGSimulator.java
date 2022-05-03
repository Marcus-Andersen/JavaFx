package Data.ekg;

import Business.ekg.EKGObserver;

//hhh
public class EKGSimulator implements Sims {
    private EKGObserver observer;
    double time;

    @Override
    public void record() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //Dummy data generation
                    while(true) {
                        time += Math.random();
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
