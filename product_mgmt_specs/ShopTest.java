import static org.junit.Assert.*;
import org.junit.*;
import product_mgmt.*;

public class ShopTest {

  Shop shop;
  Product product01;

  @Before
  public void before() {
    shop = new Shop("Ray's Music Exchange");
    product01 = new Product("guitar strings", 6, 10);
  }

  @Test
  public void testShopHasName() {
    assertEquals("Ray's Music Exchange", shop.getName());
  }

  @Test
  public void testStockStartsEmpty() {
    assertEquals(0, shop.stockCount());
  }

  @Test
  public void testShopCanAddStock() {
    shop.add(product01);
    assertEquals(1, shop.stockCount());
  }
}