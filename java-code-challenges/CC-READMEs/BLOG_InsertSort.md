# InsertSort Breakdown
## w Help from Matthew Petersen and Kamit Satkeev

![step-by-step](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/codeChallenge26.PNG?raw=true)

We worked through a step by step of a SortSearch method, first interpreting it from pseudocode given to us, and then we proceeded to walk through and rebuild it in Java.

After the necessary steps of turning on the class, and declaring the method with a return of an integer array (the sorted array) and being passed in an integer array (the array to be sorted) we got to it.
First for ease of reading we declared a variable _n_ to be assigned the length of the array. Then we ran a for loop. In the for loop we declare min to be i - the number being iterated over at the time. Then we start another for loop, the j loop. In the j loop, it is the "fast" loop, wherein it is checked to see if the value at the index of j is lower than i, and if so then min is re-assigned to j.
Once that inner for loop iterated, a temp variable is assigned to the index at the variable min, then the value at the index of array at min becomes the value of array at i, effectively shuffling the number forward if need be (or just leaving it in place if it's the same), and then the value of the array at index i becomes the temp, completing the shuffle.
This for loop runs over the entire array. So it will get the job done, but when discussing big O notation, it is not fast for time, having to take the O(n^2) as it runs an inner for loop. But it does get the job done.