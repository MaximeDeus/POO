package hanoi.util;

 /**
  * Disc Class : A class disc for Hanoi Tower
  *
  * @author DEROISSART Maxime | MEIGNANT Pierrick
  */

public class Disc {

     // ATTRIBUTS

     /* contains the size of the disc */

     private int size;

     // CONSTRUCTEURS

     /** builds Disc defined by its size
      * @param size the size of the disc
      */
     public Disc(int size)
     {
       this.size = size;
     }

     // METHODES

     /**
      * return the size of the disc
      * @return the size of the disc
      */
     public int getSize()
     {
       return this.size;
     }

     /**
      * returns 1 if the size of the object is greater than the other <br/>
      * -1 if he's lower than the other <br/>
      * 0 if they're equals
      * @param disc the disc to be compared with this
      * @return 1(greater),0(equals) or -1(lower)
      */
     public int compareTo(Disc disc)
     {
       return (this.size>disc.size)?1:(this.size<disc.size)?(-1):0;
     }

     /**
     * Creates a graphical representation of the Disc
     */

     public void displayDisc()
     {   // Exemple : Disque taille 3 ___|___
         System.out.print(new String(new char[this.size]).replace("\0", "_"));
         System.out.print("|");
         System.out.print(new String(new char[this.size]).replace("\0", "_"));
     }


     /**
      * returns a string who represents the size of the disc
      * @return a string who represents the size of the disc
      */

     public String toString()
     {
 	     return Integer.toString(this.size);
     }


      public static void main (String[] args) {
        
        System.out.println("Début du Main Disc" );
        System.out.println("Fin du Main Disc");
      }
}
