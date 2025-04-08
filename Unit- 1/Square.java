public class Square {
    int square(int a,int b){
        return a*b;
    }
    double square(double a,double b){
        return a*b;
    }
    float square(float a,float b){
        return a*b;
    }
    public static void main(String[] args) {
        Square s=new Square();
        System.out.println(s.square(2,2));
        System.out.println(s.square(2.4,2.8));
        System.out.println(s.square(2.4f,2.8f));
    }
}

