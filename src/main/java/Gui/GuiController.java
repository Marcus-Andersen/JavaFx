package Gui;

import Business.ekg.EKGObserver;
import Business.ekg.EkgController;
import Business.ekg.EkgControllerImpl;
import Data.EkgData;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Polyline;

import java.sql.Timestamp;

public class GuiController implements EKGObserver {
    public Polyline polyline;
    EkgController ekgController = new EkgControllerImpl();
    @FXML
    public TextArea ekgView;
    private Timestamp startTime;

    public void startEkg(MouseEvent mouseEvent) {
        ekgController.startRecording();
        this.startTime = new Timestamp(System.currentTimeMillis());
        ekgController.registerObserver(this);
    }

    @Override
    public void handle(EkgData ekgData) {
        ekgView.setText(ekgView.getText()+"\n" + ekgData);
        //Bruger getTime metoden, og bruger så en anden getTime metode, som konvertere fra Timestamp til long, og
        // dividere med 1000 for at få sekunder
        polyline.getPoints().addAll((ekgData.getTime().getTime()-startTime.getTime())/250.0,ekgData.getVoltage()*100);
    }
}
