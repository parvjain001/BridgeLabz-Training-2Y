import java.util.*;
abstract class CourseType {
    String name;
    CourseType(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
class ExamCourse extends CourseType {
    ExamCourse(String name) {
        super(name);
    }
}
class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) {
        super(name);
    }
}
class ResearchCourse extends CourseType {
    ResearchCourse(String name) {
        super(name);
    }
}
class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    void addCourse(T course) {
        courses.add(course);
    }
    List<T> getCourses() {
        return courses;
    }
    static void showAllCourses(List<? extends CourseType> courseList) {
        for (CourseType c : courseList) {
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Math Exam Course"));
        examCourses.addCourse(new ExamCourse("Physics Exam Course"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Software Engineering Project"));
        assignmentCourses.addCourse(new AssignmentCourse("DBMS Assignment"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research Course"));
        researchCourses.addCourse(new ResearchCourse("Data Science Thesis"));

        System.out.println("Exam Courses:");
        showAllCourses(examCourses.getCourses());

        System.out.println("\nAssignment Courses:");
        showAllCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch Courses:");
        showAllCourses(researchCourses.getCourses());
    }
}
