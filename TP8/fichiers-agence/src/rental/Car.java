package rental;

/*
 * A class Car herited from Vehicle
 * @author DEROISSART Maxime | MEIGNANT Pierrick
 *
 */

public class Car extends Vehicle{
  //ATTRIBUTS
  private int nbPlaces;

  //CONSTRUCTEUR

  public Car (String brand, String model, int productionYear, float dailyRentalPrice,int nbPlaces){
    super(brand,model,productionYear,dailyRentalPrice);
    this.nbPlaces = nbPlaces;
  }
  //METHODE
  public int getNbPlaces(){
    return this.nbPlaces;
  }


}
