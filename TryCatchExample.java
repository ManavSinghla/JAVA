public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int arr[]={1,2,3};
            System.out.println(arr[5]);
            int x = 10 / 0;
            System.out.println("Result is: " +x);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurred");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds Exception Occurred");
        }
        catch(Exception e){
            System.out.println("Some Exception Occurred");
        }
        finally{
            System.out.println("This is finally block");
        }
    }
}
