import static org.junit.Assert.*;
import org.junit.*;
import product_mgmt.*;

public class ShopTest {

  Shop shop;
  Product product01;
  Piano piano01;
  Guitar guitar01;

  @Before
  public void before() {
    shop = new Shop("Ray's Music Exchange");
    product01 = new Product("guitar strings", 6, 10);
    piano01 = new Piano("black", "grand piano", "grand", 10000, 12000, "Bösendorfer", "Grand Piano 170", 88);
    guitar01 = new Guitar("Sunburst", "semi-acoustic", "regular", 150, 299, "Ibanez", "Archtop", 6);
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

  @Test
  public void testShopCanRemoveStock() {
    shop.add(product01);
    shop.add(piano01);
    shop.add(guitar01);
    shop.remove(product01);
    assertEquals(2, shop.stockCount());
  }

  
}