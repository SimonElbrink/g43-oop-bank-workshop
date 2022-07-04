package se.lexicon.workshop.dao;

import se.lexicon.workshop.model.Customer;

import java.util.ArrayList;

public class CustomerDAO {
    private ArrayList<Customer> customers = new ArrayList<>();

    public boolean add(String firstName, String lastName, String email){

        //Check if email is already stored.
        for (Customer c : customers) {
            if (c.getEmail().equals(email)){
                System.out.println("Email have already been used");
                return false;
            }
        }

        // Adding to storage
        Customer ctoAdd = new Customer(firstName, lastName, email);
        customers.add(ctoAdd);

        return true;

    }

    public Customer find(Customer customer){
        if (customers.contains(customer)){
            return customer;
        }
        return null;
    }

    public Customer findByCustomerId(int id){

        for (Customer customer: customers){
            if (customer.getId() == id){
                return customer;
            }
        }

        return null;
    }

    public boolean remove(Customer customer){
        return customers.remove(customer);
    }

    public boolean remove(int customerId){
        //Find customer by id
        Customer foundCustomer = findByCustomerId(customerId);
        //Call and return result of remove.
        return remove(foundCustomer);
    }



}
