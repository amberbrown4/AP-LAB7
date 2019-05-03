import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AirPlaneTest {

    static AirPlane airPlane;
    static Seat seat;
    @BeforeAll
    public static void CreateAirplane(){
         airPlane = new AirPlane(12);
         seat = new Seat(10,"firstClass");
        airPlane.addSeat(seat);
        airPlane.ReserveSeat(seat);
    }


    @Test
    void getID(){
        assertNotNull(airPlane);
        assertEquals(12,airPlane.getID());
    }
    @Test
    void getReserve(){
        assertNotNull(airPlane.getAllSeatsList());
        assertEquals(1,airPlane.getAllSeatsList().size());
        assertEquals(1,airPlane.getSoldSeatssList().size());
    }

}
