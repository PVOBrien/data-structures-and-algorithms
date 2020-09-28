package stacksandqueues;

public class Node {

    int value;
    Node backOrBottom;

    public Node(int value){
        this.value = value;
        this.backOrBottom = null;
    }

    @Override
    public String toString() {
        return String.format("%d", this.value);
    }
}
