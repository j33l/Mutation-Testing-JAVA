package trees;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Test;


public class TreeOperationsTest {
    // creating a binary tree
    /*
           0
          / \
         1   2
        / \ / \
       3  4 5  6
    */
    Node<Integer> G = new Node<Integer>(6, null, null);
    Node<Integer> F = new Node<Integer>(5, null, null);
    Node<Integer> E = new Node<Integer>(4, null, null);
    Node<Integer> D = new Node<Integer>(3, null, null);
    Node<Integer> C = new Node<Integer>(2, F, G);
    Node<Integer> B = new Node<Integer>(1, D, E);
    Node<Integer> A = new Node<Integer>(0, B, C);

    /*
    @Test
    public void bogusTest() {
        // illustrates how to write a test
        // assertEquals(expected, expression_being_tested)
        assertEquals(2, 1 + 1);
    }
    */

    @Test
    public void BFSTest() {
        ArrayList<Integer> result = TreeOperations.bfs(A);        
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);

        assertEquals(expected, result); // algo test

        assertEquals(TreeOperations.bfs(B), TreeOperations.bfs(B)); // Mutation test
        assertEquals(TreeOperations.bfs(C), TreeOperations.bfs(C)); // Mutation test
    }

    @Test
    public void PreOrderTest() {
        ArrayList<Integer> result = TreeOperations.preorder(A);        
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(1);
        expected.add(3);
        expected.add(4);
        expected.add(2);
        expected.add(5);
        expected.add(6);

        assertEquals(expected, result);

        assertEquals(TreeOperations.bfs(B), TreeOperations.bfs(B)); // Mutation test
        assertEquals(TreeOperations.bfs(C), TreeOperations.bfs(C)); // Mutation test
    }

    @Test
    public void MaxDepthTest() {
        int result = TreeOperations.maxDepth(A);        
        int expected = 3;

        assertEquals(expected, result);

        assertEquals(2, TreeOperations.maxDepth(B));
        assertEquals(1, TreeOperations.maxDepth(D));
    }

    // automated testing
    // generate a tree with n nodes
    public static Node<Integer> generateTree(int n) {
        if (n == 0) {
            return null;
        }

        return new Node<Integer>(n, generateTree(n - 1), generateTree(n - 2));
    }

    // tree visuliaztion
    public static void printTree(Node<Integer> root) {
        if (root == null) {
            return;
        }

        System.out.println(root.contents);
        printTree(root.left);
        printTree(root.right);
    }

    @Test
    public void NodeCountTest() {
        int numberOfNodes = 10; //(int)(Math.random() * 50 + 1);
        Node<Integer> root = generateTree(numberOfNodes);

        printTree(root);

        // assertEquals(numberOfNodes, TreeOperations.nodeCount(root));

        // assertEquals(3, TreeOperations.nodeCount(B));
        // assertEquals(1, TreeOperations.nodeCount(D));
    }

}
