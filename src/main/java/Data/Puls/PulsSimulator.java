package Data.Puls;

import Business.Puls.PulsObserver;

public class PulsSimulator implements SimsPuls {
    private PulsObserver observer;
    double time;

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
                            observer.handle(new PulsDataImplementation( (int) Math.random()*10));
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }

    @Override
    public void setObserver(PulsObserver observer) { this.observer = observer; }
}
