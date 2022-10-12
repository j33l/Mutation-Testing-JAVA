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
    public static ArrayList bfs(final Node root)
    {
        if (root == null) {
            return new ArrayList();
        }

        ArrayList<Node> nodes = new ArrayList<Node>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove(0);

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }

        return nodes;
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
        Node root = new Node(0);
        root.left =  new Node(1);
        root.right =  new Node(2);
        root.left.left =  new Node(3);
        root.left.right =  new Node(4);
        root.right.left =  new Node(5);
        root.right.right =  new Node(6);

        System.out.println("Breadth-first search: ");
        TreeOperations.bfs(root);

    }

}

class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
  }
}
