class Car{
    int a;

    static{
        System.out.println("Static Hello");
    }
    
    Car(){
        System.out.println("Constructor Hello");
    }
    
    {
        System.out.println("Instance Hello");
    }
}
public class StaticExample {
    public static void main(String[] args) {
        Car c=new Car();
        Car c1=new Car();
    }   
}
