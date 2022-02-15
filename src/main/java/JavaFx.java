import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;



public class JavaFx extends Application {
    public static void run() {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        String version = System.getProperty("javafx.version");
        Label label = new Label("Hello from Javafx" + version);
        TextField hey = new TextField("Heyyy");
        Label label1 = new Label("Hello from JavaFX: Commit nr 2 " + version);
        Label label2 = new Label("Hej IT 62450!");
        Label label3 = new Label("Hej IT 62450!");
        GridPane pane = new GridPane();
        pane.setGridLinesVisible(true);
        pane.add(label1,0,0);
        pane.add(label2,1,1);
        pane.add(label3,2,2);
        //stackPane.getChildren().add(new Label(" hey"));
        //Scene scene = new Scene(stackPane, 640, 480);
        //stage.setScene(scene);
        Scene scene = new Scene(pane, 240, 100);
        stage.setScene(scene);
        stage.show();
    }
}
