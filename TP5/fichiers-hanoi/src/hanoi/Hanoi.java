package hanoi;
import hanoi.util.*;
import java.util.ArrayList;
import java.util.List;
import io.*;

/**
 * Main class of Hanoi, using Disc and Tower classes <br/>
 * Solve or play the Hanoi's Puzzle <br/>
 * @author DEROISSART Maxime | MEIGNANT Pierrick
 */

 public class Hanoi {

   // ATTRIBUTS

   /** A list of 3 Towers of Hanoi
     */

   private List<Tower> theTowers;

   // CONSTRUCTEURS


    /** Builds 3 towers of Hanoi <br/>
     * Left tower is full <br/>
     * Middle/Right are empty
     * @param size The capacities of each towers
     */

   public Hanoi (int size){
     this.theTowers = new ArrayList<Tower>();
     //Creates 3 towers with size capacity
     for (int i=0;i<3;i++)
     {
       theTowers.add(new Tower(size));
     }
     //Fill the left tower
     for (int i=theTowers.get(0).getCapacity();i>0;i--)
     {
       theTowers.get(0).push(i);
     }
   }

   // METHODES

   /**
    * returns the attribute "theTowers"
    * @return the attribute list "theTowers"
    */

   public List<Tower> getTheTowers (){
     return this.theTowers;
   }

   /**
   * Move the disc on the top of the Tower source to the top of the Tower dest <br/>
   * 0 : The left tower <br/>
   * 1 : The middle tower <br/>
   * 2 : The right tower
   * @param s the index of the source tower
   * @param d the index of the dest tower
   */

   public void moveOneDisc(int s, int d)
   {
     if (this.theTowers.get(s).isEmpty() | this.theTowers.get(d).isFull())
     {
       System.out.println("Mouvement Impossible");
     }
     else
      if(this.theTowers.get(s).top().compareTo(this.theTowers.get(d).top()) != -1)
      {
         System.out.println("Le Disque est trop grand !");
      }
      else
     {
       this.theTowers.get(d).push(this.theTowers.get(s).pop().getSize());
     }
   }

   /**
   * Solve the Hanoi's puzzle using recursivity <br/>
   * 0 : The left tower <br/>
   * 1 : The middle tower <br/>
   * 2 : The right tower
   * @param nbdiscs the number of discs of the tower
   * @param source the index of the source tower
   * @param dest the index of the dest tower
   * @param inter the index of the inter tower
   */

   public void move (int nbdiscs, int source, int dest, int inter)
   {
     if (nbdiscs == 1)
     {
       this.displayHanoi();
       System.out.println("Déplacement du disque de la tour "+Integer.toString(source) + " vers la tour " + Integer.toString(dest));
       this.moveOneDisc(source,dest);
       this.displayHanoi();
     }
     else
     {
       move (nbdiscs-1, source,inter,dest);
       System.out.println("Déplacement du disque de la tour "+Integer.toString(source) + " vers la tour " + Integer.toString(dest));
       this.moveOneDisc(source,dest);
       move (nbdiscs-1, inter, dest,source);
     }
   }

   /**
   * Gives a string and a graphical representation of Hanoi
   */

   public String toString(){
     System.out.println ("Left Tower : \n" + this.theTowers.get(0).toString());
     System.out.println ("Middle Tower \n: " +this.theTowers.get(1).toString());
     System.out.println ("Right Tower \n: " + this.theTowers.get(2).toString());
     this.displayHanoi();

     return "";
   }

   /**
   * Function in order to play at Hanoi's puzzle <br/>
   * It uses HanoiInput
   *
   */
   public void playHanoi(){
     this.displayHanoi();
     HanoiInput input = new HanoiInput ();
     input.readInput();
     while (input.isMove())
     {
     this.moveOneDisc(input.getFrom(),input.getTo());
     this.displayHanoi();
     input.readInput();
     }

   }

   /**
   * Creates a graphical representation of hanoi <br/>
   * It don't use displayTower because they can't be side to side using this method.
   */

   public void displayHanoi()
   {
     int capacity = this.theTowers.get(0).getCapacity();
     //Browses each discs by decreasing order
     for(int i = capacity-1 ; i >= 0; i--)
     {
       //The 3 towers
       for (int j = 0; j<3; j++)
       {
       try{
         //Draw the discs of the 3 towers line by line
         Tower tower = this.theTowers.get(j);
         Disc disc = tower.theDiscs.get(i);
         String blank = new String(new char[(capacity - disc.getSize())]).replace("\0", " ");

         System.out.print(blank);
         disc.displayDisc();
         System.out.print(blank);
       }
       catch (IndexOutOfBoundsException e)
       {

         String blank = new String(new char[capacity]).replace("\0", " ");
         System.out.print(blank);
         System.out.print("|");
         System.out.print(blank);
       }
       //End of Line
       if (j == 2){
         System.out.println("");
       }

       }

     }

   }



   public static void main (String[] args)
   {
     System.out.println("Début du Main Hanoi");
     System.out.println("Fin du Main Hanoi");

   }

 }
