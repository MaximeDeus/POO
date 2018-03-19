import org.junit.*;
import static org.junit.Assert.*;
import pfc.*;


public class TowerTest {

  @Test
 public void createPlayerTest(){
      Random strat = new Random();
      Player p1 = new Player(strat);
      AssertSame(p1.strat,strat);
      assertEquals(p1.getScore(),0);
  }

  @test
  public void playTest(){
      PaperStrat strat = new PaperStrat();
      Player p1 = new Player(strat);
      assertEquals(Choice.Paper,p1.play());
  }
    @test
  public void addPointsTest(){
        PaperStrat strat = new PaperStrat();
        Player p1 = new Player(strat);
        assertEquals(p1.getScore(),0);
        p1.addPoints(1);
        assertEquals(p1.getScore(),1);
        p1.addPoints(3);
        assertEquals(p1.getScore(),4);
    }

  // ---Pour permettre l'exécution des test----------------------
  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(TowerTest.class);
  }

}
