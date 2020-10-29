# InsertSort Breakdown
## w Help from Matthew Petersen and Kamit Satkeev

An insert takes an arraylist, and sorts from lowest to highest in place. This makes for good space - O(n) - but not great time, (although not horrible time, seeing that it has to iterate over item, so it's time is O(n). So here's the actual code:
``` Java
public int[] insertSort (int[] arr) {
    int n = arr.length
    for (int I = 0; I < n ; i++) {
        int min = i;
        for (int j = I + 1; j < n; j++) {
            if (arr[j] < arr[min])
            min = j;
        }
    int temp = arr[min];
    arr [min] = arr[i];
    arr[i] = temp
    }
    return arr;
}
```

So what is this code doing? Let's break it down. We're going to arrange this list:
	[8, 4, 23, 42, 16, 15]

So, we start with the value at the zero-th index: 8, and get going in a first for loop, that we'll call the i loop. And then we start moving forward in another loop - the j loop - to see if there is a lower number. And if there is a lower number, then that number is held in another parameter (that starts at i basically so it is i+1, so that at the end of the nested for loop, the current number and the number in that low parameter are swapped.

![Step 1](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/insertSort1.png?raw=true)

Now, that's the first number. We only stepped through the first pass of the i loop - there's another 6 index values to step through! So, we go through it again, and this value is…



8 again! It just moved forward one, so it doesn't move again; there was only one number lower than it, and it was the next number. So a whole iteration was spent just checking things in place.
But we move on now to the next position…


23.  Now, if you're paying attention, there are two numbers lower than it. It actually held 16 as the lowest number for a step, before 15 took the place as the lowest, and then the two locations swap.



Next to 42, which again first sees 16 as the lowest, then still has to check against 23, and then 16 and 42 swap…



And then 42 sees that 23 is below (and lowest), so they swap.



And 42 is the answer, I mean the last number (or is that one and the same ;))! The array is returned, all prettified and in order!


Edited 2020-10-29
