package Business.ekg;

import Data.ekg.EkgDTO;
import Data.ekg.EkgData;

import java.sql.Timestamp;

public class SQLGenerator implements EKGObserver {
    private EkgController ekgData;

    @Override
    public void handle(EkgData ekgData) {
        this.ekgData = (EkgController) ekgData;
    }

    @Override
    public void run() {
        while (true){
            EkgDTO ekgDTO = new EkgDTO();
            EkgDTO.setTime(new Timestamp(System.currentTimeMillis()));
            EkgDTO.setVoltage(Math.random()*30);
            if (EKGObserver != null) {
                EKGObserver.handle(ekgDTO);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
