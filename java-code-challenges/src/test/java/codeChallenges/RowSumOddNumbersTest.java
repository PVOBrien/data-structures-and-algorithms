package codeChallenges;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Here are tests")
public class RowSumOddNumbersTest {

    @Test
    @DisplayName("add a triangle's row of odd numbers")
    public void triangleStartTest() {
        System.out.println(RowSumOddNumbers.rowSumOddNumbers(3));
    }

    @Test
    @DisplayName("finding if a triangle is possible")
    public void triangleSidesTest() {
        PossibleTriangleBySides.isTriangle(5, 6, 4);
        assertEquals(true, PossibleTriangleBySides.isTriangle(1,2,2));
        assertEquals(false, PossibleTriangleBySides.isTriangle(7,2,2));
    }

    @Test
    @DisplayName("Length of Longest Substring")
    public void longestSubstringTest() {
        int check = LongestUniqueSubstring.lengthOfLongestSubstring("abcabcbb");
        System.out.println(check);
    }

    @Test
    @DisplayName("Length of Longest Substring")
    public void longestUniqueSubstringTest() {
//        int check = LongestUniqueSubstring.longestSubstringUniqueChars("abcabcbb");
//        assertEquals(3, check, "Should be 3");
//        int check2 = LongestUniqueSubstring.longestSubstringUniqueChars("bbbbb");
//        assertEquals(1, check2, "Should be 1");
//        int check5 = LongestUniqueSubstring.longestSubstringUniqueChars("c");
//        assertEquals(1, check5, "Should be 1");
//        int check6 = LongestUniqueSubstring.longestSubstringUniqueChars("dvdf");
//        assertEquals(3, check6, "Should be 3");
        int check4 = LongestUniqueSubstring.longestSubstringUniqueChars(" ");
        assertEquals(1, check4, "Should be 1");
//        int check3 = LongestUniqueSubstring.longestSubstringUniqueChars("pwwkew");
//        assertEquals(3, check3, "Should be 3");
//        int check7 = LongestUniqueSubstring.longestSubstringUniqueChars("bpfbhmipx");
//        assertEquals(7, check7, "Should be 7");
    }

}
