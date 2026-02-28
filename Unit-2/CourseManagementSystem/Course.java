class Course {
    private int courseId;
    private String courseName;
    private Instructor instructor;

    Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    Course(int courseId, String courseName, Instructor instructor) {
        this(courseId, courseName);
        this.instructor = instructor;
    }

    public void displayCourse() {
        System.out.println("Course ID : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Instructor : " +
                (instructor != null ? instructor.getInstructorDetails() : "Not Assigned"));
        System.out.println("--------------------------");
    }
}