public class Ticket {
    private int seatNum = 0;
    private int flightNum = 0;
    private int weight = 0;
    private boolean food;
    private Customer customer;

    public Ticket(int seatNum, int flightNum, int weight, boolean food) {
        this.seatNum = seatNum;
        this.flightNum = flightNum;
        this.weight = weight;
        this.food = food;
    }

    public int getSeatNum() {
        /**
         * @return returns setNumber
         */

        return seatNum;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public int getWeight() {
        return weight;
    }

    public boolean getFood() {
        return food;
    }

    public void setCustomer(Customer customer) {
        /**
         * adds a customer to the Arraylist
         * @author zahra salarian
         */
        this.customer = customer;
    }
    public Customer getCustomer(){
        /**
         * returns the customer that reserves this ticket
         */
        return customer;
    }

}
