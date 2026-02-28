class BankServiceImpl extends BankService implements Transaction {
    private BankAccount account;

    BankServiceImpl(BankAccount account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.addAmount(amount);
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw(double amount) {
        if (account.deductAmount(amount)) {
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void showBalance() {
        account.displayAccount();
    }
}