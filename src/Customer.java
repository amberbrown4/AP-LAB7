import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private int ID = 0;
    private ArrayList<Ticket> tickets;

    public Customer(String firstName, String lastName, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        tickets = new ArrayList<Ticket>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Ticket> getTickets() {

        return tickets;
    }

    public void addTickets(int seatNum, int flightNum, int weight, boolean food) {
        Ticket ticket = new Ticket(seatNum,flightNum,weight ,food);
        tickets.add(ticket);
    }

    public int getID() {
        return ID;
    }
}
