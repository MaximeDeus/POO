import org.junit.*;
import static org.junit.Assert.*;
import hanoi.util.*;
import java.util.ArrayList;
import java.util.List;

public class TowerTest {

  @Test
  public void testTower()
  {
      Tower someTower1 = new Tower(2);
      assertEquals(2,someTower1.getCapacity());
      assertEquals(0,someTower1.getnbDiscs());
      List <String> test=new ArrayList<String>();
      assertEquals(test,someTower1.gettheDiscs());

  }

  @Test
  public void testisFull()
  {
      Tower someTower2 = new Tower(1);
      assertFalse(someTower2.isFull());
      someTower2.push(1);
      assertTrue(someTower2.isFull());
  }

  @Test
  public void testisEmpty()
  {
      Tower someTower3 = new Tower(1);
      assertTrue(someTower3.isEmpty());
      someTower3.push(1);
      assertFalse(someTower3.isEmpty());
  }

  @Test
  public void testtop()
  {
      Tower someTower4 = new Tower(3);
      assertEquals(4,someTower4.top().getSize());
      someTower4.push(3);
      someTower4.push(2);
      assertEquals(2,someTower4.top().getSize());
      someTower4.push(5);
      assertEquals(2,someTower4.top().getSize());;



  }

  @Test
  public void testpush()
  {
    Tower someTower5 = new Tower(3);
    someTower5.push(3);
    assertEquals(1,someTower5.getnbDiscs());
    someTower5.push(2);
    someTower5.push(1);
    assertEquals(3,someTower5.getnbDiscs());
    someTower5.push(1);
    assertEquals(3,someTower5.getnbDiscs());
    someTower5.push(5);
    assertEquals(3,someTower5.getnbDiscs());
  }

  @Test
  public void testpop()
  {
      Tower someTower6 = new Tower(3);
      assertEquals(0,someTower6.getnbDiscs());
      someTower6.pop();
      assertEquals(0,someTower6.getnbDiscs());
      someTower6.push(3);
      someTower6.push(2);
      someTower6.push(1);
      assertEquals(3,someTower6.getnbDiscs());
      someTower6.pop();
      assertEquals(2,someTower6.getnbDiscs());
  }


  // ---Pour permettre l'exécution des test----------------------
  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(TowerTest.class);
  }

}
