package datastructure;

import java.util.Objects;

public class Node<T> {
    private T previous;
    private T data;
    private T next;

    public Node() {
        this.previous = null;
        this.next = null;
    }

    public Node(T data) {
        this.previous = null;
        this.next = null;
        this.data = data;
    }

    public T getPrevious() {
        return previous;
    }

    public void setPrevious(T previous) {
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getNext() {
        return next;
    }

    public void setNext(T next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "|" + data + "|";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.data.getClass() != o.getClass()) return false;
        T data = (T) o;
        return this.data.equals(data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
