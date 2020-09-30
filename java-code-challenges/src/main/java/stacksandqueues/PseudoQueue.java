package stacksandqueues;

public class PseudoQueue {
    private Stack enqueueStack = new Stack();
    private Stack dequeueStack = new Stack();

// ===== METHODS =====

    public int dequeue() throws Exception {
        try {
            if (dequeueStack.front == null) {
                Stack thisStack = enqueueStack;
                while (thisStack.front != null) {
                    dequeueStack.push(thisStack.pop());
                }
            }
            return dequeueStack.pop();
        } catch (NullPointerException npe) {
            throw new NullPointerException();
        }
    }

    public void enqueue(int value) {
        if (enqueueStack.front == null && !dequeueStack.isEmpty()) {
            Node thisNode = dequeueStack.front;
            while (thisNode == null) {
                enqueueStack.push(dequeueStack.pop());
                thisNode = thisNode.getBackOrBottom();
            }
        }
        enqueueStack.push(value);
    }

    public String toString() { // attribution to David Dicken for the recursive.
        if (dequeueStack.front == null && enqueueStack.front == null) {
                return "NULL";
            }
        if (enqueueStack.isEmpty()) {
            return toString(dequeueStack.front);
        } else {
            return toString(enqueueStack.front);
        }
    }

    private String toString(Node currentNode) {
        if (currentNode.getBackOrBottom() == null) {
            return String.format("%d -> NULL", currentNode.getValue());
        }
        return String.format("%d -> ", currentNode.getValue()) + toString(currentNode.getBackOrBottom());
    }
}
