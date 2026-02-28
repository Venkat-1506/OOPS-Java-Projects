class BankAccount {
    private double balance;
    private AccountDetails details;

    BankAccount(AccountDetails details, double balance) {
        this.details = details;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addAmount(double amount) {
        balance += amount;
    }

    public boolean deductAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void displayAccount() {
        details.displayDetails();
        System.out.println("Balance : Rs " + balance);
    }
}
