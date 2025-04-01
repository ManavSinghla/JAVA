import java.util.Scanner;

class Laptop {
    private String brand;
    private String memory;
    private int screenSize;
    private int price;

    void setFeatures() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter laptop brand: ");
        brand = s.nextLine();
        System.out.print("Enter laptop memory: ");
        memory = s.nextLine();
        System.out.print("Enter laptop screen size: ");
        screenSize = s.nextInt();
        System.out.print("Enter laptop price: ");
        price = s.nextInt();
        s.close();
    }

    void displayFeatures() {
        System.out.println("Brand: " + brand);
        System.out.println("Memory: " + memory);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Price: " + price);
    }
}

public class TwoClasses {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.setFeatures();
        l.displayFeatures();
    }
}

