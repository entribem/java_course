package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node <E> {
    private E value;
    private Node<E> next;
    private Node<E> prev;

    public Node(E value) {
        this.value = value;
    }
}
