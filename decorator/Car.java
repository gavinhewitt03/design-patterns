// 247.001 Decorator Design Pattern
package decorator;

/**
 * @author Gavin Hewitt
 * This class creates a Car object which is an extension of a Vehicle object.
 */
public class Car extends Vehicle {
  /**
   * Constructor that calls the super constructor and passes in every line
   * in the local file car.txt
   */
  public Car() {
    super(FileReader.getLines("decorator/car.txt"));
  }
}
