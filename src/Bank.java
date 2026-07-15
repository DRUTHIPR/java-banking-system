import java.util.ArrayList;

public class Bank {


    private String bankName;

    private ArrayList<Customer> customers;

    private ArrayList<Account> accounts;



    // Constructor
    Bank(String bankName){

        this.bankName = bankName;

        customers = new ArrayList<>();

        accounts = new ArrayList<>();

    }



    // Add Customer
    public void addCustomer(Customer customer){

        customers.add(customer);

        System.out.println("Customer added successfully");

    }



    // Add Account
    public void addAccount(Account account){

        accounts.add(account);

        System.out.println("Account created successfully");

    }



    // Display Customers
    public void displayCustomers(){

        for(Customer customer : customers){

            customer.displayCustomerDetails();

        }

    }



    // Display Accounts
    public void displayAccounts(){

        for(Account account : accounts){

            account.displayAccountDetails();

        }

    }



    // Find Account
    public Account findAccount(int accountNumber){


        for(Account account : accounts){

            if(account.getAccountNumber() == accountNumber){

                return account;

            }

        }

        return null;

    }



    // ⭐ ADD TRANSFER MONEY HERE ⭐

    public void transferMoney(int fromAccountNumber, int toAccountNumber, double amount){


        Account sender = findAccount(fromAccountNumber);

        Account receiver = findAccount(toAccountNumber);



        if(sender == null || receiver == null){

            System.out.println("Account not found");

            return;

        }



        if(sender.getBalance() < amount){

            System.out.println("Insufficient balance");

            return;

        }



        sender.withdraw(amount);

        receiver.deposit(amount);



        System.out.println("Transfer successful");

    }


}