class Animal{
    Animal(){
        System.out.println("Inside the Animal class constructor");
    }
    
    void get(){
        System.out.println("Animal get class constructor");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("Inside the Dog class constructor"); 
        super.get();
    }
}
public class FirstInheritanceExample {
    public static void main(String[] args) {
        Dog d=new Dog();
        System.out.println(d.getClass());
    }
}
