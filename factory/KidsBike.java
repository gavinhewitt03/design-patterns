// 247.001 Factory Design Pattern
package factory;

/**
 * @author Gavin Hewitt
 * This class creates a Kids Bike child object of the Bike class.
 */
public class KidsBike extends Bike {
  /**
   * Creates a Kids Bike object.
   */
  public KidsBike() {
    name = "Kids Bike";
    price = 84.99;
    numWheels = 2;
    hasPedals = true;
    hasTrainingWheels = true;
  }
}
