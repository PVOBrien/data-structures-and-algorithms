package hackerRankChallenges;

import hackerRackTests.BirthDayCandleHeight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
            Assertions.assertEquals(3, BirthDayCandleHeight.birthdayCakeCandles(candles), "Should be 3.");
        }

    }

    @Nested
    @DisplayName("Socks")
    class Socks {

        @Test
        @DisplayName("SOCKS!")
        public void socksOne(){
            List<Integer> socks = new ArrayList<>();
            socks = Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);
            // 4 ones
            // 1 two
            // 5 threes
            System.out.println(SockPairs.sockMerchant(socks.size(), socks));
        }
    }
}