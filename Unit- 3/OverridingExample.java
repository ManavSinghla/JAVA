class Animal{
    void get(){
        System.out.println("Sound");
    }
}

class Dog extends Animal{
    void get(){
        super.get();
        System.out.println("Bark...");
    }
}
public class OverridingExample {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.get();
    }
}
