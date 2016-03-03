package org.nhtzr.datastructures;

import org.nhtzr.datastructures.linkedlist.Node;

import java.util.Iterator;

/**
 * More like linked stack
 * Created by Ezequiel on 3/2/2016.
 */
public class LinkedList<T> implements Iterable<T> {

    private Node<T> head = null;

    public LinkedList() {
    }

    private LinkedList(Node<T> head) {
        this.head = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public T top() {
        if (isEmpty()) return error();
        return head.getDatum();
    }

    protected T error() {
        return null; // Or you could throw an exception
    }

    public T pop() {
        if (isEmpty()) return error();
        T datum = head.getDatum();
        head = head.getNext();
        return datum;
    }

    public void push(T element) {
        this.head = isEmpty()
                ? new Node<>(element)
                : new Node<>(element, this.head);
    }

    public LinkedList<T> copy() {
        return new LinkedList<>(this.head);
    }

    @Override
    public Iterator<T> iterator() {
        final LinkedList<T> it = copy();
        return new Iterator<T>() {

            @Override
            public boolean hasNext() {
                return !it.isEmpty();
            }

            @Override
            public T next() {
                return it.pop();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation remove unsupported because list is immutable");
            }
        };
    }

}
