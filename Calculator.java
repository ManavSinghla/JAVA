import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String operation=s.next();
        int a=s.nextInt();
        int b=s.nextInt();
        if (operation.equals("+")){
            System.out.println(a+b);
        }
        else if(operation.equals("-")){
            System.out.println(a-b);
        }
        else if(operation.equals("*")){
            System.out.println(a*b);
        }
        else if(operation.equals("/")){
            System.out.println(a/b);
        }
        else{
            System.out.println("Invalid operation");
        }
        s.close();
    }   
}
