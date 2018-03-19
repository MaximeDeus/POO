package image;

import java.util.*;
import image.color.*;

/**
 * A class who represents Image's functions </br>
 * The values are between 0 and 255
 *
 * @author DEROISSART Maxime | MEIGNANT Pierrick | ROUTIER Jean-Christophe
 */

public class Image implements ImageInterface {

  // ATTRIBUTS

  private int width;
  private int height;
  private Pixel[][] image;

  // CONSTRUCTEUR

  /**
  * Builds an object of the class Image
  * <br/>
  * The image is compared by a double Pixels'tabs (x,y)
  * @param width : the width of the image
  * @param height : the height of the image
  */

  public Image (int width, int height){
    this.width = width;
    this.height = height;
    this.image = new Pixel[width][height];
    Pixel white_pixel = new Pixel (255);
    for(int x = 0; x<width;x++){
      for(int y = 0; y<height;y++){
        this.image[x][y]= white_pixel;

      }
    }
  }

  // METHODES

    /** return width of the image
     * @return width of the image
     */
    public int getWidth(){
      return this.width;
    }

    /** return height of the image
     * @return height of the image
     */
    public int getHeight(){
      return this.height;
    }

    /** gets pixel at coord (x,y) of this image. (0,0) is top left corner pixel.
     * @param x the horizontal coordinate
     * @param y the vertical coordinate
     * @return pixel at coord x,y of this image. (0,0) is top left corner pixel.
     * @exception UnknownPixelException if pixel of coord (x,y) does not exist
     */
    public Pixel getPixel(int x, int y) throws UnknownPixelException{
      if (this.width < x || this.height < y){
        throw new UnknownPixelException("pixel of coord"+ x + "" + y +"does not exist");
      }
      else
      {
        return this.image[x][y];
      }

    }

    /** sets pixel at coord (x,y) of this image. (0,0) is top left corner pixel.
     * @param x the horizontal coordinate
     * @param y the vertical coordinate
     * @param pixel the new pixel
     * @exception UnknownPixelException if pixel of coord (x,y) does not exist
     */
    public void setPixel(int x, int y, Pixel pixel) throws UnknownPixelException{
    if (this.width < x || this.height < y){
      throw new UnknownPixelException("pixel of coord"+ x + "" + y +"does not exist");
    }
    else
    {
      this.image[x][y]= pixel;
    }
  }

    /** change pixel at coord (x,y) of this image. (0,0) is top left corner pixel.
     * @param x the horizontal coordinate
     * @param y the vertical coordinate
     * @param color the new color of the pixel
     * @exception UnknownPixelException if pixel of coord (x,y) does not exist
     */

    public void changeColorPixel(int x, int y, GrayColor color) throws UnknownPixelException{
    if (this.width < x || this.height < y){
      throw new UnknownPixelException("pixel of coord"+ x + "" + y +"does not exist");
    }
    else
    { Pixel pixel = new Pixel (color.getGrayLevel());
      this.image[x][y]= pixel;
    }
  }

    /**
     * Return a new image according to the threshold
     * <br/>
     * When the difference between pixel's neighbors on his right OR under him are greater than the threshold, he becames BLACK.
     * @param threshold the threshold
     * @return a new image with threshold applicated
     */
    public Image edge(int threshold) {

      for(int x = 0; x<this.getWidth()-1;x++){
        for(int y = 0; y<this.getHeight()-1;y++){
          if (this.getPixel(x,y).colorLevelDifference(this.getPixel(x+1,y)) > threshold || this.getPixel(x,y).colorLevelDifference(this.getPixel(x,y+1)) > threshold)
          { //If the threshold is greater than the left pixel OR the undered pixel
            //The current Pixel become Black
            this.setPixel(x,y,new Pixel(0));
          }
          else
          {
            //The current Pixel become White
            this.setPixel(x,y,new Pixel(255));
          }
        }
      }
      return this;

    }


    /**
     * Return a new image according to the nbGrayLevels
     * <br/>
     * Decrease the level of grey of the image according to nbGrayLevels
     * @param nbGrayLevels the power of two used for the decrement
     * @return a new image with decrementation applicated
     */
    public Image decreaseNbGrayLevels(int nbGrayLevels) {
      for(int x = 0; x<this.getWidth();x++){
        for(int y = 0; y<this.getHeight();y++){
          int color = (this.getPixel(x,y).getColor().getGrayLevel()/nbGrayLevels)*nbGrayLevels;
          this.setPixel(x,y,new Pixel(color));
          }
        }
      return this;
    }

    // ======================================================================
    /** Reads a PGM image from file.
     * It is assumed that file respects the following PGM file syntax:
     *  <ul><li> first line with string "P2"</li>
     *  <li>second line : a comment</li>
     *  <li>one int for width <code>w</code>, one int for height<code>h</code></li>
     *  <li>one int for max gray level (not used here, we consider this level to be 255 in our images)</li>
     *  <li><code>w</code> x <code>h</code> integers between 0 and max (for us max=255) for each pixel</li></ul>
     *
     * @param fileName the name of the image file in PGM format
     * @return the image built from the file
     */
    public static Image initImagePGM(String fileName) {
        Scanner scan = new Scanner(Image.class.getResourceAsStream(fileName));

        scan.nextLine(); // line P2
        scan.nextLine(); // line comment
        // read width
        int width = scan.nextInt();
        // read height
        int height = scan.nextInt();
        // read max gray level (not used)
        scan.nextInt();
        // create an initially white image
        Image result = new Image(width, height);
        // rad pixels
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                result.changeColorPixel(y, x, new GrayColor(scan.nextInt()));
            }
        }
        return result;
    }

    public static void main (String[] args){
      Image im = new Image(8,4);
      for(int x = 0; x<im.width;x++){
        for(int y = 0; y<im.height;y++){
          System.out.println(im.image[x][y].getColor().getGrayLevel());

        }
      }
    }


}
