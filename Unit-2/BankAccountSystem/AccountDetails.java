class AccountDetails {
    private String accountNumber;
    private String holderName;

    AccountDetails(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + holderName);
    }
}