package tree;

public class NodeInt {

    private int value;
    private NodeInt left;
    private NodeInt right;

    public NodeInt(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeInt getLeft() {return left;}
    public void setLeft(NodeInt left) {
        this.left = left;
    }

    public NodeInt getRight() {return right;}
    public void setRight(NodeInt right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Value is: " + value;
    }
}
