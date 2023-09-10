// 247.001 Observer Design Pattern
// Gavin Hewitt
package observer;

public interface Subject {
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyObservers(int strokes, int par);
}
