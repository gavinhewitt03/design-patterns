// 247.001 Design Patterns #1

package strategy;

import java.util.Random;

/**
 * Creates a Lineman child object of the Player parent class.
 * @author Gavin Hewitt
 */
public class Lineman extends Player{
  private Random random = new Random();

  /**
   * Instantiates a Lineman object with a first and last name and offensive position.
   * @param firstName String
   * @param lastName String
   * @param offense boolean
   */
  public Lineman(String firstName, String lastName, boolean offense) {
    super(firstName, lastName, offense);
    this.setDefenseBehavior();
    this.setOffenseBehavior();
  }

  /**
   * Assigns the offenseBehavior of the Recever object to the OBlockBehavior.
   */
  public void setOffenseBehavior() {
    this.offenseBehavior = new OBlockBehavior();
  }

  public void setDefenseBehavior() {
    int play = random.nextInt(3);
    switch (play) {
      case 0: this.defenseBehavior = new BlockBehavior();
        break;
      case 1: this.defenseBehavior = new SackBehavior();
        break;
      case 2: this.defenseBehavior = new StripBehavior();
    }
  }
}
