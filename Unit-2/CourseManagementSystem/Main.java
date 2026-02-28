import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseManagerImpl manager = new CourseManagerImpl();
        int choice;

        do {
            System.out.println("1.Add Course 2.Display 3.Evaluate 4.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Course ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Course Name: ");
                String cname = sc.nextLine();

                System.out.print("Instructor Name: ");
                String iname = sc.nextLine();

                System.out.print("Department: ");
                String dept = sc.nextLine();

                Instructor instructor = new Instructor(iname, dept);
                Course course = new Course(id, cname, instructor);
                manager.addCourse(course);
            } 
            else if (choice == 2) {
                manager.displayCourses();
            } 
            else if (choice == 3) {
                manager.evaluateCourses();
            }

        } while (choice != 4);

        sc.close();
    }
}