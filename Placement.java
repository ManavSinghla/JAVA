import java.util.*;

public class Placement{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>90){
            System.out.println("Grade A");
        }
        else if(a>70 && a<=90){
            System.out.println("Grade B");
        }
        else if(a>50 && a<=70){
            System.out.println("Only internship");
        }
        else{
            System.out.println("Not eligible");
        }
        s.close();
    }
}
