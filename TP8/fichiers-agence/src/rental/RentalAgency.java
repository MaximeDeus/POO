package rental;

import java.util.*;

/** a rental vehicle agency, client can rent one vehicle at a time */
public class RentalAgency {
    // vehicles of this agency
    private List<Vehicle> theVehicles;

    // maps client and rented vehicle (at most one vehicle by client)
    private Map<Client,Vehicle> rentedVehicles;

    public RentalAgency() {
    	this.theVehicles= new ArrayList<Vehicle>();
      this.rentedVehicles= new HashMap <Client,Vehicle>();
    }

    /** adds a vehicle to this agency
    * @param v the added vehicle
    */
    public void addVehicle(Vehicle v) {
        this.theVehicles.add(v);
    }

    /** provides the list of the vehicles that satisfy the criterion c
    * @param c the selection criterion
    * @return  the list of the vehicles that satisfy the criterion c
    */
    public List<Vehicle> select(Criterion c) {
        List<Vehicle> res = new ArrayList <Vehicle>();
        for (Vehicle v : this.theVehicles)
        {
            if (c.isSatisfiedBy(v))
            {
              res.add(v);
            }
        }
        return res;
    }
    /** displays the vehicles that satisfy the criterion c
    * @param c the selection criterion
    */
    public void displaySelection(Criterion c) {
      List<Vehicle> res = this.select(c);
      for (Vehicle v : res)
      {
        System.out.println(v);
      }
    }

    /** client rents a vehicle
    * @param client the renter
    * @param v the rented vehicle
    * @return the daily rental price
    * @exception UnknownVehicleException   if v is not a vehicle of this agency
    * @exception IllegalStateException if v is already rented or client rents already another vehicle
    */
    public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
      // If the vehicle doesn't exist
      if (!this.theVehicles.contains(v))
      {
        throw new UnknownVehicleException ();
      }
      // If the vehicle is already rented
      else if (isRented(v))
      {
        throw new IllegalStateException ("the vehicle is already rented");
      }
      // If the client already rented a vehicle
      else if (hasRentedAVehicle(client))
      {
        throw new IllegalStateException ("the client already rented a vehicle");
      }

      this.rentedVehicles.put(client,v);
      return v.getDailyPrice();
    }


    /** returns <em>true</em> iff client c is renting a vehicle
    * @return <em>true</em> iff client c is renting a vehicle
    */
    public boolean hasRentedAVehicle(Client client){
    	return this.rentedVehicles.containsKey(client);
    }

    /** returns <em>true</em> iff vehicle v is rented
    * @return <em>true</em> iff vehicle v is rented
    */
    public boolean isRented(Vehicle v){
    	return this.rentedVehicles.containsValue(v);
    }

    /** the client returns a rented vehicle. Nothing happens if client didn't have rented a vehicle.
    * @param the client who returns a vehicle
    */
    public void returnVehicle(Client client){
    	this.rentedVehicles.remove(client);
    }
    /** provides the collection of rented vehicles for this agency
    * @return collection of currently rented vehicles
    */
    public Collection<Vehicle> allRentedVehicles(){
        return this.rentedVehicles.values();
    }

    public List<Vehicle> getListVehicle(){
      return this.theVehicles;
    }

    public static void main (String[] args)
    {
        try
        {
          RentalAgency r1 = new RentalAgency();
          Vehicle v1= new Vehicle("audi","rs3",2017,(float)500);
          Client c1 = new Client ("Prince",25);
          Vehicle v2= new Vehicle("citroen","rs3",2017,(float)500);
          Client c2 = new Client ("Sirene",19);
          Criterion crit = new BrandCriterion("citroen");

          System.out.println(r1.isRented(v1));
          r1.displaySelection(crit);
          r1.addVehicle(v1);
          r1.displaySelection(crit);
          r1.addVehicle(v2);
          r1.displaySelection(crit);
          System.out.println(r1.isRented(v1));
          System.out.println(r1.hasRentedAVehicle(c1));
          System.out.println(r1.allRentedVehicles());
          System.out.println(r1.rentVehicle(c1,v1));
          System.out.println(r1.isRented(v1));
          System.out.println(r1.hasRentedAVehicle(c1));
          System.out.println(r1.allRentedVehicles());
          r1.returnVehicle(c1);
          System.out.println(r1.isRented(v1));
          System.out.println(r1.hasRentedAVehicle(c1));
          System.out.println(r1.allRentedVehicles());
        }
        catch (Exception e)
        {
          System.out.println("FIN DU TEST");
        }
    }

}
