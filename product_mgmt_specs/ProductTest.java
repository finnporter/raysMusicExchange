import static org.junit.Assert.*;
import org.junit.*;
import product_mgmt.*;

public class ProductTest {

  Product product01;

  @Before
  public void before() {
    product01 = new Product("guitar strings", 6, 10);
  }

  @Test
  public void testHasType() {
    assertEquals("guitar strings", product01.getType());
  }

  @Test
  public void testHasBuyPrice() {
    assertEquals(6, product01.getBuyPrice(), 0.01);
  }

  @Test
  public void testHasSellPrice() {
    assertEquals(10, product01.getSellPrice(), 0.01);
  }

}