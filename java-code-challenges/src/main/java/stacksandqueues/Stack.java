package stacksandqueues;

public class Stack {

    public Node front = null; // this implies that a stack *always* has a front null (even if it is null).

    @Override
    public String toString() {

        Node current = front;
        StringBuilder message = new StringBuilder();

        if (current == null) {
            return ("Nothing here");
        }

        if (current.backOrBottom != null) {
            while (current != null) {
                message.append(String.format("%d -> ", current.value));
                current = current.backOrBottom;
            }
        }
        return message + "Null";
    }

    public void push(int newValue){
        Node newNode = new Node(newValue);
        if (front != null) {
            newNode.backOrBottom = front;
        }
        front = newNode;
    }

    public int pop() {
        try {
            int valueToReturn = front.value;
            Node oldFront = front;
            front = front.backOrBottom;
            oldFront.backOrBottom = null;
            return valueToReturn;
        } catch (NullPointerException npe) {
//            npe.printStackTrace();
            throw new NullPointerException();
        }
    }

    public int peek() {
        try {
            return this.front.value;
        } catch (NullPointerException npe) {
//            npe.printStackTrace();
            System.out.println("Nothing to peek.");
            throw new NullPointerException();
        }
    }

    public boolean isEmpty(){
        return front == null;
    }
}
