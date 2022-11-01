package trees; // creating package named `trees`

public class Node<A> {
    public final A contents;
    public Node<A> left;
    public Node<A> right;

    public Node(final A contents,
                Node<A> left,
                Node<A> right) {
        this.contents = contents;
        this.left = left;
        this.right = right;
    }
}
