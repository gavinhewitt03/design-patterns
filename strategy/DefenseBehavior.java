package strategy;
// 247.001 F23 Design Patterns #1

/**
 * Determines a Player object's Defensive Behavior either randomly or by position on team
 * @author Gavin Hewitt
 */
public interface DefenseBehavior {
  /**
   * Returns a String object indicating what defensive play has been made by the Player object
   * @return String
   */
  public String play();
}
