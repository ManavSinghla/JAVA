import java.util.*;
public class StringExaple {
    public static void main(String[] args) {
        String a="Manav";
        String b=a.substring(0,2);
        System.out.println(b);
        
        String c="Manav";
        String d=new String("Manav");
        System.out.println(a.equals(d));
        System.out.println(a==d);
        
        System.out.println(a.contains("ana"));
        
        String[] arr=a.split("");
        for(String i:arr){
            System.out.println(i);
        }
    }
}
