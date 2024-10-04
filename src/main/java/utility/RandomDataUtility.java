package utility;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomDataUtility {

    // Function to generate a random email
    public static String generateRandomEmail() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder email = new StringBuilder();
        Random random = new Random();

        // Generate random email prefix (10 characters)
        for (int i = 0; i < 10; i++) {
            email.append(characters.charAt(random.nextInt(characters.length())));
        }
        // Append domain
        email.append("@yopmail.com");
        return email.toString();
    }

    // Function to generate random text
    public static String generateRandomText() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder text = new StringBuilder();
        Random random = new Random();

        // Generate random text (10 characters)
        for (int i = 0; i < 10; i++) {
            text.append(characters.charAt(random.nextInt(characters.length())));
        }
        return text.toString();
    }

    // Function to write generated email and text to a file
    public static void writeEmailAndTextToFile(String email, String text, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("email=" + email + "\n");
            writer.write("text=" + text + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to read the email and text from a file
    public static Map<String, String> readEmailAndTextFromFile(String filePath) {
        Map<String, String> data = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("email=")) {
                    data.put("email", line.split("=")[1]);
                } else if (line.startsWith("text=")) {
                    data.put("text", line.split("=")[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void generateAndSaveEmailAndText(String filePath) {
        // Generate new random email and text
        String email = generateRandomEmail();
        String text = generateRandomText();

        // Save to file
        writeEmailAndTextToFile(email, text, filePath);
    }
}

