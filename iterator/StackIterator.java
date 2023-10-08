// CSCE 247.001 Iterator Design Pattern

package iterator;

import java.util.Stack;
import java.util.Iterator;

/**
 * @author Gavin Hewitt
 * Creates an extension of the Iterator class to iterate through
 * a stack and its values
 */
public class StackIterator implements Iterator {
  private Stack<String> items;
  private int position = 0;

  /**
   * Initialize a StackIterator object with a Stack of Strings.
   * @param items Stack<String>
   */
  public StackIterator(Stack<String> items) {
    this.items = items;
  }

  /**
   * Returns a boolean value that checks whether or not the current value
   * of the stack is the last value or not.
   * @return boolean
   */
  public boolean hasNext() {
    return position < items.size() && items.get(position) != null;
  }

  /**
   * Returns the current String in the stack and iterates to the next one.
   * @return String
   */
  public String next() {
    if(hasNext()) {
      String ret = items.get(position);
      position++;
      return ret;
    }
    return null;
  }
}
