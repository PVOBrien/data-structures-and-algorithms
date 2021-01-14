package hackerRankChallenges;

import hackerRackTests.BirthDayCandleHeight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

@DisplayName("https://www.hackerrank.com/")
public class HackerRankChallenges {

    @Nested
    @DisplayName("Check the most candles' height")
    class CandlesHeight {

        @Test
        @DisplayName("Sanity Check")
        public void candleTestOne()  {
            ArrayList<Integer> candles = new ArrayList<Integer>();
            candles.add(1);
            candles.add(2);
            candles.add(3);
            candles.add(2);
            candles.add(3);
            candles.add(3);
            Assertions.assertEquals(3, BirthDayCandleHeight.birthdayCakeCandles(candles), "Should be 3.");
        }


    }
}