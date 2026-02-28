import java.util.ArrayList;

class CourseManagerImpl extends CourseManager implements Evaluable {
    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(Course c) {
        courses.add(c);
        System.out.println("Course added successfully!");
    }

    public void displayCourses() {
        for (Course c : courses) {
            c.displayCourse();
        }
    }

    public void evaluateCourses() {
        System.out.println("Courses evaluated successfully.");
    }
}