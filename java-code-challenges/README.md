# Table of Contents

## Reverse an Array - 2020-09-14

Objective: To take an array as an argument and - without using built-in methods - return an array with the element in reversed order.

#### Challenge
No use of built-in methods to accomplish the objective.

#### Approach & Efficiency
Time: O(n)
Space: O(1)

#### Solution
The method takes in the array, initializes a new array and then in a for loop takes the last index of the original array and puts it in the first index position of the new array, and then moves backwards through the passed array (original.length - i -1) until it fills the entirety of it's length into the new array. Then it returns that new array, all reversed!

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

Objective: take in 2 args (a sorted array and its search key), and return the index of the array's element euqal to the search key or -1 if the element doesn't exist.

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
-  Node() - creates the next node within the linkedlist.
-  toString() - lists out all Nodes within a list. \n
-  includes() - informs a user if a value is present within the linkedlist or not.
-  insert() - inserts a new Node into the linkedlist.
-  append() - adds new node at end of the linkedlist.
-  insertBefore - inserts a new node before a passed value.
-  insertAfter() - inserts a new node after a passed value.

![Code Challenge 06 WhiteBoard](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/401%20Challenge%2006%20Whiteboard.png)
