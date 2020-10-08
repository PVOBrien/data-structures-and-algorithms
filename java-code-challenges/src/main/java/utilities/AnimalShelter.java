package utilities;

public class AnimalShelter {

    private NodeQueueGenericNew<String> front;
    private NodeQueueGenericNew<String> back;

    public AnimalShelter(){
        this.front = null;
        this.back = null;
    }

    public void enqueue(String animal) {
        NodeQueueGenericNew<String> newNode = new NodeQueueGenericNew<>();
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
            NodeQueueGenericNew<String> thisNode = front;
            while (thisNode != null) {
                if (thisNode.getValue().equals(type)) {
                    if (thisNode.getFrontInLine() == null && thisNode.getBehindInLine() == null) {
                        front = thisNode.getBehindInLine();
                        thisNode.setBehindInLine(null);
                        thisNode.setFrontInLine(null);
                        return thisNode.getValue();
                    }
                    if (thisNode.getFrontInLine() == null) {
                        front = thisNode.getBehindInLine();
                        front.setFrontInLine(null);
                        thisNode.setFrontInLine(null);
                        return thisNode.getValue();
                    } else if (thisNode.getBehindInLine() == null) {
                        back = thisNode.getFrontInLine();
                        back.setBehindInLine(null);
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
        return "null; no nothing here.";
    }

    public String dequeue() {
        if (front == null){
            return "we don't have any animals for you!";
        }
        String anAnimal = this.front.getValue();
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
