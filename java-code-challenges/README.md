# Table of Contents

## Reverse an Array - 2020-09-14

Objective: To take an array as an argument and - without using built-in methods - return an array with the element in reversed order.

#### Challenge
No use of built-in methods to accomplish the objective.

#### Approach & Efficiency
<!-- Not Applicable for first challenge -->

#### Solution
<!-- Not Applicable for first challenge -->

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



=====

[x] Read all of the following instructions carefully. Name things exactly as described.
[x] Do all your work in a public repository called data-structures-and-algorithms.
[x] Create a new branch in your repo called array-reverse.
[x] Your top-level readme should contain a “Table of Contents” navigation to all of your challenges and implementations so far. (Don’t forget to update it!)
[x] This assignment should be completed within the _challenges_ subdirectory of the repository (called mine java-code-challenges, will amend if necessary)
[x] On your branch, create: a file called ArrayReverse.java
[x] Include any language-specific configuration files required for this challenge to become an individual component, module, library, etc. (gradle / gradlew in place)

Feature Task
[x] Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.

[ ] Copy your photo into /assets (not necessary for assignment)
[ ] Give the image file the same name as the working branch (not necessary for assignment)
[ ] Embed the image in your README.md documentation (not necessary for assignment)
[x] Create a pull request from your branch to your _master_ branch
