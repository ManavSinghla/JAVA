class Outer {
    void out() {
        int x = 10;
        class Inner {
            void get() {
                System.out.println(x);
            }
        }
        Inner i = new Inner();
        i.get();

    }
}

public class LocalInnerclass {
    public static void main(String[] args) {
        Outer a=new Outer();
        a.out();
    }
}
