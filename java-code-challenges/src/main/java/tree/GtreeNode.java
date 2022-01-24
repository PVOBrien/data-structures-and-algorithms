package tree;

public class GtreeNode<T> {

    T value;
    GtreeNode<T> left;
    GtreeNode<T> right;

    public GtreeNode() { this.value = null; }
    public GtreeNode(T value) { this.value = value; }
    
    public T getValue() { return value; }
    public void setValue(T value) { this.value = value; }

    public GtreeNode getLeft() { return left; }
    public void setLeft(GtreeNode left) { this.left = left; }

    public GtreeNode getRight() { return right; }
    public void setRight(GtreeNode right) { this.right = right; }

    @Override
    public String toString() {
        return "GtreeNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
