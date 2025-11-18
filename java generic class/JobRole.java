import java.util.*;

abstract class JobRole {
    String title;
    JobRole(String title) {
        this.title = title;
    }
    public String toString() {
        return title;
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    private T jobRole;
    private String candidateName;

    Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    T getJobRole() {
        return jobRole;
    }

    String getCandidateName() {
        return candidateName;
    }

    public String toString() {
        return candidateName + " - " + jobRole;
    }
}

class ResumeScreening {
    static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole r : roles) {
            System.out.println("Screening resumes for: " + r);
        }
    }

    public static void main(String[] args) {
        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        screenResumes(roles);

        Resume<SoftwareEngineer> r1 = new Resume<>("Parv Jain", new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Shreya", new DataScientist());
        Resume<ProductManager> r3 = new Resume<>("Amit", new ProductManager());

        System.out.println("\nResumes Processed:");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
