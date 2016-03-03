package org.nhtzr.datastructures.linkedlist;

/**
 * Created by Ezequiel on 3/2/2016.
 */
public class Node<T> {
    private final T datum;
    private final Node<T> next;

    public Node(T datum, Node<T> next) {
        this.next = next;
        this.datum = datum;
    }

    public Node(T datum) {
        this.next = null;
        this.datum = datum;
    }

    public T getDatum() {
        return datum;
    }

    public Node<T> getNext() {
        return next;
    }
}
