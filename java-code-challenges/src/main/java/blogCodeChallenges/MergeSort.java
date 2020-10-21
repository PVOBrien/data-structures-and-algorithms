package blogCodeChallenges;

import java.util.Arrays;

public class MergeSort {                                                                // set up Java Class

    public int[] mergeSort (int[] unSortedArr) {                                        // set up method declaration, returning an array of integers, and being passed in two arrays of integers (assumed to be unsorted)
        int n = unSortedArr.length;                                                     // declaring n as unSortedArr's length.
        int[] sortedArr = new int[n];

        if (n > 1) {                                                                    // base case statement: if n is greater than 1, code steps into following code block...
            int mid = n/2;                                                              // mid is declared as half of n.
            int[] left = new int[mid];                                                  // new array left is assigned the size of mid (half the size of unSortedArr).
            System.arraycopy(unSortedArr, 0, left, 0, mid);               // Java way to move the first half of the array to left array.
            int[] right = new int[n-mid];                                               // new array right is assigned the length of the array subtracted by the mid (the back half size of unSortedArr).
            System.arraycopy(unSortedArr, mid, right, 0, n-mid);          // Java way to move the first half of the array to right array.
            System.out.println("this is the right array: " + Arrays.toString(left));    // sout out for sanity
            System.out.println("this is LEFT: " + Arrays.toString(right));              // sout out for sanity
            int[] newLeft = mergeSort(left);                                            // recurses the above code on the left array.
            int[] newRight = mergeSort(right);                                          // recurses the above code on the right array.
            //sortedArr = merge(newLeft, newRight, sortedArr);                          // merge the left and right and returns the sorted array TODO: ??? Doesn't require that sortedArr is explicit. It works either way.
            return merge(newLeft, newRight, sortedArr);                                 // return sortedArr/the final merge of the left and right.
        } else {
            return unSortedArr;                                                         // base case statement return TODO: remember the base case!
        }
    }

    public int[] merge (int[] left, int[] right, int[]arr) {                            // declaring the helper merge function that will return the sorted array.
        System.out.println("this is left, in MERGE: " +Arrays.toString(left));
        System.out.println("this is Right, in MERGE: " + Arrays.toString(right));
        int i = 0;                                                                      // declaring i as 0. It's a counter.
        int j = 0;                                                                      // declaring j as 0. It's a counter.
        int k = 0;                                                                      // declaring k as 0. It's a counter.

        while (i < left.length && j < right.length) {                                   // while i is less than the length of the left array and j is less than the length of the right array...
            if (left[i] <= right[j]) {                                                  // if the int at left array's value at index position of i is less than or equal to the right array's value at index position of j...
                arr[k] = left[i];                                                       // then the value of arr at position k is equal to the value at the index position of left at i.
                i++;                                                                    // increment i.
            } else {                                                                    // OTHERWISE...
                arr[k] = right[j];                                                      // the value of arr at position k is equal to the value of the value of the right array at position j.
                j++;                                                                    // increment j.
            }                                                                           // out of if statement.
            k++;                                                                        // increment k.
        }
        if (i == left.length) {                                                         // if i is equal to the length of the left...
            System.arraycopy(right, j, arr, k, right.length-j);                   // move the remainder of the right array into arr (in position).
            System.out.println("this is if i is equal" + Arrays.toString(arr));
        } else {                                                                        // OTHERWISE
            System.arraycopy(left, i, arr, k, left.length-i);                     // move the remainder of the left array into arr (in position).
            System.out.println("this is if j is equal" + Arrays.toString(arr));
        }
        return arr;
    }
}
