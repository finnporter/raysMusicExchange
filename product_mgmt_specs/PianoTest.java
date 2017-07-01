import static org.junit.Assert.*;
import org.junit.*;
import product_mgmt.*;

public class PianoTest {

  Piano piano01;

  @Before
  public void before() {
    piano01 = new Piano("black", "grand piano", "grand", 10000, 12000, "Bösendorfer", "Grand Piano 170", 88);
    //String colour, String type, String size, Double buyPrice, Double sellPrice, String brand, String, model, int numberOfStrings
  }

  @Test
  public void testHasColour() {
    assertEquals("black", piano01.getColour());
  }

  @Test
  public void testHasType() {
    assertEquals("grand piano", piano01.getType());
  }

  @Test
  public void testHasSize() {
    assertEquals("grand", piano01.getSize());
  }

  @Test
  public void testHasBuyPrize() {
    assertEquals(10000, piano01.getBuyPrice());
  }

  @Test
  public void testHasSellPrize() {
    assertEquals(12000, piano01.getSellPrice());
  }

  @Test
  public void testHasBrand() {
    assertEquals("Bösendorfer", piano01.getBrand());
  }

  @Test
  public void testHasModel() {
    assertEquals("Grand Piano 170", piano01.getModel());
  }

  @Test
  public void testHasNumberOfStrings() {
    assertEquals(88, piano01.getNumberOfKeys());
  }

  @Test
  public void testCanPlay() {
    assertEquals("*piano sounds*", piano01.play());
  }

  @Test
  public void testCanCalculateMarkup() {
    assertEquals(2000, piano01.calculateMarkup(), 0.01);
  }
}