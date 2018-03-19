import org.junit.*;
import static org.junit.Assert.*;
import hanoi.util.Disc;

public class DiscTest {

    @Test
    public void testDisc()
    {
        Disc someDisc = new Disc(10);
        assertEquals(10,someDisc.getSize());
    }

    @Test
    public void testCompareTo()
    {
        Disc someDisc1 = new Disc(1);
        Disc someDisc2 = new Disc(2);
        Disc someDisc3 = new Disc(3);
        assertEquals(1,someDisc2.compareTo(someDisc1));
        assertEquals(0,someDisc2.compareTo(someDisc2));
        assertEquals(-1,someDisc2.compareTo(someDisc3));
    }

    @Test
    public void testToString()
    {
      Disc SomeDisc = new Disc (5);
      assertEquals("5",Integer.toString(SomeDisc.getSize()));
    }



    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(DiscTest.class);
    }

}
