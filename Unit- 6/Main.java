class student{
    String name;
    {
        System.out.println("Instance block called");
    }
    student (String name){
        this.name=name;
    }
    void get(){
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        student st=new student("Manav");
        st.get();
    }
}
