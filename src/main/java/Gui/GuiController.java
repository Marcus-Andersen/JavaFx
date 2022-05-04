package Gui;

import Business.ekg.EKGObserver;
import Business.ekg.EkgController;
import Business.ekg.EkgControllerImpl;
import Data.EkgData;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Polyline;

public class GuiController implements EKGObserver {
    public Polyline polyline;
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
        polyline.getPoints().addAll(ekgData.getTime(),ekgData.getVoltage()*100);
    }
}
