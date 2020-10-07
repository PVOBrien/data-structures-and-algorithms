package tree;

public class NodeGenericForTree<T> {

    private T value;
    private NodeGenericForTree<T> behindInLine;
    private NodeGenericForTree<T> frontInLine;

    public void Node (T value){
        this.value = value;
        this.behindInLine = null;
        this.frontInLine = null;

    }
    public NodeGenericForTree<T> getFrontInLine() {
        return frontInLine;
    }
    public void setFrontInLine(NodeGenericForTree<T> frontInLine) {
        this.frontInLine = frontInLine;
    }
    public NodeGenericForTree<T> getBehindInLine() {
        return behindInLine;
    }
    public void setBehindInLine(NodeGenericForTree<T> behindInLine) {
        this.behindInLine = behindInLine;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Value is: " + this.getValue();
    }
}
