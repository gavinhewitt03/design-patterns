// 247.001 Factory Design Pattern

package factory;

/**
 * @author Gavin Hewitt
 * This class creates a Strider child object of the Bike class.
 */
public class Strider extends Bike {
  /**
   * Creates a Strider Bike object.
   */
  public Strider() {
    name = "Strider";
    price = 74.99;
    numWheels = 2;
    hasPedals = false;
    hasTrainingWheels = false;
  }
}
