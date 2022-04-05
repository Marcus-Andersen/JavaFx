package Gui;

import Business.ekg.EKGObserver;
import Business.ekg.EkgController;
import Business.ekg.EkgControllerImpl;
import Data.ekg.EkgData;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class GuiController implements EKGObserver {
    EkgController ekgController = new EkgControllerImpl();
    @FXML
    public TextArea ekgView;

    public void startEkg(MouseEvent mouseEvent) {
        ekgController.startRecording();
        ekgController.registerObserver(this);
    }

    @Override
    public void handle(EkgData ekgData) {
        ekgView.setText(ekgView.getText()+"\n" + ekgData);
    }
}
