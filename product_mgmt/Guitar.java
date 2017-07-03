package product_mgmt;
import behaviours.*;

public class Guitar extends Instrument {

  private int numberOfStrings;

  public Guitar(String colour, InstrumentType type, String size, int buyPrice, int sellPrice, String brand, String model, int numberOfStrings) {
    super(colour, type, size, buyPrice, sellPrice, brand, model);
    this.numberOfStrings = numberOfStrings;
  }

  public int getNumberOfStrings() {
    return this.numberOfStrings;
  }

  public String play() {
    return "*guitar sounds*";
  }

  public double calculateMarkup() {
    return this.sellPrice - this.buyPrice;
  }
}