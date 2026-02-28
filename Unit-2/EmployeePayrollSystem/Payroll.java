class Payroll {
    private double basicPay;
    private double allowance;
    private double deduction;

    Payroll(double basicPay, double allowance, double deduction) {
        this.basicPay = basicPay;
        this.allowance = allowance;
        this.deduction = deduction;
    }

    public double getNetSalary() {
        return basicPay + allowance - deduction;
    }
}