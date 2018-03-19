package rental;

import java.util.*;

/* a rental vehicle agency, client can rent one vehicle at a time
 *@author DEROISSART Maxime | MEIGNANT Pierrick
 *
 */

public class SuspiciousRentalAgency extends RentalAgency {

  /** client rents a vehicle, if his ages is under 25, the location cost 110%.
  * @param client the renter
  * @param v the rented vehicle
  * @return the daily rental price
  * @exception UnknownVehicleException   if v is not a vehicle of this agency
  * @exception IllegalStateException if v is already rented or client rents already another vehicle
  */

  public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
    return (client.getAge()<25)?super.rentVehicle(client,v)*((float)1.1):super.rentVehicle(client,v);
}
}
