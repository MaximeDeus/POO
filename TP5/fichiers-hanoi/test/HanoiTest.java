import org.junit.*;
import static org.junit.Assert.*;
import hanoi.util.*;
import hanoi.Hanoi;

public class HanoiTest{

  @Test
  public void testHanoi(){
    Hanoi Hanoi1 = new Hanoi (3);
    assertTrue(Hanoi1.getTheTowers().get(0).isFull());
    assertTrue(Hanoi1.getTheTowers().get(2).isEmpty());
    assertEquals(3,Hanoi1.getTheTowers().get(0).getCapacity());
    assertEquals(3,Hanoi1.getTheTowers().get(1).getCapacity());
  }
  @Test
  public void testmoveOneDisc(){
    Hanoi Hanoi2 = new Hanoi (3);
    assertTrue(Hanoi2.getTheTowers().get(0).isFull());
    assertTrue(Hanoi2.getTheTowers().get(2).isEmpty());
    assertEquals(3,Hanoi2.getTheTowers().get(0).getnbDiscs());
    assertEquals(0,Hanoi2.getTheTowers().get(1).getnbDiscs());
    assertEquals(0,Hanoi2.getTheTowers().get(2).getnbDiscs());
    Hanoi2.moveOneDisc(0,2);
    assertFalse(Hanoi2.getTheTowers().get(0).isFull());
    assertFalse(Hanoi2.getTheTowers().get(2).isEmpty());
    assertEquals(2,Hanoi2.getTheTowers().get(0).getnbDiscs());
    assertEquals(0,Hanoi2.getTheTowers().get(1).getnbDiscs());
    assertEquals(1,Hanoi2.getTheTowers().get(2).getnbDiscs());
    Hanoi2.moveOneDisc(0,2);
    assertEquals(2,Hanoi2.getTheTowers().get(0).getnbDiscs());
    assertEquals(0,Hanoi2.getTheTowers().get(1).getnbDiscs());
    assertEquals(1,Hanoi2.getTheTowers().get(2).getnbDiscs());
  }

  @Test
  public void testmove(){
    Hanoi Hanoi3 = new Hanoi (3);
    Tower leftTower = Hanoi3.getTheTowers().get(0);
    Tower rightTower = Hanoi3.getTheTowers().get(2);
//    Tower fullTower = new Hanoi(3).getTheTowers().get(0);
    assertTrue(leftTower.isFull());
    assertTrue(rightTower.isEmpty());
//    assertEquals(fullTower,leftTower);
    Hanoi3.move(3,0,2,1);
    assertTrue(leftTower.isEmpty());
    assertTrue(rightTower.isFull());

//    assertEquals(fullTower,rightTower);

    }

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(HanoiTest.class);
    }

}
