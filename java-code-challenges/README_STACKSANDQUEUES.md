# Stacks and Queues
Build stacks and queues, and relevant methods to make them useful.

## Challenge
Create the node, stack, and queue classes from scratch, with as little outside function/method calls as possible.

## Approach & Efficiency
all functions of both the stack and queue methods (that we were tasked with creaing) are Time O(1) and Space O(1). 

## APIs

### Stack

.push(int value) = Takes in a value, and either creates a new stack, or pushes the value to the top of the stack.
.pop() = returns the value of the top node, and removes that top node from the stack.
.peek() = returns the value of the top node. Does not remove the top node from the stack.
.isEmpty() = returns true if the stack is empty, false if stack has values (implying at least 1 node) in it.

### Queue

.enqueue(int value) = if there is no Queue, adds a node that acts as the initial front and back. If there is a queue already present, the current node's back is pointed to it, and the new value then become the new back.
.dequeue() = returns the value of the front of the queue, and makes the front's "back" queue the new, then it's back node is turned to null to allow for garbage collection.
.peek() = returns the value of the front node. Does not remove the front node from the queue.
.isEmpty() = returns true if the queue is empty, false if queue has values (implying at least 1 node) in it.

### PseudoQueue
- uses two stacks to create a faux queue. All methods besides those mentioned below are private.

Efficiency:
Time O(n)
Space O(n)

.enqueue(value) - takes in passed value, and creates a new PseudoQueue, or "slinkies" between the two stack to create the verisimilitude of a queue.
.dequeue() - pops off the "front" node's value (by slinkying and then returning the value).
.toString() - a recursive toString method.

![the board for pseudoqueue](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/PseudoQueue%20Challenge%20Whiteboard.png)

