package image;

/**
 * First Main class of Image
 * Returns 3 drawed rectangles </br>
 * one his hidden cause of the threshold setted at 100
 * @author DEROISSART Maxime | MEIGNANT Pierrick
 */

public class ImageExample{
  public static void main (String[] args){

    ImageDisplayer imageDisplayer = new ImageDisplayer();
    Image image_blanche = new Image (100,200);

    for(int i = 10; i<=30;i++){
      for(int j = 30; j<=60;j++){
        image_blanche.setPixel(i,j,new Pixel (0));
      }
    }

    for(int i = 50; i<=70;i++){
      for(int j = 50; j<=100;j++){
        image_blanche.setPixel(i,j,new Pixel (64));
      }
    }

    for(int i = 20; i<=40;i++){
      for(int j = 110; j<=160;j++){
        image_blanche.setPixel(i,j,new Pixel (230));
      }
    }
    image_blanche.edge(100);
    imageDisplayer.display(image_blanche, "image blanche", 100,200);
  }
}
