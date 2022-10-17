package trees; // ERROR: Can not find main class

import java.util.ArrayList; // import the ArrayList class

public class TreeOperations {
    
    // Breath-first search (A.K.A. Level-Order Traversal)
    public static <A> ArrayList<A> bfs(final Node<A> root)
    {
        if (root == null) {
            return new ArrayList<A>();
        }

        ArrayList<Node<A>> orderedNodes = new ArrayList<Node<A>>();
        orderedNodes.add(root);
        
        ArrayList<A> result = new ArrayList<A>();

        while (!orderedNodes.isEmpty()) {

            Node<A> node = orderedNodes.remove(0);

            // System.out.print(" " + node.value);
            result.add(node.contents);

            if (node.left != null) {
                orderedNodes.add(node.left);
            }

            if (node.right != null) {
                orderedNodes.add(node.right);
            }
        }

        return result;
    }

    // using for development testing
    /*
    public static void main(String[] args)
    {
        // creating a binary tree
        /*
               0
              / \
             1   2
            / \ / \
           3  4 5  6
        */
        /*
        Node<Integer> G = new Node<Integer>(6, null, null);
        Node<Integer> F = new Node<Integer>(5, null, null);
        Node<Integer> E = new Node<Integer>(4, null, null);
        Node<Integer> D = new Node<Integer>(3, null, null);
        Node<Integer> C = new Node<Integer>(2, F, G);
        Node<Integer> B = new Node<Integer>(1, D, E);
        Node<Integer> A = new Node<Integer>(0, B, C);
        

        System.out.println("Breadth-first search: ");
        
        ArrayList<Integer> BFSResult = TreeOperations.bfs(A);
        System.out.println(BFSResult);
        

    }
    */
}
