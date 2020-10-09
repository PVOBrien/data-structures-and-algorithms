package tree;

import utilities.NodeQueueGenericNew;

public class GenericQueue<T> {

    private NodeQueueGenericNew front;
    private NodeQueueGenericNew back;

    public GenericQueue(){
        this.front = null;
        this.back = null;
    }

    public void enqueue(NodeQueueGenericNew newValue) {
        NodeQueueGenericNew<NodeQueueGenericNew> newNode = new NodeQueueGenericNew<>();
        newNode.setValue(newValue);

        if (front == null) {
            front = newNode;
        } else {
            newNode.setFrontInLine(back);
            back.setBehindInLine(newNode);
        }
        this.back = newNode;
    }


    public Object dequeue() {
        if (front == null){
            return "we don't have any animals for you!";
        }
        Object anAnimal = this.front.getValue();
        front.setFrontInLine(null);
        front = this.front.getBehindInLine();
        return anAnimal;
    }

    @Override
    public String toString(){
        if(front == null){
            return "NULL";
        }
        return toString(front);
    }
    //------------ helper ----------------
    private String toString(NodeQueueGenericNew<String> currentNode){

        if (currentNode.getBehindInLine() == null) {
            return currentNode.getValue() + " -> Back";
        }
        return currentNode.getValue() + " -> " + toString(currentNode.getBehindInLine());
    }
}
