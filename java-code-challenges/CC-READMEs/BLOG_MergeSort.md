# MergeSort Walkthru

![The Merge Sort](https://github.com/PVOBrien/data-structures-and-algorithms/blob/master/java-code-challenges/src/main/resources/2020-10-20blog_mergesort.png?raw=true)

Today we worked through pseudocode for a merge sort, a better sequel to yesterday's sortsearch - faster, leaner, and cooler. Why's it cooler? Recursion! And it's just plain better. So here's a walk through of the process.

If you follow that excellent visual up above, here's what goes on in the code. Firstly, the (assumed to be) unsorted array is passed into the function. At this point, it steps into an if statment, where if the array is larger than one, it gets broken up into a left and a right, rounded up (so the left will get the +1 if it's an odd number). Once this first left right split happens, it's time for recursion, all the way down!
So the recursion walks down the left side, splitting it up into left and right arrays until the array is only one item, at which point it then looks to the right array (which has also been recursed down to only 1 item arrays as well) and then merges them, putting the array back together with the lowest number in the lower array index positions.
This is at steps 7, 8, 9, that the recursion starts popping back up the stack, and then goes down the right array, until it resolves all the one item arrays, until it shows back up to the top, and at step 14 it merges the two arrays, and... will you look at that! It's sorted!

I was surprised to work through this, and come to the realization that it is a considerably faster than the sort search, where instead of it being the dreaded O(n^2) for time, here it is O(n log n) - not quite O(n) but far better than the square time of the preceding option. As for space, it is O(n), as many it will always build out as many spaces as there are array memory slots (plus a handful more for holding on to values temporarily). So in that regard, the sort search is somewhat better, but the tradeoff is likely worth it.

Thank you for tuning into another method walkthrough with your host, Paul O'Brien!  