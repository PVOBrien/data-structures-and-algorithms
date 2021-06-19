package codeChallenges;

/**
 * https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c
 * The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
 * <p>
 * Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
 * // should be 6: {4, -1, 2, 1}
 * Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array.
 * <p>
 * If the list is made up of only negative numbers, return 0 instead.
 * Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
 */
public class MaxSubArraySum {

    public static int[] presentArr; // globalize incoming arr;

    public static int sequence(int[] arr) {
        // declare end int variable, initialize as 0.
        int result = 0;
        presentArr = arr;

        // deal w simple edge cases - empty arr and all negatives.
        if (arr.length == 0) return result; // empty Array return.
        if (!positiveIsPresent(arr)) return result; // if there isn't a positive number, return result

//===== the real work begins! ===================================

        // sliding door to find greatest string.
        result = arr.length;                             // this could be the greatest count of greatest sum...
        int j = arr.length - 1;                          // setup the starting far pointer/right window.
        int currentSum = sumUp(0, j);               // starting the count.

        for (int i = 0; i < j; ) {              // I need to have control of the pointer.
//            while (arr[i] < 0) i++;                      // we'll never start on a negative number so increment. Probably don't need/would cause problems.
//            while (arr[j] < 0) j--;                      // decrement, we'll never end on a negative. Probably don't need/would cause problems.

            int nextJ = nextRightWindow(j, i); // next righWBlock = "next" positive number preceding a negative integer.

            // todo: use a while (){} OR a do{}while() loop for leftWindow.

            while (j != nextJ) { // todo: use a while (){} OR a do{}while() loop for rightWindow.
                int tempSum = sumUp(i, nextJ);
                if (tempSum > currentSum) currentSum = tempSum;
                result = nextJ - i;
                j = nextJ;
            }
//            i++; // TODO: check this is valid.

        }

        return result;
    }

    // === Helper Function: Sum the Array ===
    private static int sumUp(int start, int end) {
        int sum = 0;
        for (int k = start; start < end; start++) {
            sum += presentArr[k];
        }
        return sum;
    }

    // === Helper Function: if there's any positive Numbers ===
    private static boolean positiveIsPresent(int[] arrToCheck) {
        boolean positives = false;
        for (int number : arrToCheck) {
            positives = number > 0;
            if (positives) break;
        }
        return positives;
    }

    // === Helper Function: find next possible right window ===
    private static int nextRightWindow(int currentRWIndex, int lWindow) {
        for (int i = currentRWIndex; i > lWindow; i--) {
            if (presentArr[i] < 0 && presentArr[i - 1] > -1) { // finding the next POSITIVE integer
                return i - 1;
            }
        }
        return currentRWIndex;
    }
}
