package tree;

import stacksandqueues.Queue;
import utilities.NodeGeneric;

public class QueueOfBinaryNodes<T> {

    public NodeGenericForTree<T> getFront() {
        return front;
    }

    public void setFront(NodeGenericForTree<T> front) {
        this.front = front;
    }

    public NodeGenericForTree<T> getBack() {
        return back;
    }

    public void setBack(NodeGenericForTree<T> back) {
        this.back = back;
    }

    private NodeGenericForTree<T> front;
    private NodeGenericForTree<T> back;

    public QueueOfBinaryNodes(){
        this.front = null;
        this.back = null;
    }

    public void enqueue(T node) {
        NodeGenericForTree<T> newNode = new NodeGenericForTree<>();
        newNode.setValue(node);

        if (front == null) {
            front = newNode;
        } else {
            newNode.setFrontInLine(back);
            back.setBehindInLine(newNode);
        }
        this.back = newNode;
    }

//    public T dequeue() {
////        if (type.equals("cat") || type.equals("dog")) {
////            NodeGenericForTree<Node> thisNode = front;
//            while (this.front != null) {
////                if (node.getValue().equals(type)) {
//                    if (this.front.getFrontInLine() == null && node.getBehindInLine() == null) {
//                        this.front = node.setBehindInLine();
//                        node.setBehindInLine(null);
//                        node.setFrontInLine(null);
//                        return node;
//                    }
//                    if (thisNode.getFrontInLine() == null) {
//                        front = thisNode.getBehindInLine();
//                        front.setFrontInLine(null);
//                        thisNode.setFrontInLine(null);
//                        return thisNode.getValue();
//                    } else if (thisNode.getBehindInLine() == null) {
//                        back = thisNode.getFrontInLine();
//                        back.setBehindInLine(null);
//                        return thisNode.getValue();
//                    } else {
//                        thisNode.getBehindInLine().setFrontInLine(thisNode.getFrontInLine());
//                        thisNode.getFrontInLine().setBehindInLine(thisNode.getBehindInLine());
//                        return thisNode.getValue();
//                    }
//                }
//                thisNode = thisNode.getBehindInLine();
//            }
//        }
//        return "null; no nothing here.";
//    }

    public T dequeue() {
        if (this.front == null){
            return null;
        }
        if (front.getBehindInLine() == null) {
            T toReturn = front.getValue();
            front = null;
            back = null;
            return toReturn;
        }
        T toReturn = front.getValue();
        front.getBehindInLine().setFrontInLine(null);
        front = front.getBehindInLine();

        return toReturn;
    }

    @Override
    public String toString(){
        if(front == null){
            return "NULL";
        }
        return toString(front);
    }
    //------------ helper ----------------
    private String toString(NodeGenericForTree currentNode){

        if (currentNode.getBehindInLine() == null) {
            return currentNode.getValue() + " -> Back";
        }
        return currentNode.getValue() + " -> " + toString(currentNode.getBehindInLine());
    }
}
