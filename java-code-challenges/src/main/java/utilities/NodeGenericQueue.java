package utilities;

public class NodeGenericQueue {

    NodeGeneric<String> front;
    NodeGeneric<String> back;

    public NodeGenericQueue(){
        this.front = null;
        this.back = null;
    }

    public void enqueue(String animal) {
        NodeGeneric<String> newNode = new NodeGeneric<>();
        newNode.setValue(animal);

        if (front == null) {
            front = newNode;
        } else {
            newNode.setFrontInLine(back);
            back.setBehindInLine(newNode);
        }
        this.back = newNode;
    }

    public String dequeue(String type) {
        if (type.equals("cat") || type.equals("dog")) {
            NodeGeneric<String> thisNode = front;
            while (thisNode != null) {
                if (thisNode.getValue().equals(type)) {
                    if (thisNode.getBehindInLine() == null && thisNode.getFrontInLine() == null) {
                        front = null;
                        back = null;
                        thisNode.setBehindInLine(null);
                        thisNode.setFrontInLine(null);
                        return thisNode.getValue();
                    }
                    if (thisNode.getFrontInLine() == null) {
                        front  = thisNode.getBehindInLine();
                        thisNode.setFrontInLine(null);
                        return thisNode.getValue();
                    } else if (thisNode.getBehindInLine() == null) {
                        back = thisNode.getFrontInLine();
                        return thisNode.getValue();
                    } else {
                        thisNode.getBehindInLine().setFrontInLine(thisNode.getFrontInLine());
                        thisNode.getFrontInLine().setBehindInLine(thisNode.getBehindInLine());
                        return thisNode.getValue();
                    }
                }
                thisNode = thisNode.getBehindInLine();
            }
        }
        return null;
    }


    @Override
    public String toString(){
        if(front == null){
            return "NULL";
        }
        return toString(front);
    }
    //------------ helper ----------------
    private String toString(NodeGeneric<String> currentNode){

        if (currentNode.getBehindInLine() == null) {
            return currentNode.getValue() + " -> NULL";
        }
        return currentNode.getValue() + " -> " + toString(currentNode.getBehindInLine());
    }
}
