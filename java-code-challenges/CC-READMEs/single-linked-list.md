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
