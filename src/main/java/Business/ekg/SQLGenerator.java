package Business.ekg;

import Data.EkgDTO;

import java.sql.Timestamp;

public class SQLGenerator implements EkgObservable {
    private EkgObservable EkgObservable;

    @Override
    public void register(EKGObserver EkgObserver) {
        this.EkgObservable = EkgObservable;
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
