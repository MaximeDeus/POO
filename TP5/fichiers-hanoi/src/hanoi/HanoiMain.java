package hanoi;
import hanoi.*;

/**
 * Main function of Hanoi's puzzle
 * @author DEROISSART Maxime | MEIGNANT Pierrick
 */

 public class HanoiMain {

   public static void main (String[] args){

     try
     {
       Hanoi hanoi = new Hanoi (Integer.parseInt(args[1]));
       if (args[0].equals("solve"))
       {
         System.out.println("Beginning of the solving of Hanoi's Towers");
         hanoi.move(hanoi.getTheTowers().get(0).getnbDiscs(),0,2,1);
         System.out.println("Trop facile ce jeu");
      }
      else if((args[0].equals("play")))
      {
        hanoi.playHanoi();
      }

     }

     catch (ArrayIndexOutOfBoundsException e)
     {
        System.out.println("Le nombre d'arguments n'est pas valide !");
        System.out.println("Argument 1 : 'play' pour jouer | 'solve' pour résoudre");
        System.out.println("Argument 2 : Le nombre de disques souhaité");

     }

   }
 }
