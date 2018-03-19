package image;
import image.color.GrayColor;
import java.lang.Math.*;

/**
* A pixel class who uses GrayColor's class
* @author DEROISSART Maxime | MEIGNANT Pierrick
*/

public class Pixel {

  // ATTRIBUTS

  GrayColor pixelColor;

  // CONSTRUCTEUR

  /**
  * Builds a pixel with color level of gray <br/>
  * 0 = Black <br/>
  * 255 = White <br/>
  * @param levelColor : The level of gray
  */

  public Pixel (int levelColor){
    this.pixelColor = new GrayColor(levelColor);
  }

  //METHODES

  /**
  * returns the pixelcolor's level of gray
  * @return the pixelcolor's level of gray
  */

  public GrayColor getColor(){
    return this.pixelColor;
  }

  /**
  * change the pixelcolor's level of gray
  * change the pixelcolor's level of gray
  */

  public void setColor (int levelColor){
    this.pixelColor= new GrayColor(levelColor);
  }

  /**
  * Compare two pixels. <br/
  * Returns true if they have the same color's level <br/>
  * false otherwise
  * @param pixel : the other pixel who'll be compared with
  * @return a boolean, true if they're equals
  */

  public boolean equals (Pixel pixel){
    return (this.pixelColor.getGrayLevel()==pixel.pixelColor.getGrayLevel())?true:false;
  }

  /**
  * Compare two pixels. <br/
  * Returns the level's difference between them
  * @param pixel : the other pixel who'll be compared with
  * @return the level's difference
  */

  public int colorLevelDifference(Pixel pixel){
    return Math.abs(this.pixelColor.getGrayLevel()-pixel.pixelColor.getGrayLevel());

  }

  public static void main (String[] args){

    Pixel pixel1 = new Pixel(10);
    Pixel pixel2 = new Pixel(100);
    System.out.println(pixel1.colorLevelDifference(pixel2));
    System.out.println(pixel2.colorLevelDifference(pixel1));
    pixel1.setColor(5);
    System.out.println(pixel1.colorLevelDifference(pixel2));
    System.out.println(pixel2.colorLevelDifference(pixel1));
  }
}
