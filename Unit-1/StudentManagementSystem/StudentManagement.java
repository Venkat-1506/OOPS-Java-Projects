import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter StudentDetails:");
        String input = sc.nextLine();
        String[] data = input.split(" ");

        int id = Integer.parseInt(data[0]);
        String name = data[1];
        int age = Integer.parseInt(data[2]);
        String course = data[3];

        Student s1 = new Student(id, name, age, course);
        s1.display();

        sc.close();
    }
}