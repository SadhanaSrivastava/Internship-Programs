package Banking_Application;

import java.util.Scanner;

public class BankApplication {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = null;
        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    sc.nextLine();

                    System.out.print("Enter account number: ");
                    int accNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter account holder name: ");
                    String name = sc.nextLine();

                    account = new BankAccount(accNo, name);

                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    if(account != null) {
                        System.out.print("Enter deposit amount: ");
                        double amount = sc.nextDouble();

                        account.deposit(amount);
                    } else {
                        System.out.println("Please create an account first!");
                    }
                    break;

                case 3:
                    if(account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double amount = sc.nextDouble();

                        account.withdraw(amount);
                    } else {
                        System.out.println("Please create an account first!");
                    }
                    break;

                case 4:
                    if(account != null) {
                        account.checkBalance();
                    } else {
                        System.out.println("Please create an account first!");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 5);

        sc.close();
    }
}
