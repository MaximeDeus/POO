package rental;

import java.util.*;

/** main to test for question  Q7 */
public class MainQ7 {

    public static void main(String[] args) throws UnknownVehicleException, IllegalStateException {
  	RentalAgency agency = new SuspiciousRentalAgency();
    Vehicle c = new Car("c","ar",2002,200,4);
    Vehicle m = new Motorbike("motor","bike",2003,200,600);
    agency.addVehicle(c);
    agency.addVehicle(m);
    Client old = new Client ("Prince",25);
    Client young = new Client ("Sirene",19);
    float oldPrice = agency.rentVehicle(old,c);
    float youngPrice = agency.rentVehicle(young,m);
    System.out.println ("old price : " + oldPrice + "\nyoung price : " + youngPrice);


  }
}
