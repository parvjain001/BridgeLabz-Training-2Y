import college.student.Student;
import college.faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Parv", 101);
        Faculty f = new Faculty("Sharma Sir", "Java Programming");

        s.display();
        f.display();
    }
}
