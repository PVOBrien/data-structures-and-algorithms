package stacksandqueues;

public class Node {

//    Node frontOfLine;
    int value;
    Node backOrBottom;

    public Node(int value){
//        frontOfLine = null;
        this.value = value;
        this.backOrBottom = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", backOrBottom=" + backOrBottom +
//                ", frontOfLine=" + frontOfLine +
                '}';
    }
}
