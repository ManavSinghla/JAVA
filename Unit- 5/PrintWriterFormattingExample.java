import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterFormattingExample {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("employee.txt")) {
            writer.println("Employee Details:");
            writer.println("====================");
            writer.printf("%-15s %-10s %-10s%n", "Name", "Position", "Salary");
            writer.println("-------------------------------");
            writer.printf("%-15s %-10s %-10.2f%n", "Alice", "Manager", 75000.0);
            writer.printf("%-15s %-10s %-10.2f%n", "Bob", "Developer", 55000.5);
            writer.printf("%-15s %-10s %-10.2f%n", "Eve", "Analyst", 65000.25);
            writer.println("-------------------------------");
            writer.printf("Total Employees: %d%n", 3);
            writer.printf("Average Salary: %.2f%n", (75000.0 + 55000.5 + 65000.25) / 3);
            writer.println("====================");
            writer.println("End of Report");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Employee details written to employee.txt");
    }
}