package stacksandqueues;

public class QueueGeneric {

    Node front;
    Node back;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (front != null) {
            back.setBackOrBottom(newNode);
        } else {
            front = newNode;
        }
        back = newNode;
    }

    public void enqueue(Node node) {
//        Node newNode = new Node(node.);
        if (front != null) {
            back.setBackOrBottom(node);
        } else {
            front = node;
        }
        back = node;
    }

    public int dequeue() {
        try {
            int valueToReturn = front.getValue();
            Node oldFront = front;
            front = front.getBackOrBottom();
            oldFront.setBackOrBottom(null);
            if (front == null) {
                back = null;
            }
            return valueToReturn;
        } catch (NullPointerException npe) {
//            npe.printStackTrace();
            System.out.println("Nothing to dequeue.");
            throw new NullPointerException();
        }
    }

    public Node dequeueNode() {
        try {
            Node valueToReturn = front;
            Node oldFront = front;
            front = front.getBackOrBottom();
            oldFront.setBackOrBottom(null);
            if (front == null) {
                back = null;
            }
            return valueToReturn;
        } catch (NullPointerException npe) {
//            npe.printStackTrace();
            System.out.println("Nothing to dequeue.");
            throw new NullPointerException();
        }
    }

    public int peek() {
        try {
            return front.getValue();
        } catch (NullPointerException npe) {
//            npe.printStackTrace();
            System.out.println("There's nothing to peek.");
            throw new NullPointerException();
        }
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", back=" + back +
                '}';
    }

}
