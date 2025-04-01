import java.util.Scanner;

class Rectangle{
    private int l;
    private int b;

    public Rectangle(){
        l=1;
        b=1;
    }
    public Rectangle(int x, int y){
        l=x;
        b=y;
    }
    public void area(){
        System.out.println("Area is: "+(l*b));
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(x,y);
        r1.area();
        r2.area();
        s.close();
    }
}

