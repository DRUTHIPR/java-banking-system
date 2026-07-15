import java.util.ArrayList;

public class Account {

    private int accountNumber;
    private double balance;
    private Customer customer;
    private ArrayList<Transaction> transactions;


    // Constructor
    public Account(int accountNumber, double balance, Customer customer) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
        this.transactions = new ArrayList<>();

    }


    // Deposit money
    public void deposit(double amount) {

        if(amount > 0) {

            balance += amount;

            transactions.add(
                    new Transaction("Deposit", amount)
            );

            System.out.println(amount + " deposited successfully");

        }
        else {

            System.out.println("Invalid amount");

        }

    }



    // Withdraw money
    public void withdraw(double amount) {

        if(amount <= balance) {

            balance -= amount;

            transactions.add(
                    new Transaction("Withdraw", amount)
            );

            System.out.println(amount + " withdrawn successfully");

        }
        else {

            System.out.println("Insufficient balance");

        }

    }



    // Get balance
    public double getBalance() {

        return balance;

    }



    // Get account number
    public int getAccountNumber() {

        return accountNumber;

    }



    // Display account details
    public void displayAccountDetails() {

        customer.displayCustomerDetails();

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);

    }



    // Transaction history
    public void showTransactionHistory() {

        System.out.println("Transaction History");

        for(Transaction transaction : transactions) {

            transaction.displayTransaction();

        }

    }

}
