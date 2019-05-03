import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class AirPlane {
    private int ID=0;

    public AirPlane(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }
    private ArrayList<Seat> allSeatsList= new ArrayList<Seat>();
   // private HashMap<Seat,Integer> allseats = new HashMap<Seat,Integer>();
    private ArrayList<Seat> soldSeatssList = new ArrayList<Seat>();
    //private HashMap<Seat,Integer> soldseats = new HashMap<Seat,Integer>();


    public ArrayList<Seat> getAllSeatsList() {
        return allSeatsList;
    }

    public ArrayList<Seat> getSoldSeatssList() {
        return soldSeatssList;
    }

    public void ReserveSeat(Seat seat){
      //  allseats.put(seat,1);
        soldSeatssList.add(seat);
        seat.setReserve();
    }
    public void addSeat(Seat seat){
        //allseats.put(seat,0);
        allSeatsList.add(seat);
    }




}
