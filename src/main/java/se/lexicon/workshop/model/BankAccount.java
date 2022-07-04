package se.lexicon.workshop.model;

public class BankAccount {

    private static int bankAccountIDSequencer = 60;

    public static int getCurrentBankAccountIDSequencer() {
        return bankAccountIDSequencer;
    }

    private int id;
    private double balance;
    private Customer owner;

    public BankAccount(double balance, Customer owner) {
        this.id = ++bankAccountIDSequencer;
        this.balance = balance;
        this.owner = owner;
    }

    public void withdraw(double amount){
        if (amount < 0) {
            throw new IllegalArgumentException("Amount was negative");
        }

        if (amount > this.balance){
            throw new IllegalArgumentException("Amount is to big, not sufficient funds.");
        }

        this.balance = this.balance - amount;
    }

    public void deposit(double amount){

        if (amount < 0) {
            throw new IllegalArgumentException("Amount was negative");
        }

        this.balance = this.balance + amount;
    }

    public int getId() {
        return id;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", owner=" + owner +
                '}';
    }
}
