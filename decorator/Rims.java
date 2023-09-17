// 247.001 Decorator Design Pattern
package decorator;

/**
 * @author Gavin Hewitt
 * This class adds rims to the car that the ArrayList lines
 * represents
 */
public class Rims extends VehicleDecorator {
  /**
   * Constructs a Rims object to modify and decorate the ArrayList lines
   * of a Vehicle object representing a car.
   * @param vehicle Vehicle
   */
  public Rims(Vehicle vehicle) {
    super(vehicle.lines);
    this.integrateDecor(FileReader.getLines("decorator/txt/rims.txt"));
  }
}
