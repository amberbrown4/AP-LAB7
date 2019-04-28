
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import static java.lang.Math.*;
import java.util.*;

//public class Main {

    /*public static void main(String[] args) {

            private ArrayList<Flight> flights = new ArrayList<Flight>();

            public void addFlight(Flight flight) {
                flights.add(flight);
            }

            public ArrayList<AirPlane> airPlanes = new ArrayList<AirPlane>();

            public void removeFlight(Flight flight) {
                flights.remove(flight);
            }

            public void AllOperations() {
                Scanner getter = new Scanner(System.in);
                String whatToDo_First = getter.next();
                switch (whatToDo_First) {
                    case "add":
                        String whatToDo_next = getter.next();
                        switch (whatToDo_next) {
                            case "flight":
                                String dateAndTime = getter.next();
                                Date result = null;
                                try {
                                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
                                    result = dateFormat.parse(dateAndTime);
                                } catch (ParseException e) {
                                    e.printStackTrace();
                                }
                                String destination = getter.next();
                                String origin = getter.next();
                                String flightCompany = getter.next();
                                int airplaneID = getter.nextInt();
                                AirPlane airPlane = null;
                                ListIterator<AirPlane> iterator = airPlanes.listIterator();
                                while(iterator.hasNext()){
                                    if(iterator.next().getID() == airplaneID){
                                        airPlane = iterator.next();
                                    }
                                }
                                int flightID = getter.nextInt();
                                Flight flight = new Flight(result,destination,origin,flightCompany,airPlane,flightID);
                                flights.add(flight);
                        }
                    case "Ticket" :
                        int flightID = getter.nextInt();
                        for(Flight flight : flights){
                            if(flight.getFlightNumber() == flightID){
                                flight.getAirPlane().
                            }
                        }

                }
            }
        }
    }
}*/
