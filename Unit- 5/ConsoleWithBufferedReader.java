import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;



public class ConsoleWithBufferedReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your name: ");
            String name = br.readLine();
            System.out.println("Hello, " + name);

            System.out.print("Enter your lucky number: ");
            int number = Integer.parseInt(br.readLine());
            System.out.println("Your lucky number is: " + number);
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
}
