import java.util.Scanner;

class Type{
    public static void main(String[] a){
        Scanner s= new Scanner(System.in);
        int i=5;
        float f=i;
	float f1=(float)10.45;
        char c=(char)i;
        double d=i;
	int i1=(int)f1;
        System.out.println(i);
        System.out.println(f);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f1);
        System.out.println(i1);
        s.close();
    }
}