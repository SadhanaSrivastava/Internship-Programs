package Banking_Application;

public class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;


    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully!");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void checkBalance() {
        System.out.println("Account Number is : " + accountNumber);
        System.out.println("Account Holder name is : " + accountHolderName);
        System.out.println("Available Balance is : " + balance);
    }
}
