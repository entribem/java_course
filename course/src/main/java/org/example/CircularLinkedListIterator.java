package org.example;

import java.util.Iterator;

public class CircularLinkedListIterator<E> implements Iterator<E> {
    private int size;
    private int currIndex;
    private Node<E> start;
    private Node<E> currNode;

    public CircularLinkedListIterator(Node<E> start, int size) {
        this.start = start;
        this.size = size;
        this.currIndex = 0;
        this.currNode = start;
    }

    @Override
    public boolean hasNext() {
        return size != 0 && currIndex != size;
    }

    @Override
    public E next() {
        E val = currNode.getValue();
        currNode = currNode.getNext();
        currIndex++;
        return val;
    }
}
