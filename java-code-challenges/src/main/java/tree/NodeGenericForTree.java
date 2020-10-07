package utilities;

public class NodeGeneric <T> {

    private T value;
    private NodeGeneric<T> behindInLine;
    private NodeGeneric<T> frontInLine;

    public void Node (T value){
        this.value = value;
        this.behindInLine = null;
        this.frontInLine = null;

    }
    public NodeGeneric<T> getFrontInLine() {
        return frontInLine;
    }
    public void setFrontInLine(NodeGeneric<T> frontInLine) {
        this.frontInLine = frontInLine;
    }
    public NodeGeneric<T> getBehindInLine() {
        return behindInLine;
    }
    public void setBehindInLine(NodeGeneric<T> behindInLine) {
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
