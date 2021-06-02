package hackerRankChallenges;

import java.util.HashMap;
import java.util.List;

public class BirthDayCandleHeight {

        public static int birthdayCakeCandles(List<Integer> candles) {
            HashMap<Integer, Integer> candleHeights = new HashMap<>();
            int counter = 0;

            for (int candle : candles) {
                if (candle > counter) { counter = candle; }
                if (candleHeights.containsKey(candle)) {
                    int currentQuant = candleHeights.get(candle) + 1; // you can't just ++ increment when initializing a variable it would seem.
                    candleHeights.put(candle, currentQuant);
                } else {
                    candleHeights.put(candle, 1);
                }
            }
            return candleHeights.get(counter);
        }
}
