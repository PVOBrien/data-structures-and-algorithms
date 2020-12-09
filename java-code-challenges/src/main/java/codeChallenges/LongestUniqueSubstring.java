package codeChallenges;

import java.util.HashMap;
import java.util.HashSet;

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
        int numsToDrop = 0;

        for (int i = 0; i < s.length(); i++) {
            if (uniques.containsKey(s.charAt(i)) || s.charAt(i) == ' ' && spaceFlag) {
                numsToDrop = uniques.get(s.charAt(i));
                spaceFlag = false;

                for (int j = 0; j < numsToDrop+1; j++) {
                    uniques.remove(s.charAt(j));
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

}
