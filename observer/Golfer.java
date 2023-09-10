// 247.001 Observer Design Pattern
package observer;

import java.util.ArrayList;
/**
 * @author Gavin Hewitt
 * Creates a Golfer object with a name and an Array list of observers
 * that track the number of strokes and par for each hole.
 */
public class Golfer implements Subject {
  private ArrayList<Observer> observers;
  private String name;

  /**
   * Instantiates a Golfer object with a name and ArrayList of observers.
   * @param name String
   */
  public Golfer(String name) {
    observers = new ArrayList<Observer>();
    this.name = name;
  }

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers(int strokes, int par) {
    for(Observer observer : observers) {
      observer.update(strokes, par);
    }
  }

  public void enterScore(int strokes, int par) {
    notifyObservers(strokes, par);
  }

  public String getName() {
    return this.name;
  }
}
