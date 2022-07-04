package se.lexicon.workshop.model;

public class Customer {

    private static int customerIDSequencer = 9_000; //9001 // 9002

    protected static int getCurrentCustomerIDSequencer(){
        return customerIDSequencer;
    }

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    //Constructor - creating an object of a Customer
    public Customer(String firstName, String lastName, String email) {
        this.id = ++customerIDSequencer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
