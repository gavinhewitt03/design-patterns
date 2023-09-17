// 247.001 Decorator Design Pattern
package decorator;

/**
 * @author Gavin Hewitt
 * This class modifies the color of the terminal to "paint"
 * the car that the lines attribute of the Vehicle class represents.
 */
public class Paint extends VehicleDecorator {
  /**
   * Creates a Paint object to modify the color of the terminal which
   * decorates the car that the ArrayList lines attribute in Vehicle represents.
   * @param vehicle Vehicle
   * @param color String
   */
  public Paint(Vehicle vehicle, String color) {
    super(vehicle.lines);
    String colorLine = getCode(color) + vehicle.lines.get(0);
    vehicle.lines.set(0, colorLine);
    String whiteLine = vehicle.lines.get(vehicle.lines.size() - 1) +
    getCode("black");
    vehicle.lines.set(vehicle.lines.size() - 1, whiteLine);
  }

  /**
   * Helper method to get the String modification value that
   * changes the color of the terminal to the corresponding color
   * @param color String
   */
  private String getCode(String color) {
    if(color.equals("red"))
      return "\u001B[31m";
    if(color.equals("black"))
      return "\u001B[0m";
    if(color.equals("green"))
      return "\u001B[32m";
    if(color.equals("yellow"))
      return "\u001B[33m";
    if(color.equals("blue"))
      return "\u001B[34m";
    if(color.equals("purple"))
      return "\u001B[35m";
    if(color.equals("cyan"))
      return "\u001B[36m";
    return "";
  }
}
