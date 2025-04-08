import java.io.FileInputStream;
import java.io.IOException;
public class FileInputExample {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("example.txt")) {
            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
        } catch (IOException e) {
            System.out.println("File not found or unable to read the file.");
        }
    }
}
