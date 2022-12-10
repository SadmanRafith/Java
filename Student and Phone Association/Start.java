import java.lang.*;

public class Start {
    public static void main(String[] args) {
        Phone p1 = new Phone("Xiaomi Poco X2");
        Phone p2 = new Phone("Samsung Z flip");

        Student s1 = new Student(70, 2);

        s1.InsertPhone(p1);
        s1.InsertPhone(p2);

        System.out.println("--------------------------");
        s1.RemovePhone(p1);

        s1.DisplayStudent();
    }
}
