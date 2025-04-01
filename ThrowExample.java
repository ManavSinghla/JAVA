public class ThrowExample {
    public static void main(String[] args) {
        int age=10;
        if(age<18){
            throw new ArithmeticException("Age is less than 18");
        }
        else{
            System.out.println("Age is greater than 18");
        }
        System.out.println("123");
    }
}
