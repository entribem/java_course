package org.example;

public class CircularLinkedList<E> {
    private Node<E> start;

    public CircularLinkedList() {
        start = null;
    }

    public E get(int index) {
        isEmpty();
        int currIndex = 0;
        Node<E> currNode = start;
        while (currIndex != index) {
            currNode = currNode.getNext();
            currIndex++;
        }
        return currNode.getValue();
    }

    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (start == null) {
            start = newNode;
            start.setNext(start);
            start.setPrev(start);
        }
        else {
            int currIndex = 0;
            Node<E> currNode = start;
            while (currIndex != index) {
                currNode = currNode.getNext();
                currIndex++;
            }
            Node<E> prevNode = currNode.getPrev();
            newNode.setNext(currNode);
            newNode.setPrev(prevNode);
            prevNode.setNext(newNode);
            currNode.setPrev(newNode);
            if (currIndex == 0) {
                start = newNode;
            }
        }
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        if (start == null) {
            start = newNode;
            start.setNext(start);
            start.setPrev(start);
        }
        else {
            Node<E> last = start.getPrev();
            newNode.setNext(start);
            newNode.setPrev(last);
            last.setNext(newNode);
            start.setPrev(newNode);
            start = newNode;
        }
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (start == null) {
            start = newNode;
            start.setNext(start);
            start.setPrev(start);
        }
        else {
            Node<E> last = start.getPrev();
            newNode.setNext(start);
            newNode.setPrev(last);
            last.setNext(newNode);
            start.setPrev(newNode);
        }
    }

    public void remove(int index) {
        isEmpty();
        int currIndex = 0;
        Node<E> currNode = start;
        while (currIndex != index) {
            currNode = currNode.getNext();
            currIndex++;
        }
        Node<E> prevNode = currNode.getPrev();
        Node<E> nextNode = currNode.getNext();
        prevNode.setNext(nextNode);
        nextNode.setPrev(prevNode);
        if (currIndex == 0) {
            start = nextNode;
        }
    }

    public void removeFirst() {
        isEmpty();
        Node<E> newStart = start.getNext();
        Node<E> last = start.getPrev();
        last.setNext(newStart);
        newStart.setPrev(last);
        start = newStart;
    }

    public void removeLast() {
        isEmpty();
        Node<E> last = start.getPrev();
        Node<E> newEnd = last.getPrev();
        newEnd.setNext(start);
        start.setPrev(newEnd);
    }

    public CircularLinkedListIterator<E> iterator() {
        return new CircularLinkedListIterator<>(start);
    }

    public void isEmpty() {
        if (start == null) {
            throw new IllegalArgumentException("List is empty!");
        }
    }
}
