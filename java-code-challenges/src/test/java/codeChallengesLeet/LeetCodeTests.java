package codeChallengesLeet;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("For the Leets!")
public class LeetCodeTests {

    @Nested
    @DisplayName("ZigZag.")
    class zigZagTesting {

        @Test
        @DisplayName("The zig and zagging")
        public void zigTestOne() {
            assertEquals("acbd", ZigZag.zigZagger("abcd", 2));
            assertEquals("pciahku", ZigZag.zigZagger("pikachu", 3));
        }
    }

    //    @Nested
//    @DisplayName("Rudimentary, Split up Graph") // this worked for an ORDERED List. What was given was an UNORDERED List. If I want this to work, I'll need to build the whole edges and everything.
//    class appleCounting {
//
//        int n2 = 4;
//        int[] one2 = {0, 1};
//        int[] two2 = {1, 2};
//        int[] three2 = {0, 3};
//        int[][] edges2 = {one2, two2, three2};
//        List<Boolean> hasApplesArr2 = Arrays.asList(true, true, true, true);
//
//        @Test
//        @DisplayName("Breaker off one hub...")
//        public void appleOne() {
//            AppleCollector ac2 = new AppleCollector();
//                assertEquals(6, ac2.minTime(n2, edges2, hasApplesArr2), "should be 6...");
//        }
//
//        int n = 7;
//        int[] one = {0, 1};
//        int[] two = {0, 2};
//        int[] three = {1, 4};
//        int[] four = {1, 5};
//        int[] five = {2, 3};
//        int[] six = {2, 6};
//        int[][] edges = {one, two, three, four, five, six};
//        List<Boolean> hasApplesArr = Arrays.asList(false, false, true, false, true, true, false);
//
//        @Test
//        @DisplayName("Count the trees w Apples!")
//        public void apple() {
//            AppleCollector ac = new AppleCollector();
//            System.out.println(ac.minTime(n, edges, hasApplesArr));
//        }
//    }
    @Nested
    @DisplayName("Rudimentary, Split up Graph")
            // this worked for an ORDERED List. What was given was an UNORDERED List. If I want this to work, I'll need to build the whole edges and everything.
    class appleCounting {

        int n = 7;
        int[] one = {0, 1};
        int[] two = {0, 2};
        int[] three = {1, 4};
        int[] four = {1, 5};
        int[] five = {2, 3};
        int[] six = {2, 6};
        int[][] edges = {one, two, three, four, five, six};
        List<Boolean> hasApplesArr = Arrays.asList(false, true, true, false, true, true, false);

        @Test
        @DisplayName("Breaker off one hub...")
        public void appleOne() {
            AppleCollector ac2 = new AppleCollector();
            assertEquals(8, ac2.minTime(n, edges, hasApplesArr), "should be 8...");
        }
    }
}