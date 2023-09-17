// 247.001 Decorator Design Pattern
package decorator;

import java.util.ArrayList;

/**
 * @author Gavin Hewitt
 * Class to create a VehicleDecorator object that modifies the text lines
 * that represent the parts of a car.
 */
public abstract class VehicleDecorator extends Vehicle {
  /**
   * Constructor that accepts an ArrayList of strings and inputs
   * the list into the super constructor.
   * @param lines ArrayList<String>
   */
  public VehicleDecorator(ArrayList<String> lines) {
    super(lines);
  }

  /**
   * Replaces empty characters of a line in the lines ArrayList with
   * non-empty characters of the corresponding line in the decor ArrayList
   * @param decor ArrayList<String>
   */
  protected void integrateDecor(ArrayList<String> decor) {
    for (int i = 0; i < decor.size(); i++) {
      char[] vehicleLine = lines.get(i).toCharArray();
      char[] decorLine = decor.get(i).toCharArray();
      int minLen = vehicleLine.length < decorLine.length ?
      vehicleLine.length : decorLine.length;
      for (int j = 0; j < minLen; j++) {
        if (decorLine[j] != ' ') {
          vehicleLine[j] = decorLine[j];
          lines.set(i, new String(vehicleLine));
        }
      }
    }
  }
}
