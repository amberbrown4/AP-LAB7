import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    static Customer customer;
    @BeforeAll
    public static void CreateCustomer(){
         customer = new Customer("Zahra","Salarian",14);
         customer.addTickets(14,11, 2000, true);
         customer.addTickets(15,11,1000,false);
    }
    @Test
    void getFirstName(){
        assertEquals("Zahra",customer.getFirstName());
    }
    @Test
    void getLastName(){
        assertEquals("Salarian",customer.getLastName());
    }
    @Test
    void AddTickets(){
        assertNotNull(customer.getTickets());
        assertEquals(2,customer.getTickets().size());
    }
    @Test
    void getID(){
        assertEquals(14, customer.getID());
    }
}
