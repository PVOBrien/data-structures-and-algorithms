# Table of Contents

## [Array Reverse](/java-code-challenges/array_reverse.md)

## Array Shift - 2020-09-15

Objective: To take an array and insert a new value into the middle of it.

#### Challenge
No use of built-in methods to accomplish the objective.

#### Approach & Efficiency
Time: O(n)
Space O(n)

#### Solution

Take in the parameters of the array (of integers) and the new value (an integer). Find the middle of the old array, create a new array the size of the old array + 1, then have a loop the length of the new array, and at the middle of the array, insert the new integer, then continue the loop. The old array count is controlled by a seperate integer counter that doesn't increment when the additional value is entered.

## Array Binary Search

Objective: take in 2 args (a sorted array and its search key), and return the index of the array's element equal to the search key or -1 if the element doesn't exist.

#### Challenge

No use of built-in methods, and the search algorithm should be a binary search.

#### Approach & Efficiency

Time: O(1)
Space: O(n)

#### Solution

![Whiteboard](https://github.com/PVOBrien/data-structures-and-algorithms/blob/array-shift/java-code-challenges/src/main/resources/Whiteboard%20-%20Code%20Challenge%2002.png)

## Binary Search

Objective: Create a binary search that looks over a passed sorted array for a certain value and return that value's index position.

#### Challenge
No use of built-in methods to accomplish the objective.

#### Approach & Efficiency

Time: O(log n)
Space: O(log n)

![Code Challenge 03](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/Code%20Challenge%2003%20Whiteboard.png)


## Single Linked List
  Create a class which has a that starts with a value and is linked to a following value and so forth, can inform a user if a value exists in the list, and return a string of all values with the list.
  With thanks to Meghan Domeck, Jack Nelson, Michael Wohl for their contributions.

#### Challenge
  No use of built-in classes or functions.

#### Approach & Efficiency
  Time: O(n)
  Space O(1)

#### API

  Node() - creates the next node within the linkedlist.
  toString() - lists out all Nodes within a list.
  includes() - informs a user if a value is present within the linkedlist or not.
  insert() - inserts a new Node into the linkedlist.
  append() - adds new node at end of the linkedlist.
  insertBefore - inserts a new node before a passed value.
  insertAfter() - inserts a new node after a passed value.
  valueFromKth() - takes in an integer and returns the value found at that location kth places from the head.
  zip() - takes in two LinkedLists, and adds them together, one from one, then the other, until one runs out and then the other finishes.
        worked together with Garhett Morgan.



![Code Challenge 06 WhiteBoard](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/401%20Challenge%2006%20Whiteboard.png)

![Code Challenge kth from end](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/401-06%20Whiteboard%20kthfromlist.png)

## Zip()
### Challenge Description
- Pass in two linkedlists, and create a new linkedlist (or mutate one of the two) so that it takes one, then the other, and moves from head to tail until all are "zipped" up. Use as few other methods as possible.

### Approach & Efficiency
- Time O(n) (have to iterate through everything)
- SpaceO(2n) - create something that is the size of both of them, but mutates the first LinkedList passed in.

### Solution

![Code Challenge zip](https://github.com/PVOBrien/data-structures-and-algorithms/blob/ll-zip/java-code-challenges/src/main/resources/llZipChallengeWB.png)

## Animal Shelter

### Challenge Description
Create an Animal Shelter with cats and dogs and with a passed argument of cat or dog (or none) returns the first of either (or no preference, the one that's been in the longest)

### Approach & Efficiency

Time O(1)
Space O(n)

### Solution

A double-linked list that allows us to pull from front or back, rewire the two adjacent nodes together, and return the value. Also, met stretch goal of returning the animal in the longest if no preference given.

### Whiteboard

![Today's Whiteboard](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/Animal%20Shelter%20Whiteboard.png?raw=true)

## MultiBracketValidation

### Challenge Description

Take in a string of open and close brackets, and returns true if all brackets are properly paired, and false otherwise.

### Approach & Efficiency

Time O(n) // I really want to know if my solution is this, or longer.
Space O(1)

### Solution

Loop over the string, checking each char that is a bracket if the next type of bracket is either another of it's open bracket type, or close, otherwise it fails. If it finds a proper closing bracket, it replaces that char with a blank " ", and proceeds until it finds something that makes it false, or returns true.

### Whiteboard

![MBV Whiteboard](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/Bracket%20Balance%20Challenge%20Whiteboard.png)

# Trees
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

# ~~K-ary Fizzbuzz Tree function~~ Corrected Kary FizzBuzz Tree
   Make a function that swaps out any numbers divisible by 3 with "Fizz", 5 with "Buzz", and if it is divisble by both 3 and 5 with "FizzBuzz". In all other cases not divisible by 3 and/or 5, turn the number into a String.
   Return a __new tree__. NOTE: This is now a kary tree, not a binary tree. It is also using entirely generic classes of nodes and the kary binary tree.

## Challenge
- The strings of the new tree are based on the values from the old tree.
- Take a tree of ints and create a new tree of strings. (We ended up parsing strings as ints to keep it simple.)

## Approach and Efficiency
- Space O(1)
- Time O(n)

## Whiteboard

![thewhiteboard](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/Code%20Challenge%2018%20Whiteboard%20FizzBuzz%20K%20ary%20Tree.png?raw=true)

## Additional Details
  This code was covered fully in CF Java 401d8. As such, I was able to address other details I'd been meaning to. Namely the @Before annotation (and slowly refactoring other data structures to be generic). I have a grasp on what the @Before annotation does (runs code before), but in our current situation is only slightly more helpful than helper functions in the testing environment, useful for spooling up trees, queues, and the like.
  But in the future, @Before / @BeforeClass - now in JUnit5 to become @BeforeEach / @BeforeAll, respectively - they will be useful to turn things on, or spool up files or other "pre" work, and then @After / @AfterEach and @AfterClass / @AfterAll can close them down. That will become very useful to save lines.
