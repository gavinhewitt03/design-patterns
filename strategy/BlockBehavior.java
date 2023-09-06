package strategy;

// Gavin Hewitt
// 247.001 F23 Design Patterns #1

import java.util.Random;

public class BlockBehavior implements DefenseBehavior {
  private Random random = new Random();

  public String play() {
    // var play holds an integer random integer 0 to 3 (inclusive) 
    // with equal probability
    int play = random.nextInt(4);

    // switch case block to return String corresponding to random
    // value of play variable
    switch (play) {
      case 0: return "block a kick";
      case 1: return "block a punt";
      case 2: return "block a pass";
      case 3: return "block a catch";
      default: return "invalid value for play";
    }
  }
}
