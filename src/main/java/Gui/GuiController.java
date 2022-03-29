package Gui;

import Data.EkgData;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Polyline;

public class GuiController {
    public Polyline poly;

    public void ekgSim(MouseEvent mouseEvent) {

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
