package rental;
import java.util.*;
import rental.*;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class RentalAgencyTest {
  private RentalAgency r1;
  private Vehicle v1;
  private Client c1;

  @Before
  public void before(){
    this.r1 = new RentalAgency();
    this.v1 = new Vehicle("brand1","model1",2015,(float)100);
    this.c1 = new Client("Maxime",25);
  }

	@Test
	public void testRentalAgency() {
		assertNotNull(this.r1);
	}


	@Test
	public void testAddVehicle() {
		this.r1.addVehicle(this.v1);
    List<Vehicle> cars = this.r1.getListVehicle();

    assertTrue(this.r1.getListVehicle().contains(this.v1));

	}

  @Test
  public void testSelect(){
    Vehicle v2 = new Vehicle("brand2","model1",2016,(float)150);
    Vehicle v3 = new Vehicle("brand1","model2",2015,(float)170);
    this.r1.addVehicle(v2);
    this.r1.addVehicle(v3);
    Criterion critBrand1 = new BrandCriterion("brand1");
    Criterion critBrand2 = new BrandCriterion("brand2");

    List<Vehicle> cars = this.r1.select(critBrand1);
    System.out.println(this.r1.getListVehicle().contains(this.v1));
    System.out.println(this.v1);
    System.out.println(
    assertTrue(this.r1.getListVehicle().contains(v3));
    assertTrue(this.r1.getListVehicle().contains(this.v1));
    cars = this.r1.select(critBrand2);
    assertTrue(this.r1.getListVehicle().contains(v2));

  }

  @Test(expected=UnknownVehicleException.class)
  public void testRentVehicle() throws UnknownVehicleException,IllegalStateException{
    Vehicle v4 = new Vehicle("brand3","model1",2013,(float)174);
    this.r1.rentVehicle(this.c1,v4);
  }

  @Test(expected=IllegalStateException.class)
  public void testRentVehicle_bis() throws UnknownVehicleException,IllegalStateException{
    Vehicle v4 = new Vehicle("brand3","model1",2013,(float)174);
    this.r1.addVehicle(v4);
    Client c2 = new Client("Pierrick",23);
    this.r1.rentVehicle(this.c1,this.v1);
    this.r1.rentVehicle(c2,this.v1);
    this.r1.rentVehicle(this.c1,v4);
  }

  @Test
  public void testHasRentedAVehicle(){
    Client c2 = new Client("Pierrick",23);
    assertTrue(this.r1.hasRentedAVehicle(this.c1));
    assertFalse(this.r1.hasRentedAVehicle(c2));
  }

  @Test
  public void testIsRented(){
    Vehicle v4 = new Vehicle("brand3","model1",2013,(float)174);
    assertTrue(this.r1.isRented(this.v1));
    assertFalse(this.r1.isRented(v4));
  }

  @Test
  public void testReturnVehicle(){
    assertTrue(this.r1.isRented(this.v1));
    assertTrue(this.r1.hasRentedAVehicle(this.c1));
    this.r1.returnVehicle(this.c1);
    assertFalse(this.r1.isRented(this.v1));
    assertFalse(this.r1.hasRentedAVehicle(this.c1));
  }


    // ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(rental.RentalAgencyTest.class);
    }

}
