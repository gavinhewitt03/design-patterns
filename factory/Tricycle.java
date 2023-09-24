// 247.001 Factory Design Pattern

package factory;
/**
 * @author Gavin Hewitt
 * This class creates a Tricycle child object of the Bike class.
 */
public class Tricycle extends Bike {
  /**
   * Creates a Tricycle Bike object.
   */
  public Tricycle() {
    name = "Tricycle";
    price = 49.99;
    numWheels = 3;
    hasPedals = true;
    hasTrainingWheels = false;
  }
}
