import java.util.*;

class laptop{
    String brand;
    double price;
    int memory;

    public laptop(String brand, double price, int memory) {
        this.brand = brand;
        this.price = price;
        this.memory = memory;
    }
    public String toString(){
        return "Brand: " + brand + ", Price: " + price + ", Memory: " + memory;
    }
}

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<laptop> l= new ArrayList<>();
        l.add(new laptop("Dell", 50000, 8));
        System.out.println("Laptop : " + l.get(0));
    }
}
