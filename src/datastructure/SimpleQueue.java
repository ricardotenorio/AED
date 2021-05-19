import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleQueue<T> implements Iterable<T>{
  private List<T> queue;

  public SimpleQueue() {
    this.queue = new ArrayList<T>();
  }

  public void enqueue(T t) {
    this.queue.add(t);
  }

  public T dequeue() {
    return this.queue.isEmpty() ? null : this.queue.remove(0);
  }

  public T peek() {
    return this.queue.isEmpty() ? null : this.queue.get(0);
  }

  public int size() {
    return this.queue.size();
  }

  public boolean isEmpty() {
    return this.queue.isEmpty();
  }

  public String toString() {
    return this.queue.toString();
  }

  @Override
  public Iterator<T> iterator() {
    return this.queue.iterator();
  }
}
