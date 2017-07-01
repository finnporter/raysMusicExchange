package product_mgmt;
import behaviours.*;

public abstract class Instrument implements Playable, Sellable {

  String colour;
  String type; //woodwinds, brass,...
  String size;
  int buyPrice;
  int sellPrice;
  String brand;
  String model;

  public Instrument(String colour, String type, String size, int buyPrice, int sellPrice, String brand, String model) {
    this.colour = colour;
    this.type = type;
    this.size = size;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    this.brand = brand;
    this.model = model;
  }

  // Getters for all properties

  public String getColour() {
    return this.colour;
  }

  public String getType() {
    return this.type;
  }

  public String getSize() {
    return this.size;
  }

  public int getBuyPrice() {
    return this.buyPrice;
  }

  public int getSellPrice() {
    return this.sellPrice;
  }

  public String getBrand() {
    return this.brand;
  }

  public String getModel() {
    return this.model;
  }
}