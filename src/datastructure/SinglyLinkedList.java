package datastructure;

public class SinglyLinkedList<T> extends LinkedList<T> {
    public void add(T data) {
        Node<T> node = new Node<>(data);
        this.length += 1;

        if(this.head == null) {
            this.head = node;
        } else {
            this.tail.setNext((T)node);
        }

        this.tail = node;
    }

    public Node<T> remove() {
        if(this.head == null){
            return null;
        }

        this.length -= 1;

        Node<T> node = this.head;
        this.head = (Node<T>) this.head.getNext();

        node.setNext(null);

        return node;
    }
}
