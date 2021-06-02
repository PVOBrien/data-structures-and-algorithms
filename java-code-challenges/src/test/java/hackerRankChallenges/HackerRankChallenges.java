package hackerRankChallenges;

import org.checkerframework.checker.signature.qual.DotSeparatedIdentifiers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("https://www.hackerrank.com/")
public class HackerRankChallenges {

    @Nested
    @DisplayName("Check the most candles' height")
    class CandlesHeight {

        @Test
        @DisplayName("Sanity Check")
        public void candleTestOne() {
            ArrayList<Integer> candles = new ArrayList<>();
            candles.add(1);
            candles.add(2);
            candles.add(3);
            candles.add(2);
            candles.add(3);
            candles.add(3);
            assertEquals(3, BirthDayCandleHeight.birthdayCakeCandles(candles), "Should be 3.");
        }

    }

    @Nested
    @DisplayName("Socks")
    class Socks {

        @Test
        @DisplayName("SOCKS!")
        public void socksOne(){
            List<Integer> socks = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
//            socks = Arrays.asList(1, 1);
            // 4 tens
            // 3 20s
            // 1 30
            // 1 50
            System.out.println(SockPairs.sockMerchant(socks.size(), socks));
        }
    }

    @Nested
    @DisplayName("Valley Count")
    class ValleyCountTest {
        @Test
        @DisplayName("Valleys, up and down")
        public void valley1(){

            String elevation = "UDDDUDUU";
            System.out.println(ValleyCount.valleyCount(elevation.length(), elevation));
        }
    }

    @Nested
    @DisplayName("Clouds be jumped!")
    class CloudJumpsTest{
        @Test
        @DisplayName("lil cloud jumping")
        public void jump1Test(){

            List<Integer> theClouds = new ArrayList<>();
            Integer[] clouds = {0,0, 1, 0, 0, 1, 0};
            Collections.addAll(theClouds, clouds);

            System.out.println(CloudJumps.jumpingOnClouds(theClouds));
        }
    }

    @Nested
    @DisplayName("Simple PW Checker")
    class PasswordCheckerTest {
        @Test
        @DisplayName("only 1 letter")
        public void passwordTestOne() {
            assertEquals(5, PasswordChecker.minimumNumber(6, "a"));
        }

        @Test
        @DisplayName("only lower case, but minimum count")
        public void passwordTestTwo() {
            assertEquals(3, PasswordChecker.minimumNumber(6, "abcdef"));
        }

        @Test
        @DisplayName("lower and upper, minimum count!")
        public void passwordTestThree() {
            assertEquals(2, PasswordChecker.minimumNumber(6, "Abcdef"));
        }

        @Test
        @DisplayName("lower and upper, minimum count!")
        public void passwordTestFour() {
            assertEquals(2, PasswordChecker.minimumNumber(6, "Abcdef"));
        }

        @Test
        @DisplayName("lower and upper and number, minimum count!")
        public void passwordTestFive() {
            assertEquals(1, PasswordChecker.minimumNumber(6, "Ab#def"));
        }

        @Test
        @DisplayName("complete, minimum count!")
        public void passwordTestSix() {
            assertEquals(0, PasswordChecker.minimumNumber(6, "Ab#1ef"));
        }

        @Test
        @DisplayName("missing upper case, but minimum count")
        public void passwordTestSeven() {
            assertEquals(1, PasswordChecker.minimumNumber(6, "ab#1ef"));
        }

    }

    @Nested
    @DisplayName("Simple Vowel Counter")
    class SimpleVowelCounter {

        @Test
        @DisplayName("Magic!")
        public void vowelsOne() {
            assertEquals(5, simpleVowelCounter.getCount("abracadabra"));
        }

        @Test
        @DisplayName("two!")
        public void vowelSolo() {
            assertEquals(1, simpleVowelCounter.getCount("a"));
        }
    }
}