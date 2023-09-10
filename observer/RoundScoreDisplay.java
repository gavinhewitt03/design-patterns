// 247.001 Observer Design Pattern
package observer;

/**
 * @author Gavin Hewitt
 * Creates a RoundScoreDisplay object to display the total strokes
 * and the total par of a game of golf as the rounds progess.
 */
public class RoundScoreDisplay implements Observer {
  private Subject golfer;
  private int strokesTotal;
  private int parTotal;

  /**
   * Instantiates a RoundScoreDisplay object to track the golfer,
   * total strokes, and total par at a given point in the game.
   * @param golfer Golfer
   */
  public RoundScoreDisplay(Subject golfer) {
    this.golfer = golfer;
    this.golfer.registerObserver(this);
    strokesTotal = 0;
    parTotal = 0;
  }

  /**
   * Increments the total number of strokes and par for each hole.
   * @param strokes int
   * @param par int
   */
  public void update(int strokes, int par) {
    strokesTotal += strokes;
    parTotal += par;
  }

  /**
   * Returns a String representation of the total number of strokes,
   * the total par, and how far from par the total strokes are.
   */
  public String toString() {
    if(strokesTotal == parTotal) {
      return "Overall stats: Par (" +parTotal+ ") Strokes (" 
      +strokesTotal+ "), Making Par";
    } else if (strokesTotal > parTotal) {
      return "Overall stats: Par (" +parTotal+ ") Strokes (" 
      +strokesTotal+ "), " +(strokesTotal - parTotal)+ " over Par";
    }
    return "Overall stats: Par (" +parTotal+ ") Strokes (" 
      +strokesTotal+ "), " +(parTotal - strokesTotal)+ " under Par";
  }
}
