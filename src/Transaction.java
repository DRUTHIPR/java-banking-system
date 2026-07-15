import java.time.LocalDateTime;


public class Transaction {


    private String type;
    private double amount;
    private LocalDateTime date;



    // Constructor

    Transaction(String type, double amount){

        this.type = type;
        this.amount = amount;
        this.date = LocalDateTime.now();

    }



    // Display transaction

    public void displayTransaction(){

        System.out.println(
                type + " : " + amount
        );

        System.out.println(
                "Date: " + date
        );

        System.out.println("----------------");

    }


}