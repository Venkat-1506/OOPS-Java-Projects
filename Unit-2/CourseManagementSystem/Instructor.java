class Instructor {
    private String name;
    private String department;

    Instructor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getInstructorDetails() {
        return name + " (" + department + ")";
    }
}