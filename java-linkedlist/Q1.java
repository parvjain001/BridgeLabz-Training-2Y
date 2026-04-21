class Student {
    int roll, age;
    String name, grade;
    Student next;

    Student(int r, String n, int a, String g) {
        roll = r;
        name = n;
        age = a;
        grade = g;
    }
}

class StudentList {
    Student head;

    void addStart(Student s) {
        s.next = head;
        head = s;
    }

    void addEnd(Student s) {
        if (head == null) {
            head = s;
            return;
        }
        Student t = head;
        while (t.next != null) t = t.next;
        t.next = s;
    }

    void delete(int roll) {
        if (head == null) return;

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        Student t = head;
        while (t.next != null && t.next.roll != roll) t = t.next;

        if (t.next != null) t.next = t.next.next;
    }

    Student search(int roll) {
        Student t = head;
        while (t != null) {
            if (t.roll == roll) return t;
            t = t.next;
        }
        return null;
    }

    void updateGrade(int roll, String g) {
        Student s = search(roll);
        if (s != null) s.grade = g;
    }

    void display() {
        Student t = head;
        while (t != null) {
            System.out.println(t.roll + " " + t.name + " " + t.grade);
            t = t.next;
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        StudentList list = new StudentList();

        list.addEnd(new Student(1, "Parv", 20, "A"));
        list.addEnd(new Student(2, "Raj", 21, "B"));
        list.addStart(new Student(3, "Amit", 19, "C"));

        System.out.println("All Students:");
        list.display();

        System.out.println("\nAfter deleting roll 2:");
        list.delete(2);
        list.display();

        System.out.println("\nAfter updating grade of roll 1:");
        list.updateGrade(1, "A+");
        list.display();

        System.out.println("\nSearch roll 3:");
        Student s = list.search(3);
        if (s != null) {
            System.out.println("Found: " + s.name);
        } else {
            System.out.println("Not Found");
        }
    }
}