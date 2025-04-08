import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputExample {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example.txt"))) {
            int data = bis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = bis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
