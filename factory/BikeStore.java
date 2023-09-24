// 247.001 Factory Design Pattern

// 247.001 Factory Design Pattern
package factory;

/**
 * @author Gavin Hewitt
 * This class creates a BikeStore object to create a Bike of varying type
 * based on an input String.
 */
public class BikeStore {
  /**
   * Creates a Bike object of one of three types depending on the value
   * of an input String.
   * @param type String
   * @return Bike
   */
  public Bike createBike(String type) {
    if(type.equals("tricycle"))
      return new Tricycle();
    else if(type.equals("strider"))
      return new Strider();
    else if(type.equals("kids bike"))
      return new KidsBike();
    return null;
  }
}
