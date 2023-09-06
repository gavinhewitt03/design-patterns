package strategy;

// Gavin Hewitt
// 247.001 F23 Design Patterns #1

import java.util.Random;

public class RunBehavior implements OffenseBehavior {
  private Random random = new Random();

  public String play() {
    // var play holds an integer random integer 0 to 3 (inclusive) 
    // with equal probability
    int play = random.nextInt(4);

    // switch case block to return String corresponding to random
    // value of play variable
    switch (play) {
      case 0: return "runs a drive(up the gut)";
      case 1: return "runs a draw";
      case 2: return "runs a pitch";
      case 3: return "runs a reverse";
      default: return "invalid value for play";
    }
  }
}
