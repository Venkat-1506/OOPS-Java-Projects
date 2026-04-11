package HospitalManagementSystem;
import java.util.*;

interface PersonOperations {
    void displayDetails();
    void getRole();
}

class HospitalMember {
    protected String name;
    protected int age;
    static String hospitalName = "City Care Hospital";

    public HospitalMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final void hospitalRules() {
        System.out.println("Follow hospital hygiene rules.");
    }

    public static void displayHospitalName() {
        System.out.println("Hospital: " + hospitalName);
    }
}

class Doctor extends HospitalMember implements PersonOperations {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public void getRole() {
        System.out.println("Role: Doctor");
    }

    public void displayDetails() {
        System.out.println("--- Doctor Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
    }
}

class Patient extends HospitalMember implements PersonOperations {
    private String disease;

    public Patient(String name, int age, String disease) {
        super(name, age);
        this.disease = disease;
    }

    public void getRole() {
        System.out.println("Role: Patient");
    }

    public void displayDetails() {
        System.out.println("--- Patient Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
    }
}

public class HospitalManagementSystem{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1. Doctor");
        System.out.println("2. Patient");
        System.out.print("Enter Choice: ");
        int choice = s.nextInt();
        s.nextLine();

        System.out.print("Enter Name: ");
        String name = s.nextLine();

        System.out.print("Enter Age: ");
        int age = s.nextInt();
        s.nextLine();

        PersonOperations p;

        if (choice == 1) {
            System.out.print("Enter Specialization: ");
            String spec = s.nextLine();
            p = new Doctor(name, age, spec);
        } else {
            System.out.print("Enter Disease: ");
            String dis = s.nextLine();
            p = new Patient(name, age, dis);
        }

        HospitalMember.displayHospitalName();
        p.getRole();
        p.displayDetails();

        s.close();
    }
}