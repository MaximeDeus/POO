package image.color;

/**
 * A class who represents the level of gray </br>
 * The values are between 0 and 255
 *
 * @author DEROISSART Maxime | MEIGNANT Pierrick
 */

public class GrayColor {

 // ATTRIBUTS

  public static final GrayColor WHITE = new GrayColor(255);
  public static final GrayColor BLACK = new GrayColor(0);
  private int grayLevel;

  //CONSTRUCTEUR

  /**
  * Builds an object of the class GrayColor
  * @param level : level of gray
  */

  public GrayColor (int level){
    this.grayLevel=level;
  }

  /**
  * return grayLevel
  * @return grayLevel
  */
  public int getGrayLevel (){
    return this.grayLevel;
  }

  /**
  * Compare two graycolor's object. <br/>
  *return True if they're equals, False otherwise
  *@param o The objct comparated with the invocator of the Method
  *@return True if they're equals, False otherwise
  */

  public boolean equals (GrayColor o){
    return (this.grayLevel==o.grayLevel)?true:false;
  }

  public static void main(String[] args){
    GrayColor gc1= new GrayColor (0);
    GrayColor gc2= new GrayColor (128);
    GrayColor gc3= new GrayColor (255);
    GrayColor gc4= new GrayColor (0);

    System.out.println(gc1);
    System.out.println(gc1.grayLevel);
    System.out.println(GrayColor.BLACK.grayLevel);
    System.out.println(GrayColor.WHITE.grayLevel);
    System.out.println(GrayColor.BLACK.equals(gc1));
    System.out.println(GrayColor.BLACK.equals(gc2));

  }
}
