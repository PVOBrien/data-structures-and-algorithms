package codeChallenges;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test Suite for all CodeWar code challenges")
public class CodeWarsTests {

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
    @DisplayName("Next Square Root")
    public void nextSquareRootTest() {
        assertEquals(NextSquare.findNextSquare(9), 16, "Should be 16");
        assertEquals(NextSquare.findNextSquare(10), -1, "Should be 16");
    }

    @Test
    @DisplayName("Matching end strings")
    public void matchEndStringTest() {
        assertEquals(MatchingEnd.solution("abcd", "bcd"), true, "Should be true");
        assertEquals(MatchingEnd.solution("abc", "d"), false, "Should be false");
        assertEquals(MatchingEnd.solution("abc", "abc"), true, "Should be false");
        assertEquals(MatchingEnd.solution(" ", "d"), false, "Should be false");
        assertEquals(MatchingEnd.solution("bcd", "abcd"), false, "Should be false");
    }
}
