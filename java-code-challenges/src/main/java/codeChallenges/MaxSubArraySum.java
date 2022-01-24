package codeChallenges;

import java.util.Arrays;

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
        System.out.println(Arrays.toString(arr)); // sanity check.

        presentArr = arr;

        // deal w simple edge cases - empty arr and all negatives.
        if (arr.length == 0) return 0; // empty Array return.
        if (!positiveIsPresent(arr)) return 0; // if there isn't a positive number, return result

//===== the real work begins! ===================================
        // sliding door to find greatest string.
        int currentSum = sumUp(0, arr.length);        // starting the count.
        int stoppedRIndex = 0;

        int windowIndexL = 0;                         // defining variable, starting instantiation. for the left window

        for (int i = 0; i < presentArr.length; i++) {
            if (presentArr[i] > 0) {
                windowIndexL = i;
                break;
            }
        }
        int windowIndexR = nextNegative(windowIndexL);

        while (windowIndexR != presentArr.length) {
            int sumL = sumToNextNegative(windowIndexL);
            if (sumL > currentSum) {
                currentSum = sumL;
                stoppedRIndex = windowIndexL;
            }

            windowIndexR = nextNegative(windowIndexL);

            if (windowIndexR == presentArr.length) break;
            int tempSum = sumToNextNegative(windowIndexR);

            boolean goesMinus = false;

//            while (!goesMinus) { // moving the left window up
            sumL += tempSum;
            if (sumL > currentSum) {
                currentSum = sumL;
                stoppedRIndex = windowIndexR;
            }

            windowIndexR = nextNegative(windowIndexR + 1);
            tempSum = sumToNextNegative(windowIndexR);

            System.out.println("Left window: " + windowIndexL);
            System.out.println("Right window: " + windowIndexR);
            System.out.println("Current sum: " + currentSum);
            System.out.println(" ");
//            }
        }

        while (windowIndexL < stoppedRIndex) {
            if (sumUp(windowIndexL, stoppedRIndex) > currentSum) currentSum = sumUp(windowIndexL, stoppedRIndex);
            windowIndexL = nextWindowForward(windowIndexL);
        }

//            windowIndexL = nextWindowForward(windowIndexL);


        return currentSum;
    }

    // === Helper Function: Sum the Array ===
    private static int sumUp(int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += presentArr[i];
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

    // === Helper Function: find next possible left window ===
    private static int nextWindowForward(int currentLWIndex) {
        for (int i = currentLWIndex; i < presentArr.length; i++) {
            if (i + 1 == presentArr.length) return presentArr.length;
            if (presentArr[i] < 0 && presentArr[i + 1] > -1) {
                return i + 1;
            }
        }
        return presentArr.length;
    }

    // === Helper Function: find next possible right window ===
    private static int nextRightWindow(int currentRWIndex, int lWindow) {
        for (int i = currentRWIndex; i > lWindow; i--) {
            if (i == 0) return 0;
            if (presentArr[i] < 0 && presentArr[i - 1] > -1) { // finding the next POSITIVE integer
                return i - 1;
            }
        }
        return 0;
    }

    private static int sumToNextNegative(int leftWindow) {
        if (leftWindow > presentArr.length-1) leftWindow = presentArr.length-1;
        int sum = presentArr[leftWindow];
        for (int i = leftWindow + 1; i < presentArr.length; i++) {
            if (i > presentArr.length || presentArr[i] < 0) break;
            sum += presentArr[i];
        }
        return sum;
    }

    private static int nextNegative(int leftWindow) {
        for (int i = leftWindow; i < presentArr.length; i++) {
            if (presentArr[i] < 0) return i;
        }
        return presentArr.length;
    }
}
