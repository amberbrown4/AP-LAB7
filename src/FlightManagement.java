import java.util.ArrayList;

public class FlightManagement{
    private ArrayList<Flight> flights = new ArrayList<Flight>();
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public ArrayList<Customer> getCustomers(){
        return customers;
    }
    public void addFlight(Flight flight){
        /**
         * adds the flight to the arraylist
         * @version 1.0
         */
        flights.add(flight);
    }
    public void removeFlight(Flight flight){
        flights.remove(flight);
    }
    public ArrayList<Flight> getFlights(){
        return flights;
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }

}