interface Greet{
    void sayHello();
}

public class AnnomnusClass {
    public static void main(String[] args) {
        Greet a=new Greet() {
            public void sayHello() {
                System.out.println("Hello World");
            }
        };
        a.sayHello();
    }
}
