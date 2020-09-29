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

        if (current.getBackOrBottom() != null) {
            while (current != null) {
                message.append(String.format("%d -> ", current.getValue()));
                current = current.getBackOrBottom();
            }
        }
        return message + "Null";
    }

    public void push(int newValue){
        Node newNode = new Node(newValue);
        if (front != null) {
            newNode.setBackOrBottom(front);
        }
        front = newNode;
    }

    public int pop() {
        try {
            int valueToReturn = front.getValue();
            Node oldFront = front;
            front = front.getBackOrBottom();
            oldFront.setBackOrBottom(null);
            return valueToReturn;
        } catch (NullPointerException npe) {
//            npe.printStackTrace();
            System.out.println("Nothing to pop in the stack.");
            throw new NullPointerException();
        }
    }

    public int peek() {
        try {
            return this.front.getValue();
        } catch (NullPointerException npe) {
//            npe.printStackTrace();
            System.out.println("Nothing to peek in the stack.");
            throw new NullPointerException();
        }
    }

    public boolean isEmpty(){
        return front == null;
    }
}
