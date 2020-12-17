package codeChallenges;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals; // https://junit.org/junit5/docs/current/user-guide/#overview

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

    @Test
    @DisplayName("Sum all the individuals numbers of an int")
    public void intSumTest() {
        assertEquals(SumIntPlaces.digital_root(595), 1, "Should be solo uno");
        assertEquals(SumIntPlaces.digital_root(5), 5, "Should be solo uno");
        assertEquals(SumIntPlaces.digital_root(12345), 6, "Should be solo uno");
    }

    @Test
    @DisplayName("Checking for the WUBS")
    public void wubTest() {
//        System.out.println(DubWordCleanUp.SongDecoder("WUBWUBWUBWEWUBWUBARE"));
    }

    @Nested
    @DisplayName("Testing for Cube Buildings")
    class CubeBuildingsTest {

        @Test
        @DisplayName("A Simple Building...")
        public void oneLevelBuildTest() {
            assertEquals(1, CubePileBuilder.findNb(1L));
        }

        @Test
        @DisplayName("A large number test")
        public void test1() {
            assertEquals(2022, CubePileBuilder.findNb(4183059834009L));
        }

        @Test
        public void test2() {
            assertEquals(-1, CubePileBuilder.findNb(24723578342962L));
        }
        @Test
        public void test3() {
            assertEquals(4824, CubePileBuilder.findNb(135440716410000L));
        }
        @Test
        public void test4() {
            assertEquals(3568, CubePileBuilder.findNb(40539911473216L));
        }
        @Test
        public void test1x() {
            assertEquals(50673, CubePileBuilder.findNb(1648403834611043601L));
        }

    }


}
