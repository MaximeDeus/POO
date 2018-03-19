package rental;

import java.util.*;

/** main to test for question  Q5 */
public class MainQ5 {

    public static void main(String[] args){
  	RentalAgency agency = new RentalAgency();
  	Vehicle v = new Vehicle("voi","ture",2001,100);
    Vehicle c = new Car("c","ar",2002,200,4);
    Vehicle m = new Motorbike("motor","bike",2003,300,600);
  	agency.addVehicle(v);
    agency.addVehicle(c);
    agency.addVehicle(m);
    Criterion price = new PriceCriterion (300);
    agency.displaySelection(price);

  }
}
