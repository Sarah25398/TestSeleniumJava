package TestCase.PageFactory;

import ConnectionToDataBase.DBConfigure;
import ConnectionToDataBase.TestDBInLoginPage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class CreateAllBookingOutboundActiveQuotation {

    public static List<String> GetQuotationActiveID() throws SQLException {
        Connection connection = TestDBInLoginPage.DBConfigure();
        String query = "Select QuotationCode from dev2_booking.SubSellings where CustomerId ='VCU0110611393000' AND ModeOfTransportCode ='WH-CFSWH' AND RequestTypeCode =1;";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        List<String> QuotationCodes= new ArrayList<>();
        while (result.next()) {
            QuotationCodes.add(result.getString("QuotationCode"));
        }
        result.close();
        statement.close();
        connection.close();
        return QuotationCodes;
    }
    public void CreateAllBookingCFSOutbound(List<String> QuotationCodes) throws InterruptedException, SQLException {

        for(String QuotationCode:QuotationCodes){
            System.out.println(QuotationCode);
            CreateOutBoundBooking CreateOutBoundBooking = new CreateOutBoundBooking();
            CreateOutBoundBooking.setUp();
            CreateOutBoundBooking.createBookingOutboundData(QuotationCode);
            CreateOutBoundBooking.CloseBrowserTest();
        }
    }
    public static void main(String[] args) throws SQLException, InterruptedException {
        CreateAllBookingOutboundActiveQuotation booking = new CreateAllBookingOutboundActiveQuotation();
        List<String> QuotationCodes = GetQuotationActiveID();
        booking.CreateAllBookingCFSOutbound(QuotationCodes);


    }




}
