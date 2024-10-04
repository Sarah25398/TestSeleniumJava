package utility;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {

    public static void main(String[] args) {
        String csvFile = "credentials.csv";
        try (FileWriter writer = new FileWriter(csvFile)) {
            // Write the header
            writer.append("username,");
            // Write credentials
            writer.append("testUser1,");
            writer.append("testUser2,");
            writer.append("testUser3,testPass3\n");
            System.out.println("Credentials written to CSV file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






}
