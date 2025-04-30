class Outer{
    int x=10;

    class Inner{

        void get(){
            System.out.println(x);
        }
    }
}

public class NonStaticClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner i=o.new Inner();
        i.get();
    }
}
