// 247.001 Observer Design Pattern
package observer;

/**
 * @author Gavin Hewitt
 * Creates a HoleScoreDisplay object to display the
 * strokes taken and the par for the current hole.
 */
public class HoleScoreDisplay implements Observer {
  private Subject golfer;
  private int strokes;
  private int par;

  public HoleScoreDisplay(Subject golfer) {
    this.golfer = golfer;
    this.golfer.registerObserver(this);
  }

  public void update(int strokes, int par) {
    this.strokes = strokes;
    this.par = par;
  }

  public String toString() {
    if (strokes > par) {
      return "Current Hole stats: Par (" +par+ ") Strokes (" +
      strokes+ "), " +(strokes - par)+ " over par";
    } else if (strokes == par) {
      return "Current Hole stats: Par (" +par+ ") Strokes (" +
      strokes+ "), Making par";
    }
    return "Current Hole stats: Par (" +par+ ") Strokes (" +
      strokes+ "), " +(par - strokes)+ " under par";
  }
}
