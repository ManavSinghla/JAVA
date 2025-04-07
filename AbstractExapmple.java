abstract class Subject {
    abstract void marks();
    abstract void difficulty();     //abstract method
    abstract void year();           //abstract method
}

class JavaCourse extends Subject {
    void marks() {
        System.out.println("Marks are calculated based on assignments and exams.");
    }
    void difficulty() {
        System.out.println("Java is a difficult language");
    }
    void year() {
        System.out.println("Second Year");
    }
}

public class AbstractExapmple {
    public static void main(String[] args) {
        JavaCourse course = new JavaCourse();
        course.difficulty();
        course.year();
        
    }
}

