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
}