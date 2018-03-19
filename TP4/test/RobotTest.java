import org.junit.*;
import static org.junit.Assert.*;

import example.Robot;
import example.util.*;


public class RobotTest {
	
	@Test
	public void testCreateRobot(){
		Robot rob = new Robot();
		assertNull(rob.getCarriedBox());
		assertFalse(rob.carryBox());
	}
	
	@Test
	public void testTake(){
		Robot rob = new Robot();
		// Create two box.
		Box box1 = new Box(10);
		Box box2 = new Box(100);
		
		// Verify if the robot haven't box.
		assertFalse(rob.carryBox());
		// The robot takes box1 with a weight at 10.
		rob.take(box1);
		// Look if a box is in robot's hands
		assertTrue(rob.carryBox());
		// Look if a box1 in robot's hands		
		assertEquals(box1.getWeight(),rob.getCarriedBox().getWeight());
		//Try take the box2
		rob.take(box2);
		
		assertTrue(rob.carryBox());	
		// Look if the box1 is always in robot's hand
		assertEquals(box1.getWeight(),rob.getCarriedBox().getWeight());
		
		
	}
	
	
	@Test
	public void testCarryBox(){
		Robot rob = new Robot();
		Box box = new Box(10);
		
		assertFalse(rob.carryBox());
		rob.take(box);
		assertTrue(rob.carryBox());		
	}
	
	@Test
	public void testputOn(){
		//Initialize one converyer belt accept box <= 90, two box: 1) 10 weight,2) 100 weight and one robot
		ConveyerBelt cb = new ConveyerBelt(90);
		Robot rob = new Robot();
		Box box1 = new Box(10);
		Box box2 = new Box(100);
		
		// After this one, the belt is full
		for(int i =0; i<cb.getCapacity();i++){
			rob.take(box1);
			rob.putOn(cb);
			assertFalse(rob.carryBox());
		}
		//Test if the robot keep the box because the belt is full
		rob.take(box1);
		rob.putOn(cb);
		assertTrue(rob.carryBox());
		assertSame(box1,rob.getCarriedBox());
		//The belt is empty
		cb.emptyBelt();
		//The robot put the box in belt
		rob.putOn(cb);
		
		//The robot take the box with weight will don't accept by belt
		rob.take(box2);
		//Test if the robot keep the box with weight too much for belt
		rob.putOn(cb);
		assertTrue(rob.carryBox());
		assertSame(box2,rob.getCarriedBox());
	}
	
	public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(RobotTest.class);
    }
    
}
