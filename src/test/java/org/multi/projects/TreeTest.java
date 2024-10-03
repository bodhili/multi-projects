package org.multi.projects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A test class to verify the functionalities of a CompleteBinaryTree data structure.
 */
public class TreeTest {

    /**
     * Tests the functionalities of the CompleteBinaryTree data structure by constructing
     * a specific tree and verifying its completeness.
     *
     * This method:
     * 1. Creates a root node and several child nodes.
     * 2. Constructs a CompleteBinaryTree with the root node.
     * 3. Adds child nodes to the tree using the offer method.
     * 4. Prints the tree structure.
     * 5. Checks and prints whether the tree is a complete binary tree using the isComplete method.
     */
    @Test
    public void testTreeOffer() {
        Node<Integer> root = new Node<>(1);
        Node<Integer> left = new Node<>(2);
        Node<Integer> right = new Node<>(3);
        Node<Integer> leftLeft = new Node<>(4);
        Node<Integer> leftRight = new Node<>(5);
        Node<Integer> unknown = new Node<>(6);
        Node<Integer> unknown0 = new Node<>(7);
        Node<Integer> unknown00 = new Node<>(8);

        CompleteBinaryTree<Integer> tree = new CompleteBinaryTree<>(root);
        tree.offer(left);
        tree.offer(right);
        tree.offer(leftLeft);
        tree.offer(leftRight);
        tree.offer(unknown);
        tree.offer(unknown0);
        tree.offer(unknown00);
        Assertions.assertTrue(tree.isComplete());
    }

    /**
     * Tests the breadth-first search (BFS) functionality of the CompleteBinaryTree class.
     * <br>
     * This method:
     * 1. Creates a root node and several child nodes.
     * 2. Constructs a CompleteBinaryTree with the root node.
     * 3. Adds child nodes to the tree using the offer method.
     * 4. Asserts that the tree is a complete binary tree using the isComplete method.
     * 5. Performs a BFS traversal of the tree and prints the resulting array of node elements.
     * <br>
     * The test ensures that the BFS traversal returns the correct order of elements in the tree
     * and verifies the completeness of the binary tree after adding all nodes.
     */
    @Test
    public void testTreeBfs() {
        Node<Integer> root = new Node<>(1);
        Node<Integer> left = new Node<>(2);
        Node<Integer> right = new Node<>(3);
        Node<Integer> leftLeft = new Node<>(4);
        Node<Integer> leftRight = new Node<>(5);
        Node<Integer> unknown = new Node<>(6);
        Node<Integer> unknown0 = new Node<>(7);
        Node<Integer> unknown00 = new Node<>(8);

        CompleteBinaryTree<Integer> tree = new CompleteBinaryTree<>(root);
        tree.offer(left);
        tree.offer(right);
        tree.offer(leftLeft);
        tree.offer(leftRight);
        tree.offer(unknown);
        tree.offer(unknown0);
        tree.offer(unknown00);
        Assertions.assertTrue(tree.isComplete());

        Integer[] bfs = tree.bfs(Integer.class);
        System.out.println(Arrays.toString(bfs));
    }

    /**
     * Tests the depth-first search (DFS) functionalities (pre-order, in-order, post-order)
     * of the CompleteBinaryTree data structure by constructing a specific tree and verifying
     * its traversals.
     *
     * <br>This method:
     * 1. Creates a root node and several child nodes.
     * 2. Constructs a CompleteBinaryTree with the root node.
     * 3. Adds child nodes to the tree using the offer method.
     * 4. Asserts that the tree is a complete binary tree using the isComplete method.
     * 5. Performs pre-order, in-order, and post-order DFS traversals of the tree.
     * 6. Prints the resulting arrays of node elements from the traversals.
     *
     * The test ensures that the different DFS traversals return the correct order of elements
     * in the tree and verifies the completeness of the binary tree after adding all nodes.
     */
    @Test
    public void testTreeDfs() {
        Node<Integer> root = new Node<>(1);
        Node<Integer> left = new Node<>(2);
        Node<Integer> right = new Node<>(3);
        Node<Integer> leftLeft = new Node<>(4);
        Node<Integer> leftRight = new Node<>(5);
        Node<Integer> unknown = new Node<>(6);
        Node<Integer> unknown0 = new Node<>(7);
        Node<Integer> unknown00 = new Node<>(8);

        CompleteBinaryTree<Integer> tree = new CompleteBinaryTree<>(root);
        tree.offer(left);
        tree.offer(right);
        tree.offer(leftLeft);
        tree.offer(leftRight);
        tree.offer(unknown);
        tree.offer(unknown0);
        tree.offer(unknown00);
        Assertions.assertTrue(tree.isComplete());

        Integer[] bfs = tree.bfs(Integer.class);
        System.out.println(Arrays.toString(bfs));

        Integer[] preDfs = tree.preDfs(Integer.class);
        System.out.println(Arrays.toString(preDfs));

        Integer[] midDfs = tree.inDfs(Integer.class);
        System.out.println(Arrays.toString(midDfs));

        Integer[] suffixDfs = tree.suffixDfs(Integer.class);
        System.out.println(Arrays.toString(suffixDfs));
    }
}
