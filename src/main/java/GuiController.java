import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Polyline;

public class GuiController {
    public Polyline poly;
    public Label label2;

    public void buttonPressed(MouseEvent mouseEvent) {
        label2.setText("Starter hjertescanning...");
    }
}
