package datastructure;

import java.util.Iterator;

public abstract class LinkedList<T> implements Iterable<T>{
    protected Node<T> head;
    protected Node<T> tail;
    protected int length;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean contains(T data) {
        if(this.head == null) {
            return false;
        }

        Node<T> node = this.head;

        while(node != null) {
            if(node.equals(data)) {
                return true;
            }
            node = (Node<T>) node.getNext();
        }

        return false;
    }

    public Node<T> search(T data) {
        //TODO
        return null;
    }

    public int size() {
        return this.length;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<T> node = this.head;
        String representation;

        while(node != null) {
            stringBuilder.append(node);
            node = (Node<T>) node.getNext();
        }

        representation = stringBuilder.toString();

        return representation.length() > 0 ? representation : "---";
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public T next() {
                if(hasNext()) {
                    T data = node.getData();
                    node = (Node<T>) node.getNext();

                    return data;
                }
                return null;
            }
        };
    }
}
