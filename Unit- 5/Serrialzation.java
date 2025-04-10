// You are using Java
//Object Serialization
import java.io.*;
class Student implements Serializable
{
    private static final long serialVersionUID = 12345678L;
    String name;
    int age;
    transient String password;   //not serialized
    
    public Student(String name, int age, String password)
    {
        this.name = name;
        this.age = age;
        this.password = password;
    }
    
    void display()
    {
        System.out.println("Name: "+name+"\tAge: "+age+"\tPassword: "+password);
    }
}

class SerializationExample
{
    public static void main(String[] args)
    {
        Student st1 = new Student("Manav",21,"123");
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser")))
        {
            out.writeObject(st1);
            System.out.println("Object serialized successfully!");
        }
        
        catch(IOException e)
        {
            System.out.println("Error occurred: Serialization Unsuccessful!");
        }
    }
}