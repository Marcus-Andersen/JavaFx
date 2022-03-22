import javafx.scene.shape.Polyline;

public class EKGSimulator {
    public static Polyline poly;

    public static void measure() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (double i = -15; i < 60; i++) {
                    poly.getPoints().addAll(i*10,Math.random()*300);
                    try{
                        Thread.sleep(500);
                    }
                    catch (Exception e){}
                }
            }
        }).start();
    }
}
