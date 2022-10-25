package trees; // ERROR: Can not find main class

import java.io.PrintStream;
import java.util.ArrayList; // import the ArrayList class
import java.util.Currency;
import java.util.Random;

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

    public static <A> ArrayList<A> preorder(final Node<A> root)
    {
        if (root == null) {
            return new ArrayList<A>();
        }

        ArrayList<A> result = new ArrayList<A>();

        result.add(root.contents);

        result.addAll(preorder(root.left));
        result.addAll(preorder(root.right));

        return result;
    }

    public static <A> int maxDepth(final Node<A> root)
    {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    // calculate number of nodes in a tree
    public static <A> int nodeCount(final Node<A> root)
    {
        if (root == null) {
            return 0;
        }

        return 1 + nodeCount(root.left) + nodeCount(root.right);
    }




    // return array for n numbers
    public static ArrayList<Integer> generateArray(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            arr.add(i);
        }

        return arr;
    }

    // generate random tree with n nodes
    /*
    public static Node<Integer> generateTree(int n) {
        ArrayList<Integer> arr = generateArray(n);
        Node<Integer> head = null;
        Node<Integer> currentNode = null;

        while(arr.size() > 0) {
            int value = arr.remove(0);

            if (head == null) {
                head = new Node<Integer>(value, null, null);
                currentNode = head;
            } else {
                currentNode.right = new Node<Integer>(value, null, null);
                currentNode = currentNode.right;
            }
        }

        return head;
    }
    */

    // static ArrayList<Integer> arr = generateArray(7);

    // public static Node<Integer> generateTree() {
    //     if (arr.size() == 0) {
    //         return null;
    //     }

    //     return new Node<Integer>(arr.remove(0), generateTree(), generateTree());
    // }


    private static Random random = new Random();

    public static Node<Integer> binaryTreeGenerator(int n, int key){
        if (n == 0)
            return null;

        Node<Integer> root = new Node<Integer>(key, null, null);

        // Number of nodes in the left subtree (in [0, n-1])
        int leftN = random.nextInt(n);

        // Recursively build each subtree
        root.left = binaryTreeGenerator(leftN, key);
        root.right = binaryTreeGenerator(n - leftN - 1, key);

        return root;
    }



    // using for development testing
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
        Node<Integer> G = new Node<Integer>(6, null, null);
        Node<Integer> F = new Node<Integer>(5, null, null);
        Node<Integer> E = new Node<Integer>(4, null, null);
        Node<Integer> D = new Node<Integer>(3, null, null);
        Node<Integer> C = new Node<Integer>(2, F, G);
        Node<Integer> B = new Node<Integer>(1, D, E);
        Node<Integer> A = new Node<Integer>(0, B, C);
                
        ArrayList<Integer> BFSResult = TreeOperations.bfs(A);
        ArrayList<Integer> PreOrderResult = TreeOperations.preorder(A);
        
        System.out.println(BFSResult);
        System.out.println(PreOrderResult);
        System.out.println(TreeOperations.maxDepth(A));
        System.out.println(TreeOperations.nodeCount(A));

        System.out.println("\nTree -->\n");
        // TreePrinter.print();
        Node<Integer> n = TreeOperations.binaryTreeGenerator(5, 0);
        TreePrinter.print(n);
    }

}
