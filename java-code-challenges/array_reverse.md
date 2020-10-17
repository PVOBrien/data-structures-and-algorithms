## Reverse an Array - 2020-09-14

Objective: To take an array as an argument and - without using built-in methods - return an array with the element in reversed order.

#### Challenge
No use of built-in methods to accomplish the objective.

#### Approach & Efficiency
Time: O(n)
Space: O(1)

#### Solution
The method takes in the array, initializes a new array and then in a for loop takes the last index of the original array and puts it in the first index position of the new array, and then moves backwards through the passed array (original.length - i -1) until it fills the entirety of it's length into the new array. Then it returns that new array, all reversed!
