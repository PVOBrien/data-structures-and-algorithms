package codeChallenges;

import java.util.*;

// Challenge
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

public class TwoSum {
    public static int[] twoSum(Integer[] nums, int target) throws NoSuchElementException  {
        int[] solution = new int[]{-1, -1};
        HashMap<Integer, Integer> numMap= new HashMap<>(); // A map allows us to keep track of both the integer value, and the index from the array.
        for (int i = 0; i < nums.length; i++) { // Gotta iterate over something!
                int complement = target - nums[i]; // what number *are* we looking for?
                if (numMap.containsKey(complement)) { // so, if the map does contain the right number...
                    solution[0] = i; // obvs, the first number is "i" as the first index position of the array.
                    solution[1] = numMap.get(complement); // but second position, this is unique, because the map actually looks up the complement's _old index position as it's value_. Ingenious!
                    return solution;
                }
            numMap.put(nums[i], i); // and so concludes the method that enables each index position to be checked, at amortized O(1) lookup time speed, and O(n) space consideration. The deal being, the index position is the value, and the actual value is the key. Just wild!
            }
        System.out.println("is this here?");
        throw new NoSuchElementException("Nope");
    }
}