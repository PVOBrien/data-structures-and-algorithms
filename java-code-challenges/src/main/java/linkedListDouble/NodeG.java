package linkedListDouble;

public class NodeG<T> {

    private NodeG<T> next;
    private T value;

    public void NodeG (T value) { //
        this.next = null;
        this.value = value;
    }

    public NodeG<T> getNext() {return next;}
    public void setNext(NodeG<T> next) {
        this.next = next;
    }

    public T getValue() {return value;}
    public void setValue(T value) {
        this.value = value;
    }
}
