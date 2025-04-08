import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterExample {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("output.txt")) {
            writer.println("Hello, World!");
            writer.println("This is a test.");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
}
