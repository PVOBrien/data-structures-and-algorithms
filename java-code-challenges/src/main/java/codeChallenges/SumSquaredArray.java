package codeChallenges;

public class SumSquaredArray {

    public static int squareSum(int[] n) {
        double total = 0;
        for (int number : n) {
            total += Math.pow(number, 2); // Because somehow Java doesn't have a built in "powers" operand. Java is weird. https://www.geeksforgeeks.org/math-pow-method-in-java-with-example/
        }
        return (int) total;
    }

}
