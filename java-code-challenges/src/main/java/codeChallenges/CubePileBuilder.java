package codeChallenges;

public class CubePileBuilder { // https://www.codewars.com/kata/5592e3bd57b64d00f3000047/train/java

    public static long findNb(long m) {
        long sum = 0L;
        long counter = 1L;
        while (sum < m) {
            sum += (long) Math.pow(counter, 3); // must be cast as (long) to handle big big numbers, otherwise it will return as sized as an integer.
            if (sum == m) return counter;
            counter++;
        }
        return -1;
    }
}
