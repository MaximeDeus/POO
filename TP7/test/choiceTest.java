import org.junit.*;
import static org.junit.Assert.*;
import pfc.Choice;

public class choiceTest {

    @Test
    public void testChoice()
    {
        Choice choix = Choice.Rock;
        assertEquals(Choice.Rock,choix);
        choix = Choice.Scissor;
        assertEquals(Choice.Scissor,choix);
        choix = Choice.Paper;
        assertEquals(Choice.Paper,choix);
    }

    @Test
    public void testCompareTo()
    {
        Choice choixRock= Choice.Rock;
        Choice choixScissor= Choice.Scissor;
        assertEquals(1,choixRock.compareChoice(choixScissor));
        assertEquals(0,choixRock.compareChoice(choixRock));
        assertEquals(-1,choixScissor.compareChoice(choixRock));
    }

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(choiceTest.class);
    }

}
