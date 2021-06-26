package codeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
public class MaxSubArraySumNew {
    public static int[] presentArr; // globalize incoming arr;

    public static int sequence(int[] arr) {
        presentArr = arr;
        int currentSum = sumUp(0, presentArr.length);
        int firstPositive = 0;

        for (int i = 0; i < presentArr.length; i++) {
            if (presentArr[i] > 0) {
                firstPositive = i;
                break;
            }
        }

        for (int i = firstPositive; i < presentArr.length; i++) {
            for (int j = i; j < presentArr.length; j++) {
//                int tempSum = sumUp(i, j);
                currentSum = Math.max(currentSum, sumUp(i,j));
//                if (tempSum > currentSum) currentSum = tempSum; // todo: use Math.max(num1, num2) in refactor
            }
        }

        return currentSum;
    }

    // === Helper Function: Sum the Array ===
    private static int sumUp(int start, int end) {
        int sum = presentArr[start];

        for (int i = start; i < end; i++) {
            if (i + 1 == presentArr.length) return sum;
            sum += presentArr[i + 1];
        }
        return sum;
    }

    public static int[] positiveNegativeGrouping(int[] arr) {
        List<Integer> middleArr = new ArrayList<>();
        int currentGrouping = arr[0];
        for (int i = 1; i < arr.length; ) {
            if (arr[i] > -1 && currentGrouping > -1) {
                currentGrouping += arr[i];
            } else if (arr[i] < 0 && currentGrouping < 0) {
                currentGrouping += arr[i];
            } else {
                middleArr.add(currentGrouping);
                currentGrouping = arr[i];
            }
            i++;

            if (i == arr.length) {
                middleArr.add(arr[i - 1]);
                i++;
            }
        }
        return middleArr.stream().mapToInt(i -> i).toArray(); // https://www.geeksforgeeks.org/arraylist-array-conversion-java-toarray-methods/
    }
}