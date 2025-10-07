class BankAccount {
    protected double balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = interestRate * 0.01 * balance;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(5.0);
        sa.deposit(1000);
        sa.addInterest();
        sa.displayBalance();
    }
}
