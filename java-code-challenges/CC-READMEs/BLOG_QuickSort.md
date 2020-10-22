# QuickSort

This was a doozy of a merge method. Our attempt at fully whiteboarding this was stymied repeatedly by not quite seeing what was happening, unless we stepped through the code, line by line, and even then, we were stumped. So we let it simmer for the better part of a day and... still couldn't quite get it. It works, but if we don't understand it, it's usefulness is lessened. So, to step through it slowly, below is the walk thru via MarkDown language, in order to save trees (by not wasting more paper) and perhaps electrons (as we constantly wipe a digital whiteboard)

```
  {42, 8, 4, 23, 16, 15}   // we pass in a (likely) unordered array, as well as the left (beginning) and right (end) index positions. Not their values, but the indexes. So 0 and 5 respectively.
//=========================//
 left = 0 < right = 5 YES  // and upon passing it into our method check if the left integer is less than the right. It is, so we step into our function...
 {42, 8, 4, 23, 16, 15}    // we take in the array, and the left and right. Nothing changed from the first pass in but now...
 Pivot = index[right] = 15 // we now find a pivot, which is the number at the index position of right. 15
 low = -1                  // low is established as left, which is 0, minus 1. So, -1
 i = 0; i < 5; i++         // and into a for loop, currently such that i is left (0), and the executing condition is if the index is less than the index position of right (which                              // is currently the last index position).
                           // There is an if statment that evaluates that if the value of index at i (so it's iterating up) is less than or equal to the pivot, it steps into a                                // code block.
if 42 <= 15   YES          // At the first point, there is so:
low = 0                    // the variable low increments up from -1 to 0 and...
{x42x, *8*, 4, 23, 16, 15} // a swap function takes place, between the indexes of...
{*8*, x42x, 4, 23, 16, 15} // i and the the value held at low (which is 0, currently).
                           // and then the for loop continues until the next number that is lower than the right number, which is 4 so... 
{8, x42x, *4*, 23, 16, 15} // the two swap, between the number that 
{8, *4*, x42x, 23, 16, 15} // is at index i, and the one at index of low.
// ==END OF FOR LOOP==     // There are no more numbers lower than 15, so...
{8, 4, x42x, 23, 16, *15*} // the indexes of low, which is 2, and right, 
{8, 4, *15*, 23, 16, x42x} // swap.
RETURN 2                   // And we have our return of 2, which in our quickSort function is the position now which...
//=========================// Sets of another quicksort (RECURSION!), passing in the array, the left value (which is still the original value of 0) and the position minus 1, so
// {8, 4, 15, 23, 16, 42}  // that is 1 at the moment. and the partitioning begins again, but it is moved 
                           // and the partitioning begins again, but it is moved so...
 pivot = 4                 // the pivot is now 4
 low = -1                  // we're still on the left side so low is still -1.
                           // and we go into the for loop...
                           // and it being a short loop because left is only one away from right...
{x8x, *4*, 15, 23, 16, 42} // the two swap.
{*4*, x8x, 15, 23, 16, 42} //
RETURN 1                   // and low + 1 is returned
                           // and it is recursed over again but...
left= 0 right = -1         // left is not less than right so...
                           // that recursion is complete, and we go back up the stack, on to the right side of the stack....
                           // and again...
left = 3 right = 5         // until we get to the place in the stack where there is the right side of the array to order.

                           // And this continues until the array is organized.
```
Believe it or not, this is in fact faster still than both sort search or merge sort! It's space is O(n), and its time is O(log n), so it's an even (most likely) faster sort method that can be used. 

This was a tough nut to understand; the psuedocode we were given was pretty well formed, but on the understanding of it, it did not come easy, and for as many steps there are, I for one am surprised it is a faster means to sort something than merge sort. Point in case, below is two attempts at digitally whiteboarding the steps out:

![A Whiteboard of Proportions!](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/2020-10-21%20QuickSort%20Whiteboard.png?raw=true)
