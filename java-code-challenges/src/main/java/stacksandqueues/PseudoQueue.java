package stacksandqueues;

public class PseudoQueue {
    private Stack currentStack = new Stack();
    private Stack tempStack = new Stack();

    private Stack getCurrentStack() {
        return currentStack;
    }

    private void setCurrentStack(Stack currentStack) {
        this.currentStack = currentStack;
    }

    private Stack getTempStack() {
        return tempStack;
    }

    private void setTempStack(Stack tempStack) {
        this.tempStack = tempStack;
    }

// ===== METHODS =====

    public int dequeue() throws Exception {
        try {
            if (currentStack.front != null) {
                Node thisNode = currentStack.front;
                while (thisNode != null) {
                    tempStack.push(currentStack.pop());
                    thisNode = thisNode.getBackOrBottom();
                }
                currentStack = tempStack;
            }
            return currentStack.pop();
        } catch (NullPointerException npe) {
            throw new NullPointerException();
        }
    }

    public void enqueue(int value) {
        if (currentStack.front != null) {
            Node thisNode = currentStack.front;
            while (thisNode != null) {
                tempStack.push(currentStack.pop());
                thisNode = thisNode.getBackOrBottom();
            }
            currentStack = tempStack;
        }
        currentStack.push(value);
    }

    public String toString() { // attribution to David Dicken for the recursive.
        if (currentStack.front == null) {
            return "NULL";
        }
        return toString(currentStack.front);
    }

    private String toString(Node currentNode) {
        if (currentNode.getBackOrBottom() == null) {
            return String.format("%d -> NULL", currentNode.getValue());
        }
        return String.format("%d -> ", currentNode.getValue()) + toString(currentNode.getBackOrBottom());
    }

}
