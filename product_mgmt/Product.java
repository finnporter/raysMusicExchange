package product_mgmt;
import behaviours.*;

public class Product implements Sellable {

  String type;
  double buyPrice;
  double sellPrice;

  public Product(String type, double buyPrice, double sellPrice) {
    this.type = type;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public String getType() {
    return this.type;
  }

  public double getBuyPrice() {
    return this.buyPrice;
  }

  public double getSellPrice() {
    return this.sellPrice;
  }


  public double calculateMarkup(double buyPrice, double sellPrice) {
    return 100 / (buyPrice * sellPrice);
  }
}