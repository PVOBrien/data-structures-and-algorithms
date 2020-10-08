package tree;

import utilities.NodeGenericForQueue;

public class GenericQueue<T> {

    private NodeGenericForQueue front;
    private NodeGenericForQueue back;

    public GenericQueue(){
        this.front = null;
        this.back = null;
    }

    public void enqueue(NodeGenericForQueue newValue) {
        NodeGenericForQueue<NodeGenericForQueue> newNode = new NodeGenericForQueue<>();
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
    private String toString(NodeGenericForQueue<String> currentNode){

        if (currentNode.getBehindInLine() == null) {
            return currentNode.getValue() + " -> Back";
        }
        return currentNode.getValue() + " -> " + toString(currentNode.getBehindInLine());
    }
}
