import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class GuiController {
    public Polyline poly;
    public Label label2;

    public void buttonPressed(MouseEvent mouseEvent) {
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
