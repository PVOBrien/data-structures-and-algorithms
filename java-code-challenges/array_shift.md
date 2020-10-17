## Array Shift

Objective: To take an array and insert a new value into the middle of it.

#### Challenge
No use of built-in methods to accomplish the objective.

#### Approach & Efficiency
Time: O(n)
Space O(n)

#### Solution

Take in the parameters of the array (of integers) and the new value (an integer). Find the middle of the old array, create a new array the size of the old array + 1, then have a loop the length of the new array, and at the middle of the array, insert the new integer, then continue the loop. The old array count is controlled by a seperate integer counter that doesn't increment when the additional value is entered.
