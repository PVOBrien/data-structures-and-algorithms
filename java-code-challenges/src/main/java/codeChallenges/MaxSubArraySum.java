package codeChallenges;

public class MaxSubArraySum {
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
    public static int sequence(int[] arr) {
        // declare end int variable, initialize as 0.
        int result = 0;

        // deal w simple edge cases - empty arr and all negatives.
        if (arr.length == 0) return result;
        boolean positives = false;
        for (int number : arr) {
            positives = number > 0;
            if (positives) break;
        }
        if (!positives) return result;

        // sliding door to find greatest string.
        // check to

        return 4;
    }
}
