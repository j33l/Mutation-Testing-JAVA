package trees;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Test;


public class TreeOperationsTest {
    @Test
    public void bogusTest() {
        // illustrates how to write a test
        // assertEquals(expected, expression_being_tested)
        assertEquals(2, 1 + 1);
    }

    @Test
    public void bfsTest() {
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
                
        ArrayList<Integer> BFSResult = TreeOperations.bfs(A);        
        ArrayList<Integer> BFSExpected = new ArrayList<Integer>();
        BFSExpected.add(0);
        BFSExpected.add(1);
        BFSExpected.add(2);
        BFSExpected.add(3);
        BFSExpected.add(4);
        BFSExpected.add(5);
        BFSExpected.add(6);

        assertEquals(BFSExpected, BFSResult);
    }
}
