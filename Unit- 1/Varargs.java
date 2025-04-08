class Hello{
    public void getNames(String... n){
        for(String name : n){
            System.out.println(name);
        }
    }
public class Varargs {
    public static void main(String[] args){
            Hello h = new Hello();
            h.getNames("Rahul", "Rohan", "Rahul");
            h.getNames("Manav");

        }
    }
}
