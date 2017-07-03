import static org.junit.Assert.*;
import org.junit.*;
import product_mgmt.*;
import behaviours.*;

public class ShopTest {

  Shop shop;
  Sellable item;

  @Before
  public void before() {
    shop = new Shop("Ray's Music Exchange");
    item = new Piano("black", InstrumentType.KEYBOARD, "grand", 10000, 12000, "Bösendorfer", "Grand Piano 170", 88);
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
    shop.add(item);
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void testShopCanRemoveStock() {
    shop.add(item);
    shop.remove(item);
    assertEquals(0, shop.stockCount());
  }

  @Test
  public void testTotalProfit() {
    shop.add(item);
    assertEquals(2000, shop.totalProfit(), 0.01);
  }
}