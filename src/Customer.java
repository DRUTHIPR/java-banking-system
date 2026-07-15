public class Customer {

    private String name;
    private int customerId;
    private String phoneNumber;


    // Constructor
    Customer(String name, int customerId, String phoneNumber){

        this.name = name;
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;

    }


    // Getters

    public String getName(){

        return name;

    }


    public int getCustomerId(){

        return customerId;

    }


    public String getPhoneNumber(){

        return phoneNumber;

    }


    // Display details

    void displayCustomerDetails(){

        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Phone: " + phoneNumber);

    }

}