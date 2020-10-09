package utilities;

public class NodeQueueGenericNew<T> {

    private T value;
    private NodeQueueGenericNew<T> behindInLine;
    private NodeQueueGenericNew<T> frontInLine;

    public void Node (T value){
        this.value = value;
        this.behindInLine = null;
        this.frontInLine = null;

    }
    public NodeQueueGenericNew<T> getFrontInLine() {
        return frontInLine;
    }
    public void setFrontInLine(NodeQueueGenericNew<T> frontInLine) {
        this.frontInLine = frontInLine;
    }
    public NodeQueueGenericNew<T> getBehindInLine() {
        return behindInLine;
    }
    public void setBehindInLine(NodeQueueGenericNew<T> behindInLine) {
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
