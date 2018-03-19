package hanoi.util;
import hanoi.util.*;
import java.util.ArrayList;
import java.util.List;

/**
  * A class who use class disc and represents a tower of Hanoi
  *
  * @author DEROISSART Maxime | MEIGNANT Pierrick
  */

  public class Tower
  {
    // ATTRIBUTS

    /* Contains the numbers of disc of the tower <br/>
     * Disc must be sorted by size <br/>
     * A disc with a size greater than the others can't be over them
     */
     public List<Disc> theDiscs; //The Tower, en public car problème avec gettheDiscs dans classe Hanoi (je sais c'est mal)
     private int capacity; //The capacity of the Tower
     private int nbDiscs; //The current number of disc (0 at initialization)

     // CONSTRUCTEURS

     /** Builds a tower of Discs
      * @param capacity The number of discs for this tower
      */

      public Tower (int capacity)
      {
        this.capacity = capacity;
        this.nbDiscs = 0;
        this.theDiscs = new ArrayList<Disc>();

      }

      // METHODES

      /**
      *returns the capacity of the Tower
      *@return the capacity of the Tower
      */

      public int getCapacity()
      {
        return this.capacity;
      }

      /**
      * returns the current number of Discs of the Tower
      * @return the current number of Discs of the Tower
      */

      public int getnbDiscs()
      {
        return this.nbDiscs;
      }

      /**
      * return the list of the Discs on the Tower
      * @return the list of the Discs on the Tower
      */

      public List gettheDiscs()
      {
        return this.theDiscs;
      }


      /**
      * Check if the Tower is full
      * @return True if the Tower is full of capacity, False Otherwise
      */

      public boolean isFull()
      {
        return this.capacity == this.nbDiscs;
      }

      /**
      * Check if the Tower is empty
      * @return True if the Tower is empty, False Otherwise
      */

      public boolean isEmpty()
      {
        return this.nbDiscs == 0;
      }


      /**
      * Show the disc at the top of the Tower
      */

      public Disc top()
      {
        if (this.isEmpty()){
        /* Renvoie un disc trop gros pour la tour
         * afin de pouvoir utiliser push sur une tour vide
         */
          return new Disc (this.capacity+1);
        }
        else
        {
          return this.theDiscs.get(this.getnbDiscs()-1);
        }

      /**
      * Add a disc at the Top of the Tower
      */
      }

      public void push (int size)
      {
        if (! this.isFull()) //If we can add a disc
        {
          Disc addedDisc = new Disc(size);
          if (this.top().compareTo(addedDisc) == 1) //If the added disc is lower than the previous one
          {
            this.theDiscs.add(addedDisc); //Add the disc on the summit
            this.nbDiscs++; // Increase the number of discs of the tower
          }
          else
          {
            System.out.println("The disc is too big");
          }
        }
        else
        {
          System.out.println("The Tower is Full");
        }
      }

      /**
      * Remove the Disc at the top of the Tower and return it <br/>
      * If the tower is empty, return a disc with a size = 0
      */

      public Disc pop ()
      {
        if (! this.isEmpty()) //If the Tower isn't empty
        {
          Disc popDisc= this.theDiscs.get(this.getnbDiscs()-1);
          this.theDiscs.remove(this.getnbDiscs()-1);
          this.nbDiscs--;
          return popDisc;

        }
        else
        {
          System.out.println("Empty Tower. Nothing to pop");
          //Disque renvoyé si tour vide, de taille 0, utile pour sa représentation graphique
          return new Disc (0);
        }
      }

      /**
       * Returns informations about the Tower
       */

       public String toString()
       {
         String scapacity = "capacity : " + Integer.toString(this.capacity) + "\n";
         String snbDiscs = "nbDiscs : " + Integer.toString(this.nbDiscs) + "\n";
         List<String> stheDiscs= new ArrayList<String>(); //A list who'll have all discs informations
         for (Disc disc : this.theDiscs)
         {
           stheDiscs.add(disc.toString()+" "); //add string information of all discs
         }
         return scapacity + snbDiscs + "theDiscs : \n" + stheDiscs;
       }

       /**
       * Creates a graphical representation of the tower
       */

       public void displayTower()
       {
         for(int i = this.capacity-1; i >= 0; i--)
         {
           try{
             //Semblable à une marge
             String blank = new String(new char[this.capacity - this.theDiscs.get(i).getSize()]).replace("\0", " ");
             System.out.print(blank);
             this.theDiscs.get(i).displayDisc();
             //Facultatif, car idée de réutiliser cette fonction pour displayHanoi abandonnée
             System.out.println(blank);
           }
           // Si tour incomplète
           catch (IndexOutOfBoundsException e)
           {
             // Impression d'un disque vide " | "
             String blank = new String(new char[this.capacity]).replace("\0", " ");
             System.out.print(blank);
             System.out.print("|");
             System.out.println(blank);
           }

         }

       }

public static void main (String[] args)
      {
        System.out.println("Début du Main Tower");
        System.out.println("Fin du Main Tower");
      }
}
