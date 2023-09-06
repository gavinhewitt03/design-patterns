// 247.001 Design Patterns #1

package strategy;

import java.util.Random;

/**
 * Creates a QuarterBack child object of the Player parent class.
 * @author Gavin Hewitt
 */
public class QuarterBack extends Player {
  private Random random = new Random();
  /**
   * Instantiates a QuarterBack object with a first and last name and offensive position.
   * @param firstName String
   * @param lastName String
   * @param offense boolean
   */
  public QuarterBack(String firstName, String lastName, boolean offense) {
    super(firstName, lastName, offense);
    this.setOffenseBehavior();
    this.setDefenseBehavior();
  }

  /**
   * Randomly assigns the offenseBehavior of the QuarterBack object to RunBehavior or PassBehavior 
   * with equal probability.
   */
  public void setOffenseBehavior() {
    int play = random.nextInt(2);
    switch (play) {
      case 0: offenseBehavior = new RunBehavior();
        break;
      case 1: offenseBehavior = new PassBehavior();
    }
  }

  /**
   * Assigns the defenseBehavior of the QuarterBack object to null.
   */
  public void setDefenseBehavior() {
    this.defenseBehavior = null;
  }

} 
