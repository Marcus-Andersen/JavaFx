package Data.ekg;

import Business.ekg.EKGObserver;

//hhh
public class EKGSimulator implements Sims {
    private EKGObserver observer;

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
                            observer.handle(new EKGDataImplementation(Math.random(), (int) Math.random()*10));
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
