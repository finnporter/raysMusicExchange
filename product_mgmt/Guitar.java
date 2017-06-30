package product_mgmt;
import behaviours.*;

public class Guitar extends Instrument implements Playable {

  int numberOfStrings;

  public Guitar(String colour, String type, String size, int buyPrice, int sellPrice, String brand, String model, int numberOfStrings) {
    super(colour, type, size, buyPrice, sellPrice, brand, model);
    this.numberOfStrings = numberOfStrings;
  }

  public int getNumberOfStrings() {
    return this.numberOfStrings;
  }

  public String play() {
    return "*guitar sounds*";
  }
}