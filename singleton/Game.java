// CSCE 247.001 Singleton Design Pattern

package singleton;

import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * @author Gavin Hewitt
 * Creates a Game object to run an Anagram guessing game.
 */
public class Game {
  private static Game game;
  private Random rand;
  private Difficulty level;
  private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
  private Anagram currentAnagram;
  private int score;
  
  /**
   * Private constructor to initalize a Game object.
   */
  private Game() {
    rand = new Random();
    anagrams = new HashMap<>();
    anagrams.put(Difficulty.EASY, FileReader.getAnagrams(Difficulty.EASY));
    anagrams.put(Difficulty.MEDIUM, FileReader.getAnagrams(Difficulty.MEDIUM));
    anagrams.put(Difficulty.HARD, FileReader.getAnagrams(Difficulty.HARD));
    rand = new Random();
    level = Difficulty.EASY;
    score = 0;
  }

  /**
   * Returns the current instance of a Game object. Initializes a new Game object
   * if one does not already exist.
   * @return Game
   */
  public static Game getInstance() {
    if (game == null) {
      System.out.println("Creating a new game.");
      game = new Game();
    }
    return game;
  }

  /**
   * Returns the question assiociated with the current anagram being used and
   * changes the difficulty based on the score.
   * @return String
   */
  public String getQuestion() {
    if(score < 4)
      level = Difficulty.EASY;
    else if(score < 7)
      level = Difficulty.MEDIUM;
    else
      level = Difficulty.HARD;
    int size = anagrams.get(level).size();
    currentAnagram = anagrams.get(level).get(rand.nextInt(size));
    return currentAnagram.getQuestion();
  }

  /**
   * Checks to see if the user input answer is correct and increments the score if
   * correct or decrements if incorrect and returns a corresponding boolean value.
   * @param userAnswer String
   * @return boolean
   */
  public boolean isCorrect(String userAnswer) {
    if(currentAnagram.isCorrect(userAnswer)){
      score++;
      return true;
    }
    if(score!=0)
      score--;
    return false;
  }

  /**
   * Returns the current score.
   * @return int
   */
  public int getScore() {
    return score;
  }

}