package Data;

import Business.EKGObserver;
public class EKGSimulator implements Sims{

    public static void measure() {
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
}
