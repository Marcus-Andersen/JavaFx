package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static Connection connection;
    public static Connection getConnection(){
        try {
            if (connection == null || connection.isClosed()){
                connection = DriverManager.getConnection("jdbc:mysql://db.diplomportal.dk/chbu?" +
                        "user=s204814&password=IORTlOFEarsqvyYfAfBAN");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
