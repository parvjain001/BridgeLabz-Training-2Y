import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    protected void addToMedicalHistory(String record) { medicalHistory.add(record); }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomRate;

    public InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted, double roomRate) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.roomRate = roomRate;
    }

    public double calculateBill() {
        return daysAdmitted * roomRate + 2000; // Additional treatment cost
    }

    public void addRecord(String record) {
        addToMedicalHistory(record);
        System.out.println("Record added for In-Patient: " + record);
    }

    public void viewRecords() {
        System.out.println("Viewing records for In-Patient: " + getName());
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee + 500; // Additional service charge
    }

    public void addRecord(String record) {
        addToMedicalHistory(record);
        System.out.println("Record added for Out-Patient: " + record);
    }

    public void viewRecords() {
        System.out.println("Viewing records for Out-Patient: " + getName());
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient(101, "Ravi", 35, "Fever", 5, 1500);
        OutPatient p2 = new OutPatient(102, "Sita", 28, "Cold", 800);

        p1.addRecord("Admitted for high fever and dehydration");
        p2.addRecord("Visited for regular checkup");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Total Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).viewRecords();
            }
            System.out.println();
        }
    }
}
