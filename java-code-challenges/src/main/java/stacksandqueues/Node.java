package stacksandqueues;

public class Node {

    private int value;
    private Node backOrBottom;

    public Node(int value){
        this.value = value;
        this.backOrBottom = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getBackOrBottom() {
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
