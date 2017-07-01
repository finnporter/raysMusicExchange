package product_mgmt;
import behaviours.*;

public class Piano extends Instrument {

  int numberOfKeys;

  public Piano(String colour, String type, String size, int buyPrice, int sellPrice, String brand, String model, int numberOfKeys) {
    super(colour, type, size, buyPrice, sellPrice, brand, model);
    this.numberOfKeys = numberOfKeys;
  }

  public int getNumberOfKeys() {
    return this.numberOfKeys;
  }

  public String play() {
    return "*piano sounds*";
  }

  public double calculateMarkup() {
    return sellPrice - buyPrice;
  }
}