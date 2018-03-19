import org.junit.*;
import static org.junit.Assert.*;
import image.Pixel;

public class PixelTest {
  //Initialization of 2 objects

    Pixel pixel1 = new Pixel(10);
    Pixel pixel2 = new Pixel(20);

    @Test
    public void testgetColor(){
      assertEquals(10,pixel1.getColor().getGrayLevel());
    }

    @Test
    public void testsetColor(){
      pixel1.setColor(20);
      assertEquals(20,pixel1.getColor().getGrayLevel());

    }


    @Test
    public void testequals(){
      assertFalse(pixel1.equals(pixel2));
      pixel1.setColor(20);
      assertTrue(pixel1.equals(pixel2));

    }

    @Test
    public void testcolorLevelDifference(){
      assertEquals(10,pixel1.colorLevelDifference(pixel2));
      assertEquals(10,pixel2.colorLevelDifference(pixel1));

    }

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
	     return new junit.framework.JUnit4TestAdapter(PixelTest.class);
    }

    public static void main(String[] args) {
	     org.junit.runner.JUnitCore.main("PixelTest");
    }
}
