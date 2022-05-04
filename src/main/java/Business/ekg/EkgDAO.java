package Business.ekg;
import Data.ekg.EkgDTO;

import java.sql.Timestamp;
import java.util.List;

public interface EkgDAO {
    void save(EkgDTO ekgDTO);

    List<EkgDTO> load(Timestamp time);
}
