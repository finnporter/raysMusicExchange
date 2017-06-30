import static org.junit.Assert.*;
import org.junit.*;
import product_mgmt.*;

public class GuitarTest {

  Guitar guitar01;

  @Before
  public void before() {
    guitar01 = new Guitar("Sunburst", "semi-acoustic", "regular", 150, 299, "Ibanez", "Archtop", 6);
    //String colour, String type, String size, Double buyPrice, Double sellPrice, String brand, String, model, int numberOfStrings
  }

  @Test
  public void testHasColour() {
    assertEquals("Sunburst", guitar01.getColour());
  }

  @Test
  public void testHasType() {
    assertEquals("semi-acoustic", guitar01.getType());
  }

  @Test
  public void testHasSize() {
    assertEquals("regular", guitar01.getSize());
  }

  @Test
  public void testHasBuyPrize() {
    assertEquals(150, guitar01.getBuyPrice());
  }

  @Test
  public void testHasSellPrize() {
    assertEquals(299, guitar01.getSellPrice());
  }

  @Test
  public void testHasBrand() {
    assertEquals("Ibanez", guitar01.getBrand());
  }

  @Test
  public void testHasModel() {
    assertEquals("Archtop", guitar01.getModel());
  }

  @Test
  public void testHasNumberOfStrings() {
    assertEquals(6, guitar01.getNumberOfStrings());
  }

  @Test
  public void testCanPlay() {
    assertEquals("*guitar sounds*", guitar01.play());
  }
}