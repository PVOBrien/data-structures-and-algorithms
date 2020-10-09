package utilities;

public class NodeGenericForQueue<T> {

    private T value;
    private NodeGenericForQueue<T> behindInLine;
    private NodeGenericForQueue<T> frontInLine;

    public void Node (T value){
        this.value = value;
        this.behindInLine = null;
        this.frontInLine = null;

    }
    public NodeGenericForQueue<T> getFrontInLine() {
        return frontInLine;
    }
    public void setFrontInLine(NodeGenericForQueue<T> frontInLine) {
        this.frontInLine = frontInLine;
    }
    public NodeGenericForQueue<T> getBehindInLine() {
        return behindInLine;
    }
    public void setBehindInLine(NodeGenericForQueue<T> behindInLine) {
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
