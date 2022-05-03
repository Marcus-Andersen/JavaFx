package Business.ekg;

import Data.DatabaseConnector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLImplementation implements EkgDAO {
    @Override
    public void save(EkgDTO ekgDTO) {
        Connection conn = DatabaseConnector.getConnection();
        try {
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO weatherData(weatherStationId, windSpeed, windDirection, time) VALUES (?,?,?,?)");
            preparedStatement.setString(1,ekgDTO.getVoltage());
            preparedStatement.setDouble(2,ekgDTO.getTime());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<EkgDTO> load(Timestamp time) {
        List<EkgDTO> data = new ArrayList<>();
        Connection connection = DatabaseConnector.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM ekgData WHERE time > ? ");
            preparedStatement.setTimestamp(1,time);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                ekgDTO ekgDTO = new EkgDTO();
                ekgDTO.setVoltage(resultSet.getDouble("voltage"));
                ekgDTO.setTime(resultSet.getTimestamp("time"));
                data.add(ekgDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }
}
