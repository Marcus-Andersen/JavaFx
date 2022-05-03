package Business.ekg;

import java.sql.Timestamp;
import java.util.List;

public interface EkgDAO {
    void save(EkgDTO ekgDTO);

    List<EkgDTO> load(Timestamp time);
}
