package stacksandqueues;

public class Queue {

    Node front;
    Node back;

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", back=" + back +
                '}';
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (front != null) {
            back.backOrBottom = newNode;
        } else {
            front = newNode;
        }
        back = newNode;
    }

    public int dequeue() {
        try {
            int valueToReturn = front.value;
            Node oldFront = front;
            front = front.backOrBottom;
            oldFront.backOrBottom = null;
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
        return front.value;
    }

    public boolean isEmpty() {
        return this.front == null;
    }
}
