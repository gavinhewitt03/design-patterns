package strategy;

// 247.001 Design Patterns #1

/**
 * Creates a Player object that will carry out the actions of a football player on a team.
 * @author Gavin Hewitt
 */
public abstract class Player {
  private String firstName;
  private String lastName;
  private boolean offense;
  protected DefenseBehavior defenseBehavior;
  protected OffenseBehavior offenseBehavior;

  /**
   * Instantiates a Player object with a first and last name and an offensive position.
   * @param firstName String value representing the Player's first name
   * @param lastName String value representing the Player's last name
   * @param offense boolean value corresponding to the Player's position on offense or defense.
   * True is indicative of offense and defense is false.
   */
  public Player(String firstName, String lastName, boolean offense) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.offense = offense;
  }

  /**
   * Sets the defensiveBehavior of a Player based on Player type.
   */
  public abstract void setDefenseBehavior();

  /**
   * Sets the offensiveBehavior of a Player based on Player type.
   */
  public abstract void setOffenseBehavior();

  /**
   * Returns a String value representing the play the Player performs.
   * @return String
   */
  public String play() {
    this.setDefenseBehavior();
    this.setOffenseBehavior();
    if(offense && offenseBehavior != null)
      return offenseBehavior.play();
    else if(offense)
      return " not playing";
    else if(defenseBehavior != null)
      return defenseBehavior.play();
    return " not playing";
  }

  /**
   * Changes the Player's offensive status.
   */
  public void turnover() {
    offense = !offense;
  }

  /**
   * Returns the Player's name in String format
   * @return String
   */
  public String toString() {
    return firstName + " " + lastName;
  }
}
