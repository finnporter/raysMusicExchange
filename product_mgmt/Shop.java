package product_mgmt;
import behaviours.*;
import java.util.ArrayList;

public class Shop {

  private String name;
  private ArrayList<Sellable> stock;

  public Shop(String name) {
    this.name = name;
    this.stock = new ArrayList<Sellable>();
  }

  public String getName() {
    return this.name;
  }

  public int stockCount() {
    return this.stock.size();
  }

  public void add(Sellable item) {
    this.stock.add(item);
  }

  public void remove(Sellable item) {
    this.stock.remove(item);
  }

  public double totalProfit() {
    double total = 0;
    for (Sellable item : this.stock) {
      total += item.calculateMarkup();
    }
    return total;
  }

}