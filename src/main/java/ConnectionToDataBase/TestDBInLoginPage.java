package ConnectionToDataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBInLoginPage {
    static final String Host ="103.191.146.112";

    static final String DataBase ="dev3_customerRfi";
    static final String UserName ="dev3_qc";
    static final String PassWord ="aly0OikpzCAey2YjtEvG";
    private static final String JDBC_URL = "jdbc:mysql://" + Host +  ":23307/"  + DataBase;
    public static Connection DBConfigure() throws SQLException {
        return DriverManager.getConnection(JDBC_URL,UserName,PassWord);
    }
    public static void main(String[] args) throws SQLException {
        DBConfigure();
    }


}
