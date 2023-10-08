// CSCE 247.001 Iterator Design Pattern

package iterator;

import java.util.Stack;

/**
 * @author Gavin Hewitt
 * Creates a document object with undo and redo stack iterators
 * to track and iterate through a document's changelog.
 */
public class Document {
  private String title;
  private Stack<String> undoStack;
  private Stack<String> redoStack;

  /**
   * Initialize a Document object with a title, undo, and redo stack.
   * @param title String
   */
  public Document(String title) {
    this.title = title;
    undoStack = new Stack<String>();
    redoStack = new Stack<String>();
  }

  /**
   * Adds a change to the undoStack of a Document.
   * @param change String
   * @return current String of stack
   */
  public String makeChange(String change) {
    undoStack.add(change);
    return change;
  }

  /**
   * Moves a change from the undoStack to the redoStack of a Document.
   * @return String object being moved
   */
  public String undoChange() {
    String ret = undoStack.pop();
    redoStack.add(ret);
    return ret;
  }

  /**
   * Returns a boolean value corresponding to whether the undoStack is 
   * empty or not.
   * @return boolean
   */
  public boolean canUndo() {
    return !undoStack.empty() && undoStack.peek() != null;
  }

  /**
   * Moves a change from the redoStack to the undoStack of a Document.
   * @return String object being transfered
   */
  public String redoChange() {
    String ret = redoStack.pop();
    undoStack.add(ret);
    return ret;
  }

  /**
   * Returns a boolean value corresponding to whether the redoStack is
   * empty or not.
   * @return boolean
   */
  public boolean canRedo() {
    return !redoStack.empty() && redoStack.peek() != null;
  }

  /**
   * Returns a StackIterator for the undoStack data memeber.
   * @return StackIterator
   */
  public StackIterator getUndoIterator() {
    return new StackIterator(undoStack);
  }

  /**
   * Returns a StackIterator for the redoStack data member.
   * @return StackIterator
   */
  public StackIterator getRedoIterator() {
    return new StackIterator(redoStack);
  }
}
