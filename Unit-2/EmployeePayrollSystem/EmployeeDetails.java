class EmployeeDetails {
    private int empId;
    private String empName;

    EmployeeDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public void displayEmployee() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
    }
}