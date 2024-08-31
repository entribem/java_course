package org.example;

import java.util.Iterator;

public class CircularLinkedListIterator<E> implements Iterator<E> {
    private Node<E> start;
    private Node<E> currNode;

    public CircularLinkedListIterator(Node<E> start) {
        this.start = start;
        this.currNode = start;
    }

    @Override
    public boolean hasNext() {
        return start != null;
    }

    @Override
    public E next() {
        E val = currNode.getValue();
        currNode = currNode.getNext();
        return val;
    }
}
