## Trees
 Have a tree and binary search tree (bst) class with a node that starts with null left and right Node slots.
 Both the tree and bst have preOrder, inOrder, and postOrder toString() methods (inherited from the tree class, to the bst)
 The tree can hold any values left or right, and the bst is structured such that higher values are stored right, lower left, and nodes can be inserted, accordingly slotting in at the right value.
 The bst has a contains method to locate a specific value.
 
## Challenge
 - Create the node with a left and right "next" value
 - Create a tree with a root and the ability to set left and right values, and print in pre, in, and post order recursive methods.
 - Create a bst that correctly slots in values to the left and right (higher and lower, respectively), and a contains() method.
 
## Approach and Efficiency
 - Space O(1)
 - Time O(h) -- O of the _height of the tree_.
 
## API

- Node(value) : creates a new node with a value as passed in, and two null Node markers for left and right.
- Tree() : is Superclass.
    - Constructor Tree() : instantiates an empty Tree with first Node as root.
    - addRightNode(Node, value) : creates a new Node with the passed in value and then assigns it as right Node to the passed in Node.
    - addLeftNode(Node, value) : identical to addRightNode, but to the left.
    ^^^ both addRightNode and addLeftNode are overloaded to also accept a Node instead of a value.
    - preOrder(Tree) : static method of Tree, that takes in a Tree,then recursively prints the current values node, then go left recursively, then right.
    - inOrder(Tree) : static method of Tree. Recursively travels the nodes to the left, prints the value of the node, then to the right.
    - postOrder(Tree) : static method of Tree. recursively travels left, then right, then prints the value of the node.
- BinarySearchTree : a child class of Tree().
    - add(value, Tree): takes in a value, and the Tree to add it to the Tree so that if it is less than the current node, it goes left (and if not right), and if it is higher than the upcoming node, slots in there and the previous node becomes its left (lower) tree node marker. To the right, does this also, but vice versa. (TODO: refactor so as to not have to include the tree explicitly).
    - contains(value, Node) : Returns a boolean True if the passed in value exists in the Tree (starting at the root), else False. Will be refactored at a later time so as to not have to explicitly pass in the root of the Tree.

# Find Maximum Value
  Return the maximum value stored in a given tree (that is assumed to be of integers).
 
# BreadthFirst Traversal
  Return an array of the values of a tree as they are encountered by level.

## Challenge
  Cannot use any built-in methods available to Java (only the ones coded by w/in the scope of this package).
  
## Approach and Efficiency
  Space O(1)
  Time O(n)
  
  Upon reaching a node, place the node into a queue. Then in the queue, you pop that node. You place that popped node's value into another array list, then place its left node into the queue, then the right node into the queue, and then the next node in the queue is popped off, and the process repeated until the queue is empty.

## Whiteboard

![Whiteboard for MaxBreadth](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/Code%20Challenge%2017%20-%20Breadth%20First%20Traversal.png?raw=true)
