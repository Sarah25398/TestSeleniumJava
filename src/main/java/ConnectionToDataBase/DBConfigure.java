package ConnectionToDataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConfigure {
    public static void GetLoginData() throws SQLException {
        Connection connection=TestDBInLoginPage.DBConfigure();
        String query ="SELECT Email from dev3_customerRfi.User where email ='vela.os015@itlvncom.onmicrosoft.com'; ";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        while(result.next()){
            String emailUser = result.getString("Email");
            System.out.println(emailUser);
        }
    }
    public static void main(String[] args) throws SQLException {
        GetLoginData();
    }
}
