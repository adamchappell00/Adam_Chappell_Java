import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompositionTest {

    Customer customer1;
    Customer customer2;

    @Before
    public void setUp(){
            Address c1bill = new Address("123 Main Street", "#402", "San Antonio", "Texas", 78232);
            Address c1ship = new Address("123 Main Street", "#402", "San Antonio", "Texas", 78232);
            Contact c1email = new Contact("Email", "mrawesome123@gmail.com");
            Contact c1phone = new Contact("Mobile Phone", "210-867-5309");
            customer1 = new Customer("Steve", "Jones", c1email, c1phone, c1bill, c1ship, false);

            Address c2bill = new Address("507 Bleeker", "", "New York", "New York", 12345);
            Address c2ship = new Address("1600 Pennsylvania Ave", "", "Washington", "DC", 11111);
            Contact c2email = new Contact("Email", "theprez@gmail.com");
            Contact c2phone = new Contact("Home Phone", "901-901-9010");
            customer2 = new Customer("Mister", "Incognito", c2email, c2phone, c2bill, c2ship, true);
    }

    @Test
    public void createdCustomersShouldExistWithFields(){
       assertNotNull(customer1);
       assertNotNull(customer1.getBillingAddress());
       assertTrue(customer2.isRewardsMember());
    }

    @Test
    public void changesUpdateCorrectly(){
        assertEquals(78232,customer1.getBillingAddress().getZip());
        assertFalse(customer1.isRewardsMember());
        assertEquals("Mister", customer2.getFirstName());
        customer1.setRewardsMember(true);
        customer1.setBillingAddress(new Address("600 Navarro", "", "San Antonio", "Texas", 78202));
        customer2.setFirstName("Bob");
        assertEquals(78202,customer1.getBillingAddress().getZip());
        assertTrue(customer1.isRewardsMember());
        assertEquals("Bob", customer2.getFirstName());

    }

}