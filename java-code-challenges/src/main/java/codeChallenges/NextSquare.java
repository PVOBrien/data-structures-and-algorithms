package codeChallenges;

public class NextSquare {

    public static long findNextSquare(long sq) {
        double nextSq = Math.pow(sq, 0.5);
        return (nextSq % 1 == 0) ? (long) Math.pow(nextSq + 1, 2) : -1;
    }
}