package pfc;

public class Game(){
  private int nbtours;
  private Player p1;
  private Player p2;

  public Game(Player player1,Player player2,int tours){
    this.p1=player1;
    this.p2=player2;
    this.nbTours = tours;
  }

  public void playOneRound(){
    Choice c1 = this.p1.play();
    Choice c2 = this.p2.play();

    int ptp1 = c1.compareChoice(c2)+1;

    this.p1.addPoints(ptp1);
    this.p2.addPoints(2-ptp1);
  }

  public void play(){
    for(int tour=0;tour<this.nbTours;tour++){
      playOneRound()
    }
  }

  public Player getPlayer1(){
    return this.p1;
  }

  public Player getPlayer2(){
    return this.p2;
  }

  public int getNbTour(){
    return this.nbTours;
        }

}
