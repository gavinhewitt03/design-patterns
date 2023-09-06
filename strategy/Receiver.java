//247.001 Design Patterns #1

package strategy;

/**
 * Creates a Receiver child object of the Player parent class.
 * @author Gavin Hewitt
 */
public class Receiver extends Player {
  /**
   * Instantiates a Receiver object with a first and last name and offensive position.
   * @param firstName String
   * @param lastName String
   * @param offense boolean
   */
  public Receiver(String firstName, String lastName, boolean offense) {
    super(firstName, lastName, offense);
    this.setOffenseBehavior();
    this.setDefenseBehavior();
  }
  
  /**
   * Sets the offenseBehavior of the Receiver object to ReceiveBehavior.
   */
  public void setOffenseBehavior() {
    this.offenseBehavior = new ReceiveBehavior();
  }

  /**
   * Assigns the defenseBehavior of the Recever object to null.
   */
  public void setDefenseBehavior() {
    this.defenseBehavior = null;
  }
}
