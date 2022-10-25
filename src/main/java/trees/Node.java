package trees; // creating package named `trees`

import trees.TreePrinter.PrintableNode;

public class Node<A> implements TreePrinter.PrintableNode{
    public final A contents;
    public final Node<A> left;
    public final Node<A> right;

    public Node(final A contents,
                final Node<A> left,
                final Node<A> right) {
        this.contents = contents;
        this.left = left;
        this.right = right;
    }

    @Override
    public PrintableNode getLeft() {
        return this.left;
    }

    @Override
    public PrintableNode getRight() {
        return this.right;
    }

    @Override
    public String getText() {
        return this.contents.toString();
    }
}
