// 247.001 Factory Design Pattern

package factory;

/**
 * @author Gavin Hewitt
 * Implements a factory design pattern to create the different
 * parts of various kinds of bikes and put them together according to
 * the bike type.
 */
public abstract class Bike {
  protected String name;
  protected double price;
  protected int numWheels;
  protected boolean hasPedals;
  protected boolean hasTrainingWheels;

  /**
   * Returns a String indicating what kind of bike is being assembled.
   * @return String
   */
  public String assembleBike() {
    String ret = "Creating a " + name + createFrame()
      + "\n- Price: $" + getPrice() + addWheels();
    if(hasPedals)
      ret += addPedals();
    if(hasTrainingWheels)
      ret += "\n- Adding training wheels";
    return ret;
  }

  /**
   * Returns a String indicating that a frame is has been made
   * for the specific type of Bike being created.
   * @return String
   */
  private String createFrame() {
    return "\n- Assembling " + name + " frame";
  }

  /**
   * Returns a String indicating that wheels have been added to a bike
   * corresponding to the specified number of wheels specific to each bike
   * type.
   * @return String
   */
  private String addWheels() {
    return "\n- Adding " + numWheels + " wheel(s)";
  }

  /**
   * Returns a String indicating that pedals have been added to a bike frame.
   * @return String
   */
  private String addPedals() {
    return "\n- Adding pedals";
  }

  /**
   * Returns the price associated with a specific type of bike.
   * @return double
   */
  public double getPrice() {
    return price;
  }
}
