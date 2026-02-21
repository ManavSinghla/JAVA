class Animal{
    void get(){
        System.out.println("Animal get class constructor");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Inside the Dog class constructor"); 
    }
}
public class Main {
    public static void main(String[] args) {
        Animal d=new Dog();
        d.get();
        // d.bark();
    }
}
