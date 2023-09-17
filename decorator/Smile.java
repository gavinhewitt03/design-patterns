// 247.001 Decorator Design Pattern
package decorator;

/**
 * @author Gavin Hewitt
 * This class adds a smile to the car that the ArrayList lines
 * represents in the Vehicle class.
 */
public class Smile extends VehicleDecorator {
  /**
   * Constructs a Smile object to modify and decorate the ArrayList lines
   * of a Vehicle object representing a car.
   * @param vehicle Vehicle
   */
  public Smile(Vehicle vehicle) {
    super(vehicle.lines);
    this.integrateDecor(FileReader.getLines("decorator/txt/smile.txt"));
  }
}
