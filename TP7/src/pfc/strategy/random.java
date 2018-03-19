package pfc.strategy;
import java.util.Random;

public class Rand implements Strategy{

  public Choice getChoice(){
    Random alea = new util.Random();
    int choice = alea(3);
    switch(choice){
      case 0: return Choice.Rock;

      case 1: return Choice.Scissor;

      case 2: return Choice.Paper;
    }
}
