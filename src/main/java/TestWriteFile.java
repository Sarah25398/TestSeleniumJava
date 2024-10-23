import java.io.*;
import java.util.Random;

public class TestWriteFile {

  public static String GenerateDataText(int length){
      String characters  ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
      StringBuilder text  = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            text.append(characters.charAt(random.nextInt(characters.length())));
        }
        return text.toString();
  }
  public static void WriteTextToFile(String text, String filePath) throws IOException {
      FileWriter writer;
      writer = new FileWriter(filePath);
      writer.write(text);
      writer.close();

  }
  public static void ReadDataFromFile(String filePath) throws IOException {
      FileReader reader = new FileReader(filePath);
      BufferedReader reader1 = new BufferedReader(reader);
      String line = reader1.readLine();
      System.out.println(line);

  }

  public static void main(String[] args) throws IOException {
      String Data = GenerateDataText(10);
      String filePath = "C:\\Users\\vela.os010\\IdeaProjects\\untitled\\TestDataFile";
      WriteTextToFile(Data,filePath);
      ReadDataFromFile(filePath);

  }



}
