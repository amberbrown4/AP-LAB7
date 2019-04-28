import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private Date date;
    private String destination;
    private String origin;
    private String flightCompany;
    private AirPlane airPlane;
    private int flightId = 0;

    public Flight(Date date, String destination, String origin, String flightCompany, AirPlane airPlane, int flightId) {
        this.date = date;
        this.destination = destination;
        this.origin = origin;
        this.flightCompany = flightCompany;
        this.airPlane = airPlane;
        this.flightId = flightId;
    }

    public Date getDay() {
        return date;
    }

    public String getDestination() {
        return destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getFlightCompany() {
        return flightCompany;
    }

    public AirPlane getAirPlane() {
        return airPlane;
    }

    public int getFlightNumber() {
        return flightId;
    }

}
