package datastructure;

public class DoublyLinkedList<T> extends LinkedList<T> {
    public void add(T data) {
        this.length += 1;
        Node<T> node = new Node<>(data);

        if(this.head == null) {
            this.head = node;
        } else {
            node.setPrevious((T) this.tail);
            this.tail.setNext((T) node);
        }

        this.tail = node;
    }

    public Node<T> remove() {
        if (this.head == null) {
            return null;
        }

        this.length -= 1;
        Node<T> node = this.head;

        this.head = (Node<T>) this.head.getNext();
        this.head.setPrevious(null);

        node.setNext(null);

        return node;
    }
}
