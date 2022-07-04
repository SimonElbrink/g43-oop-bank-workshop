package se.lexicon.workshop.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    public void test_creating_customer_successfully(){
        Customer c1 = new Customer(
                "Peter",
                "Chilling",
                "peter.chilling@mail.com");

        System.out.println(c1);

        assertEquals(c1.getId(),Customer.getCurrentCustomerIDSequencer());
        assertEquals(c1.getFirstName(),"Peter");
        assertEquals(c1.getLastName(),"Chilling");
        assertEquals(c1.getEmail(),"peter.chilling@mail.com");



    }

}