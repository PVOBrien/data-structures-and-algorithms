package codeChallenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

    public static int lengthOfLongestSubstring(String s) { // for longest substring that doesn't have an immediately repeating char.
        int highCount = 0;
        int currentCount = 1;
        char currentChar = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != currentChar) {
                currentCount++;
            } else {
                currentCount = 0;
            }

            if (currentCount > highCount) {
                highCount = currentCount;
            }
            currentChar = s.charAt(i);
        }
        return highCount;
    }

    public static int longestSubstringUniqueChars (String s) {
        HashMap<Character, Integer> uniques = new HashMap<>();
        int highCount = 0;
        boolean spaceFlag = false;
        int numsToDrop = 0; // 1
        int bottomNumToDrop = 0;

        for (int i = 0; i < s.length(); i++) {
            if (uniques.containsKey(s.charAt(i)) || s.charAt(i) == ' ' && spaceFlag) {
                numsToDrop = uniques.get(s.charAt(i));
                spaceFlag = false; // edge cases will break this easily

                for (int j = bottomNumToDrop; j < numsToDrop+1; j++) {
                    uniques.remove(s.charAt(j)); // don't want to start
                    bottomNumToDrop = j+1;
                }

            } else if (s.charAt(i) == ' ') {
                spaceFlag = true;
            }
            uniques.put(s.charAt(i), i);
            if (uniques.size() > highCount) { highCount = uniques.size(); }
        }

        highCount = spaceFlag ? +1 : highCount;
        return highCount;
    }

    // OR the below code, which for some reason spaces are Characters. Unlike in mine. >:(
    public static int otherLengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

}
