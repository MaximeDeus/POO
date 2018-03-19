import org.junit.*;
import static org.junit.Assert.*;
import image.color.GrayColor;

public class GrayColorTest {
  //Initialization of 4 objects
  GrayColor gc1= new GrayColor (0);
  GrayColor gc2= new GrayColor (128);
  GrayColor gc3= new GrayColor (255);
  GrayColor gc4= new GrayColor (0);

    @Test
    public void testgetGrayLevel(){


      assertEquals(GrayColor.BLACK.getGrayLevel(),gc1.getGrayLevel());
      assertEquals(128,gc2.getGrayLevel());
      assertEquals(GrayColor.WHITE.getGrayLevel(),gc3.getGrayLevel());
    }

    @Test
    public void testequals(){

      assertTrue(gc1.equals(gc4));
      assertFalse(gc1.equals(gc3));

    }

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
	     return new junit.framework.JUnit4TestAdapter(GrayColorTest.class);
    }

    public static void main(String[] args) {
	     org.junit.runner.JUnitCore.main("GrayColorTest");
    }
}
