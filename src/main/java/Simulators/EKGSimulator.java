package Simulators;

import javafx.scene.shape.Polyline;

public class EKGSimulator {

    public static void measure() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //Dummy data generation
                    while(true) {
                        Thread.sleep(500);
                        if (observer != null) {
                            observer.handle(new EKGDataImpl(Math.random(), Math.random()));
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
