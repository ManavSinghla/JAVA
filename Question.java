// import java.util.*;

public class Question {
    public static void main(String[] args){
        // Scanner s=new Scanner(System.in);
        // String n=s.nextLine();
        // s.close();
        StringBuilder sb=new StringBuilder(" Manav Gupta ");
        sb.insert(6, " Singla");
        System.out.println(sb.toString().toUpperCase());
        String s1= sb.toString();
        String s2= s1.repeat(5);
        StringBuilder sb1=new StringBuilder(s2);
        System.out.println(sb1.reverse());

    }
}

