package org.source;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    private Node createStructure(){
        Node root = new Node(5);
        Node left = new Node(3);
        root.setLeft(left);
        left.setLeft(new Node(2));
        left.setRight(new Node(5));
        Node right = new Node(7);
        root.setRight(right);
        right.setLeft(new Node(1));
        right.setRight(new Node(0));
        right = right.getRight();
        right.setLeft(new Node(2));
        right.setRight(new Node(8));
        right = right.getRight();
        right.setRight(new Node(5));
        return root;
    }

    final Node dummyNode = createStructure();

    @Test
    void ShouldGetValue() {
        //given
        Node root = new Node(9);
        //when
        int res = root.getValue();
        //then
        assertEquals(res, 9);
    }

    @Test
    void ShouldGetLeft() {
        //given
        Node root = new Node(7);
        Node left = new Node(2);
        root.setLeft(left);
        left.setLeft(new Node(9));
        //when
        int val1 = root.getLeft().getValue();
        int val2 = root.getLeft().getLeft().getValue();
        //then
        assertTrue(val1 == left.getValue() && val2 == left.getLeft().getValue());

    }

    @Test
    void ShouldGetRight() {
        //given
        Node root = new Node(7);
        Node right = new Node(2);
        root.setRight(right);
        right.setRight(new Node(9));
        //when
        int val1 = root.getRight().getValue();
        int val2 = root.getRight().getRight().getValue();
        //then
        assertTrue(val1 == right.getValue() && val2 == right.getRight().getValue());
    }

    @Test
    void ShouldCountLeafs() {
        //when
        int res = Node.countLeafs(dummyNode);
        //then
        assertEquals(res, 5);
    }

    @Test
    void ShouldReturnLongestPath() {
        //when
        int res = Node.longestPath(dummyNode);
        //then
        assertEquals(res, 4);
    }

    @Test
    void ShouldReturnTwoStructuresAreEqual(){
        //given
        Node dummyNode2 = createStructure();
        //when
        boolean res = Node.structureEquals(dummyNode, dummyNode2);
        //then
        assertTrue(res);
    }
}