// CSCE 247.001 Singleton Design Pattern
package singleton;

import java.util.ArrayList;

/**
 * @author Gavin Hewitt
 * Creates an Anagram object with a String data member corresponding to the question
 * and an ArrayList of answers for the anagram.
 */
public class Anagram {
  private String question;
  private ArrayList<String> answers;

  /**
   * Intializies an Anagram object with a String question and 
   * ArrayList of Strings of answers.
   * @param question String
   * @param answers ArrayList<String>
   */
  public Anagram(String question, ArrayList<String> answers) {
    this.question = question;
    this.answers = answers;
  }

  /**
   * Returns the question data member for the Anagram object.
   * @return String
   */
  public String getQuestion() {
    return question;
  }

  /**
   * Returns a boolean value which checks that the user input value
   * is equal to one of the answers in the ArrayList answers.
   * @param userAnswer String
   * @return boolean
   */
  public boolean isCorrect(String userAnswer) {
    for(String answer : answers) {
      if(answer.equalsIgnoreCase(userAnswer))
        return true;
    }
    return false;
  }
}
