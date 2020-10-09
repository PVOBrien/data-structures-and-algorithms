package stacksandqueues;

public class Node<T> {

    private T value;
    private Node<T> backOrBottom;

    public Node(T value){
        this.value = value;
        this.backOrBottom = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getBackOrBottom() {
        return backOrBottom;
    }

    public void setBackOrBottom(Node backOrBottom) {
        this.backOrBottom = backOrBottom;
    }

    @Override
    public String toString() {
        return String.format("%d", this.value);
    }
}
