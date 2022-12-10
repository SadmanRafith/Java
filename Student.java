import java.lang.*;

public class Student
{
    public String name;
    public int id;
    
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "John";
        s1.id = 123;
        
        Student s2 = new Student();
        s2.name = "Wick";
        s2.id = 456;
        
        Student s[] = new Student[2];
        s[0] = s1;
        s[1] = s2;
        
        System.out.println(s1.name);
        
        for(int i = 0; i<s.length; i++)
        {
            System.out.println(s[i].name);
        }
        
        
    }
}