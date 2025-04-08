interface Shape{
    default void area(){
        System.out.println("Shape area is not defined");
    }
    default void colour(){
        System.out.println("Shape colour is not defined");
    }
}

class Circle extends Shape{
    public void area(){
        System.out.println("Circle area is "+(3.14*5*5));
    }
    static void colour(){
        System.out.println("Circle colour is red");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();
        Shape.colour();
    }
}
