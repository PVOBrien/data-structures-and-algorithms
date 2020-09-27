package stacksandqueues;

public class Stack {

    Node front = null; // this implies that a stack *always* has a front null (even if it is null).

    @Override
    public String toString() {
        return "Stack{" +
                "front=" + this.front +
                '}';
    }

    public void push(int newValue){
        Node newNode = new Node(newValue);
//        System.out.println(newNode);
        if (front != null) {
            newNode.backOrBottom = newNode;
        }
        front = newNode;
//        System.out.println(this);
    }

    public int pop() {
        int valueToReturn = front.value;
        Node oldFront = front;
        front = front.backOrBottom;
        oldFront.backOrBottom = null;
        return valueToReturn;
    }

    public int peek() {
        return this.front.value;
    }

    public boolean isEmpty(){
        return front == null;
    }
}
