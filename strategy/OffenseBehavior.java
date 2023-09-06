package strategy;

// 247.001 F23 Design Patterns #1

/**
 * Determines a Player object's Offensive Behavior either randomly or by position on team
 * @author Gavin Hewitt
 */
public interface OffenseBehavior {
  /**
   * Returns a String object indicating what offensive play has been made by the Player object
   * @return String
   */
  public String play();
}
