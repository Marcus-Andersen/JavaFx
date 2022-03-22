import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class GuiController {
    //public Polyline poly;
    public Label label2;

    public void ekgSim(MouseEvent mouseEvent) {
        EKGSimulator.measure();
    }
}
