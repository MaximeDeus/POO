
package image;

/**
 * Second Main class of Image
 * Take an original image, an gives 2 representations of the latter </br>
 * The 1st one is the Edge representation, characterized by his threshold (1st arg) </br>
 *The 2nd one is the Decrementation of grayLevel's representation, characterized by his level (2nd arg)
 * @author DEROISSART Maxime | MEIGNANT Pierrick
 */

public class ImageMain{
  public static void main (String[] args){

    ImageDisplayer display_image_original = new ImageDisplayer();
    Image img = new Image (1000,1000);
    Image img_file= img.initImagePGM(args[0]);
    display_image_original.display(img_file,"PGM");

    ImageDisplayer display_image_edge = new ImageDisplayer();
    img_file.edge(Integer.parseInt(args[1]));
    display_image_edge.display(img_file,"edge : PGM");

    img_file = img.initImagePGM(args[0]);
    ImageDisplayer display_image_decreaseNbGrayLevels = new ImageDisplayer();
    img_file.decreaseNbGrayLevels(Integer.parseInt(args[2]));
    display_image_decreaseNbGrayLevels.display(img_file,args[2] + " gray levels : PGM");
  }
}
