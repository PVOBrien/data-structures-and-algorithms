package codeChallenges;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.awt.color.CMMException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(true, PossibleTriangleBySides.isTriangle(1, 2, 2));
        assertEquals(false, PossibleTriangleBySides.isTriangle(7, 2, 2));
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

    @Nested
    @DisplayName("Checking Factorials and Trailing Zeroes")
    class FactorialsAndTrailingNumbers {

        @Test
        @DisplayName("Dumb Factorial")
        public void factorialTest() {
            int result = TrailingZeroes.zeros(3);
            assertEquals(0, result);
        }

        @Test
        @DisplayName("Simple Factorial")
        public void SimpleFactorialTest() {
            int result = TrailingZeroes.zeros(6);
            assertEquals(1, result);
        }

        @Test
        @DisplayName("Bigger Factorial")
        public void FourteenFactorialTest() {
            int result = TrailingZeroes.zeros(14);
            assertEquals(2, result);
        }

        @Test
        @DisplayName("Huge Factorial")
        public void HugeFactorialTest() {
            int result = TrailingZeroes.zeros(582920136);
            assertEquals(145730028, result);
        }

        @Test
        @DisplayName("Five Factorial")
        public void FiveFactorialTest() {
            int result = TrailingZeroes.zeros(25);
            assertEquals(6, result);
        }
    }

    @Nested
    @DisplayName("Clean String of Integers")
    class NumbersToOrderedString {
        @Test
        @DisplayName("First of the Tests")
        public void IntRangeConcat1() {
            assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", StringNumbersTogether.rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
        }

        @Test
        @DisplayName("Test Two")
        public void IntRangeConcat2() {
            assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", StringNumbersTogether.rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
        }
    }

    @Nested
    @DisplayName("Here comes Josephus / Duck Duck Go")
    class JosephusTest {

        @Test
        @DisplayName("1-10 coming...")
        public void simpleDuckTest() {
            List<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
            assertEquals(testList.toString(), JosephusDuckDuckGo.josephusPermutation(testList, 1).toString());
        }

        @Test
        @DisplayName("1-10 but skip every other one.")
        public void everyOtherDuckTest() {
            List<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
            assertEquals("[2, 4, 6, 8, 10, 3, 7, 1, 9, 5]", JosephusDuckDuckGo.josephusPermutation(testList, 2).toString());
        }
    }

    @Nested
    @DisplayName("Make a Diamond")
    class diamondBuilderTest {

        @Test
        @DisplayName("0 row null")
        public void dBZeroTest() {
            assertNull(diamondBuilder.print(0));
        }

        @Test
        @DisplayName("-1 row null")
        public void dBNegativeTest() {
            assertNull(diamondBuilder.print(-0));
        }

        @Test
        @DisplayName("0 row null")
        public void dBOneTest() {
            assertEquals("*\n", diamondBuilder.print(1), "Just a star");
        }

        @Test
        @DisplayName("0 row null")
        public void dBEvenTest() {
            assertNull(diamondBuilder.print(2));
        }

        @Test
        @DisplayName("0 row null")
        public void dBThreeTest() {
            assertEquals(" *\n***\n *\n", diamondBuilder.print(3), "3 row diamond");
        }

        @Test
        @DisplayName("0 row null")
        public void dBFiveTest() {
            assertEquals("  *\n ***\n*****\n ***\n  *\n", diamondBuilder.print(5), "Just a star");
        }
    }

    @Nested
    @DisplayName("Conway's Game of Life")
    class ConwayTests {

        @BeforeAll
        public void simpleSpoolUp() {
            int[][][] sampleCGL = {{
                    {1, 0, 0},
                    {1, 1, 0},
                    {0, 1, 1},
            }, {
                    {0, 1, 0},
                    {0, 0, 1},
                    {1, 1, 1}
            }};

        }
    }

    @Nested
    @DisplayName("SpacesStairCase")
    class SpaceStairCaseTest {

        @Test
        @DisplayName("Get that staircase to...")
        public void spaceStairCaseSimpleTest() {

            SpaceStairCase.staircase(5);

            System.out.println(SpaceStairCase.staircase(3));

        }
    }

    @Nested
    @DisplayName("Sudoku Checker")
    class SudokuChecker {

        @Test
        @DisplayName("3x3 miniSudokuCheck")
        public void sudokuSingleGridTest() {
            int[][] sampleMiniSdkGrid = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            assertTrue(SudokuCheck.check(sampleMiniSdkGrid));

        }

        @Test
        @DisplayName("3x3 miniSudokuCheck")
        public void sudokuTrueCheckerTest() {
            int[][] sampleMiniSdkGrid = {
                    {5, 6, 4, 8, 7, 9, 3, 1, 2},
                    {8, 9, 7, 2, 1, 3, 6, 4, 5},
                    {2, 3, 1, 5, 4, 6, 9, 7, 8},
                    {3, 4, 2, 6, 5, 7, 1, 8, 9},
                    {9, 1, 8, 3, 2, 4, 7, 5, 6},
                    {6, 7, 5, 9, 8, 1, 4, 2, 3},
                    {4, 5, 3, 7, 6, 8, 2, 9, 1},
                    {1, 2, 9, 4, 3, 5, 8, 6, 7},
                    {7, 8, 6, 1, 9, 2, 5, 3, 4},
            };

            assertTrue(SudokuCheck.check(sampleMiniSdkGrid));

        }

        @Test
        @DisplayName("3x3 miniSudokuCheck")
        public void sudokuBadCheckerTest() {
            int[][] sampleMiniSdkGrid = {
                    {1, 2, 3},
                    {3, 2, 2},
                    {2, 3, 1}
            };

            assertFalse(SudokuCheck.check(sampleMiniSdkGrid));

        }

        @Test
        @DisplayName("Random SudokuCheck 1")
        public void randomSudokuChecker1Test() {
            int[][] sampleMiniSdkGrid = {
                    {6, 4, 5, 8, 7, 9, 3, 1, 2},
                    {3, 1, 2, 5, 4, 6, 9, 7, 8},
                    {9, 7, 8, 2, 1, 3, 6, 4, 5},
                    {4, 2, 3, 6, 5, 7, 1, 8, 9},
                    {7, 5, 6, 9, 8, 1, 4, 2, 3},
                    {1, 8, 9, 3, 2, 4, 7, 5, 6},
                    {5, 3, 4, 7, 6, 8, 2, 9, 1},
                    {8, 6, 7, 1, 9, 2, 5, 3, 4},
                    {2, 9, 1, 4, 3, 5, 8, 6, 7},
            };
            assertTrue(SudokuCheck.check(sampleMiniSdkGrid));

        }

    }

    @Nested
    @DisplayName("CamelCaser")
    class CamelCaserTest {

        @Test
        @DisplayName("for the Camels!")
        public void CamelCaserOne () {
            assertEquals("howdyFolks",CamelCaser.toCamelCase("howdy-folks"), "howdyFolks expected.");
        }

        @Test
        @DisplayName("for the Camels!")
        public void CamelCaserTwo () {
            assertEquals("we'reBackAndBetter!",
                    CamelCaser.toCamelCase("we're-back_and-better!"),
                    "that string back");
        }

        @Test
        @DisplayName("for the Camels!")
        public void CamelCaserThree () {
            assertEquals("WhatAboutNow?",
                    CamelCaser.toCamelCase("What-about_Now?"),
                    "that string back");
        }
    }

}