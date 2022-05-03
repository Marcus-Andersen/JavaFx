package Business.ekg;

import java.sql.Timestamp;

public class SQLGenerator implements EkgController {
    private EkgController ekgController;

    @Override
    public void register(EkgController ekgController) {
        this.ekgController = ekgController;
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
