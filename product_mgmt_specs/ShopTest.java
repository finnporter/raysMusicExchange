import static org.junit.Assert.*;
import org.junit.*;
import product_mgmt.*;

public class ShopTest {

  Shop shop;

  @Before
  public void before() {
    shop = new Shop("Ray's Music Exchange");
  }

  @Test
  public void testShopHasName() {
    assertEquals("Ray's Music Exchange", shop.getName());
  }

  @Test
  public void testStockStartsEmpty() {
    assertEquals(0, shop.stockCount());
  }
}