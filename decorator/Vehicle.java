// 247.001 Decorator Design Pattern
package decorator;

import java.util.ArrayList;
/**
 * @author Gavin Hewitt
 * This abstract class creates an instance of a vehicle object
 * that is to be extended by child classes.
 */
public abstract class Vehicle {
  protected ArrayList<String> lines;
  /**
   * Constructor with attribute lines composed of an ArrayList of String objects.
   * @param lines ArrayList<String>
   */
  public Vehicle(ArrayList<String> lines) {
    this.lines = lines;
  }

  /**
   * Returns a String representation of the String ArrayList attribute lines.
   */
  public String toString() {
    String retString = "";
    for (String line : lines)
      retString += line + "\n";
    return retString;
  }
}
