package org.source;

public class Node {
    private int value;

    private Node right = null;

    private Node left = null;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void setRight(Node node) {
        right = node;
    }

    public void setLeft(Node node) {
        left = node;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
