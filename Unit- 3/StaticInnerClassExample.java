class Outer{
    static int a=10;

    static class Inner{
        void get(){
            System.out.println(a);
        }
    }
}

public class StaticInnerClassExample {
    public static void main(String[] args) {
        Outer.Inner a=new Outer.Inner();
        a.get();       
    }
}