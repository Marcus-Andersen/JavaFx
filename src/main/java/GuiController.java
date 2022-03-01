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
                for (double i = 0; i < 100; i++) {
                    poly.getPoints().addAll(i,Math.random()*100);
                }


            }
        }).start();
    }
}
