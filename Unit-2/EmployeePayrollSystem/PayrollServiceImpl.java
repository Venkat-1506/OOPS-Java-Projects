class PayrollServiceImpl extends PayrollService implements Payable {
    private EmployeeDetails employee;
    private Payroll payroll;

    PayrollServiceImpl(EmployeeDetails employee, Payroll payroll) {
        this.employee = employee;
        this.payroll = payroll;
    }

    public double calculateSalary() {
        return payroll.getNetSalary();
    }

    public void showPayroll() {
        employee.displayEmployee();
        System.out.println("Net Salary : Rs " + calculateSalary());
    }
}