package Gui;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Polyline;

public class GuiControllerPuls {
    public Polyline poly;

    public void pulsSim(MouseEvent mouseEvent) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 250; i++) {
                    poly.getPoints().addAll((double) (i*10),Math.random()*300);
                    System.out.println("Hej");
                    try{
                        Thread.sleep(500);
                    }
                    catch (Exception e){}
                }
            }
        }).start();
    }
}
