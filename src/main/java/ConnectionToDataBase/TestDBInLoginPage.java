package ConnectionToDataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBInLoginPage {
    static final String Host ="103.191.146.112";
    static final String DataBase ="dev2_booking";
    static final String UserName ="dev2_qc";
    static final String PassWord ="7oSd3h5_ez2cS9sy3OvA6xVfBsRI84IJMEC3";
    private static final String JDBC_URL = "jdbc:mysql://" + Host +  ":23307/"  + DataBase;
    public static Connection DBConfigure() throws SQLException {
        return DriverManager.getConnection(JDBC_URL,UserName,PassWord);
    }
    public static void main(String[] args) throws SQLException {
        DBConfigure();
    }


}
