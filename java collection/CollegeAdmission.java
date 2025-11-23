import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        return name.equals(((Student)o).name);
    }
    public int hashCode() { return Objects.hash(name); }
    public int compareTo(Student s) { return s.marks - this.marks; }
    public String toString() { return name + " : " + marks; }
}

public class CollegeAdmission {
    public static void main(String[] args) {
        List<Student> applicants = new ArrayList<>();
        applicants.add(new Student("Parv", 92));
        applicants.add(new Student("Riya", 85));
        applicants.add(new Student("Parv", 92));

        Set<Student> shortlisted = new HashSet<>();
        for (Student s : applicants) if (s.marks >= 80) shortlisted.add(s);

        Queue<Student> interviewQueue = new LinkedList<>(shortlisted);

        TreeSet<Student> meritList = new TreeSet<>();
        while (!interviewQueue.isEmpty()) meritList.add(interviewQueue.poll());
    }
}
