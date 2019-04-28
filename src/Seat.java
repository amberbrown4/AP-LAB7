public class Seat {
    private int seatNumber =0;
    private String seatKind ;
    private Customer user = null;
    private boolean reserve ;

    public Seat(int seatNumber,String seatKind){
        this.seatNumber = seatNumber;
        this.seatKind = seatKind;
        reserve = false;

    }
    public Customer getUser(){
        reserve = true;
        return user;

    }
    public void SeatUser(Customer customer){
        this.user = customer;
    }
    public boolean getReserve(){
        return reserve;
    }
    public void setReserve(){
        reserve = true;
    }


}
