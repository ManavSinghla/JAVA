// import java.util.*;
public class Variable {
    static int s=10;
    int ins=20;

    public void counter(){
        s++;
        ins++;
        int l=30;
        System.out.println("Local: "+l);
        System.out.println("Static: "+s);
        System.out.println("Instance: "+ins);
    }

    public static void main(String[] abc){
        Variable v1=new Variable();
        v1.counter();
        System.out.println();
        Variable v2=new Variable();
        v2.counter();
    }
}

