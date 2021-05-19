import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack<T> implements Iterable<T>{
  private List<T> stack;

  public Stack() {
    this.stack = new ArrayList<T>();
  }

  public void push(T t) {
    this.stack.add(t);
  }

  public T pop() {
    return this.stack.isEmpty() ? null : this.stack.remove(this.stack.size() - 1);
  }

  public T peek() {
    return this.stack.isEmpty() ? null : this.stack.get(this.stack.size() - 1);
  }

  public int size() {
    return this.stack.size();
  }

  public boolean isEmpty() {
    return this.stack.isEmpty();
  }

  public String toString() {
    return this.stack.toString();
  }

  @Override
  public Iterator<T> iterator() {
    return this.stack.iterator();
  }
}
