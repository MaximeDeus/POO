package rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClientTest {

	private Client c1;
	private Client c2;


	@Before
	public void before() {
		this.c1 = new Client("client1",20);
		this.c2 = new Client("client2",30);
	}

	@Test
	public void testClient() {
		assertNotNull(this.c1);
	}

	@Test
	public void testGetName() {
		assertEquals("client1",this.c1.getName());
		assertEquals("client2",this.c2.getName());
	}

	@Test
	public void testGetAge() {
	    assertEquals(20,this.c1.getAge());
	    assertEquals(30,this.c2.getAge());
	}

	@Test
	public void testHashCode(){
		assertEquals((this.c1.getName()+"@#"+this.c1.getAge()).hashCode(),this.c1.hashCode());
	}

    // ---Pour permettre l'execution des tests ----------------------

    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(rental.ClientTest.class);
    }

}
