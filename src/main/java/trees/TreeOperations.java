package trees;

import java.util.ArrayList; // import the ArrayList class


// import trees.Node; // importing user defined Node class implemetation
class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

public class TreeOperations {
    
    // Breath-first search (A.K.A. Level-Order Traversal)
    // NOTE: I am using the Node implementation from `src/main/java/trees/Node.java` file, Assuming that Node.left is parent node and Node.right is child node.
    public static <A> ArrayList<A> bfs(final Node<A> root)
    {
        if (root == null) {
            return;
        }

        ArrayList<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

    public static void main(String[] args)
    {
        TreeOperations treeOperations = new TreeOperations();

        // creating a binary tree
        /*
               0
              / \
             1   2
            / \ / \
           3  4 5  6
        */
        Node root = Node<Number>(0);
        root.left =  Node<Number>(1);
        root.right =  Node<Number>(2);
        root.left.left =  Node<Number>(3);
        root.left.right =  Node<Number>(4);
        root.right.left =  Node<Number>(5);
        root.right.right =  Node<Number>(6);

        System.out.println("Breadth-first search (A.K.A. Level-Order Traversal): ");
        treeOperations.bfs(root);

    }

}
