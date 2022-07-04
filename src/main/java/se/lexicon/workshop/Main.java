package se.lexicon.workshop;


import se.lexicon.workshop.dao.CustomerDAO;
import se.lexicon.workshop.model.Customer;

public class Main {
    public static void main(String[] args) {

        CustomerDAO customerDAO = new CustomerDAO();
        boolean wasAdded = customerDAO.add("Peter","Chilling", "peter.chilling@mail.com");
        boolean wasAddedDup = customerDAO.add("Peter","Chilling", "peter.chilling@mail.com");

        customerDAO.add("Mimi", "Chilling", "mimi.chilling@mail.com");

        customerDAO.add("Test", "Testsson", "test.testsson@mail.com");

        Customer toEdit = customerDAO.findByCustomerId(9003);
        toEdit.setEmail("simon@lexicon.se");



        System.out.println("wasAdded = " + wasAdded);
        System.out.println("wasAddedDup = " + wasAddedDup);

        boolean wasRemoved = customerDAO.remove(9002);

        Customer byCustomerId = customerDAO.findByCustomerId(9002);
        System.out.println("byCustomerId = " + byCustomerId);



    }
}