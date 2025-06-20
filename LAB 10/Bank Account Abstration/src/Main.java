abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();
}

class SavingsAccount extends BankAccount {
    private double interestRate = 0.03;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("SavingsAccount: Insufficient funds.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit = 500;

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("CurrentAccount: Overdraft limit exceeded.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        BankAccount current = new CurrentAccount(1000);

        System.out.println("Initial Balances:");
        System.out.println("Savings: " + savings.getBalance());
        System.out.println("Current: " + current.getBalance());

        savings.deposit(500);
        current.deposit(300);

        savings.withdraw(200);
        current.withdraw(1500); // within overdraft limit

        System.out.println("\nAfter Transactions:");
        System.out.println("Savings: " + savings.getBalance());
        System.out.println("Current: " + current.getBalance());
    }
}
