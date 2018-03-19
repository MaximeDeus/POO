package pfc;
import pfc.*;


public class Player{
  private Strategy strat;
  private int score = 0;

  public Player(Strategy strategy){
    this.strat = strategy;
  }

  public Choice play(){
    return this.strat.getChoice();
  }

  public void addPoints(int pt){
    this.score += pt;
  }

  public int getScore(){
    return this.score;
  }
}
