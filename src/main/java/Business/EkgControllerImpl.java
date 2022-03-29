package Business;

import Data.EKGSimulator;
import Data.EkgData;
import Data.Sims;

public class EkgControllerImpl implements EkgController, EKGObserver{
    Sims ekgDataRecorder = new EKGSimulator();
    private EKGObserver observer;

    @Override
    public void startRecording(){
        ekgDataRecorder.record();
        ekgDataRecorder.setObserver(this);
    }

    @Override
    public void registerObserver(EKGObserver ekgObserver){this.observer = ekgObserver;}

    @Override
    public void handle(EkgData ekgData){
        if(observer != null){
            observer.handle(ekgData);
        }
    }
}
