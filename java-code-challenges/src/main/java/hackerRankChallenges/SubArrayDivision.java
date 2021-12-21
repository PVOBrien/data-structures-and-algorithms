package hackerRankChallenges;

import java.util.List;

public class SubArrayDivision {
    public static int howMany(int[] arr, int stretch, int sum) {
        int endTotal = 0; // initialize return value
        if (stretch > arr.length) return 0; // edge case that there aren't enough values in the array to satisfy the run of numbers
        for (int i = stretch; i < arr.length; i++) { // find the sum of the stretch. This can be improved
            int total = 0;
            for (int j = stretch; j > 0; j--) { // actually find the sum. off by 1?
                total += arr[i-j]; // off by one. Somewhere.
            }
            if (total == sum) endTotal++; // is sum? then count it.
        }
        return endTotal;
    }

    public static int howMany(List<Integer> arr, int stretch, int sum) {
        System.out.println("Size of arr/list: " + arr.size());
        System.out.println("Content of list: " + arr);
        int endTotal = 0; // initialize return value
        if (stretch > arr.size()) return 0; // edge case that there aren't enough values in the array to satisfy the run of numbers
        for (int i = stretch; i < arr.size(); i++) { // find the sum of the stretch. This can be improved
            int total = 0;
            for (int j = stretch; j > 0; j--) { // actually find the sum. off by 1?
                total += arr.get(i-j); // off by one. Somewhere.
            }
            if (total == sum) endTotal++; // is sum? then count it.
        }
        return endTotal;
    }
}
