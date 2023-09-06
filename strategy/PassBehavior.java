package strategy;

// Gavin Hewitt
// 247.001 F23 Design Patterns #1

import java.util.Random;

public class PassBehavior implements OffenseBehavior {
  private Random random = new Random();

  public String play() {
    // var play holds an integer random integer 0 to 4 (inclusive) 
    // with equal probability
    int play = random.nextInt(5);

    // switch case block to return String corresponding to random
    // value of play variable
    switch (play) {
      case 0: return "throws a slant route";
      case 1: return "throws an out route";
      case 2: return "throws a seem route";
      case 3: return "throws a screen pass";
      case 4: return "throws a hail mary";
      default: return "invalid value for play";
    }
  }
}
