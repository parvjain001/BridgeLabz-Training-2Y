class Student {
    static String universityName = "Global Tech University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println(name + "'s grade updated to: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Parv", 101, "A");
        Student s2 = new Student("Shreya", 102, "B");
        s1.displayDetails();
        s2.displayDetails();
        s2.updateGrade("A+");
        Student.displayTotalStudents();
    }
}
