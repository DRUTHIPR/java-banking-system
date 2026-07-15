import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        Bank bank = new Bank("State Bank of Java");



        // Customers

        Customer c1 = new Customer(
                "Druthi",
                101,
                "9876543210"
        );


        Customer c2 = new Customer(
                "Rahul",
                102,
                "9999999999"
        );



        // Accounts

        Account acc1 = new Account(
                5001,
                10000,
                c1
        );


        Account acc2 = new Account(
                5002,
                5000,
                c2
        );



        // Add to bank

        bank.addCustomer(c1);
        bank.addCustomer(c2);


        bank.addAccount(acc1);
        bank.addAccount(acc2);




        int choice;



        do {


            System.out.println("\n===== STATE BANK OF JAVA =====");

            System.out.println("1. Display Accounts");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");


            System.out.print("Enter choice: ");

            choice = sc.nextInt();



            switch(choice) {



                case 1:

                    bank.displayAccounts();

                    break;




                case 2:

                    System.out.print("Enter account number: ");

                    int depositAccount = sc.nextInt();


                    Account dAccount =
                            bank.findAccount(depositAccount);


                    if(dAccount != null) {

                        System.out.print("Enter amount: ");

                        double amount = sc.nextDouble();

                        dAccount.deposit(amount);

                    }
                    else {

                        System.out.println("Account not found");

                    }


                    break;




                case 3:

                    System.out.print("Enter account number: ");

                    int withdrawAccount = sc.nextInt();


                    Account wAccount =
                            bank.findAccount(withdrawAccount);



                    if(wAccount != null) {


                        System.out.print("Enter amount: ");

                        double amount = sc.nextDouble();


                        wAccount.withdraw(amount);

                    }
                    else {

                        System.out.println("Account not found");

                    }


                    break;




                case 4:

                    System.out.print("Sender account number: ");

                    int sender = sc.nextInt();



                    System.out.print("Receiver account number: ");

                    int receiver = sc.nextInt();



                    System.out.print("Amount: ");

                    double transferAmount = sc.nextDouble();



                    bank.transferMoney(
                            sender,
                            receiver,
                            transferAmount
                    );


                    break;




                case 5:

                    System.out.print("Enter account number: ");

                    int statementAccount = sc.nextInt();



                    Account sAccount =
                            bank.findAccount(statementAccount);



                    if(sAccount != null) {

                        sAccount.showTransactionHistory();

                    }
                    else {

                        System.out.println("Account not found");

                    }


                    break;




                case 6:

                    System.out.println(
                            "Thank you for using State Bank of Java"
                    );

                    break;



                default:

                    System.out.println("Invalid choice");


            }



        } while(choice != 6);



        sc.close();


    }

}