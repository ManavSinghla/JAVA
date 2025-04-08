import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExaple {
    public static void main(String[] args) {
        String data="Hello, World!";
        try (FileOutputStream fos = new FileOutputStream("example.txt")) {
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
