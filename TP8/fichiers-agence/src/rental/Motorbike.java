package rental;

/*
 * A class Motorbike herited from Vehicle
 * @author DEROISSART Maxime | MEIGNANT Pierrick
 *
 */

public class Motorbike extends Vehicle{
  //ATTRIBUTS
  private int cylindree;

  //CONSTRUCTEUR

  public Motorbike(String brand, String model, int productionYear, float dailyRentalPrice,int cylindree){
    super(brand,model,productionYear,dailyRentalPrice);
    this.cylindree = cylindree;
  }
  //METHODE
  public int getCylindree(){
    return this.cylindree;
  }


}
