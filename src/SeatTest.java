import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SeatTest {
    static Seat seat;
    static Customer customer;

    @BeforeAll
    public static void CreateSeat(){
        seat = new Seat(15,"FirstClass");
        customer = new Customer("Zahra","Salarian",14);
        seat.SetUser(customer);
    }
    @Test
    void getCustomerID(){
        assertNotNull(seat.getUser());
        assertEquals(14,seat.getUser().getID());
    }
}
