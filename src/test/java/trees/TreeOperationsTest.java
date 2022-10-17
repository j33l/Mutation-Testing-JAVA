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

    // @Test
    // public void bfsTest() {
    //     TreeOperations treeOperations = new TreeOperations();

    //     // creating a binary tree
    //     /*
    //            0
    //           / \
    //          1   2
    //         / \ / \
    //        3  4 5  6
    //     */
    //     Node root = new Node(0);
    //     root.left =  new Node(1);
    //     root.right =  new Node(2);
    //     root.left.left =  new Node(3);
    //     root.left.right =  new Node(4);
    //     root.right.left =  new Node(5);
    //     root.right.right =  new Node(66);

    //     assertEquals([0, 1, 2, 3, 4, 5, 66], treeOperations.bfs(root));
    // }
}
