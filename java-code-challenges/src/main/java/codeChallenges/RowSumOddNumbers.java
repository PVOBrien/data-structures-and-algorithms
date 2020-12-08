package codeChallenges;

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        if (n == 1) return 1;
        int numToMult = 0;
        int rowSum = 1;
        for (int i = 0; i < n; i++) {
            numToMult += i*2;
        }
        rowSum += numToMult;
        int nextInRow = rowSum;
        for (int i = 0; i < n-1; i++) {
            nextInRow += 2;
            rowSum += nextInRow;
            System.out.println("After adding " + i + ": " + rowSum);
        }
        return rowSum;
    }
}

// OR

// class RowSumOddNumbers { // how crazy is this code?!
//    public static int rowSumOddNumbers(int n) {
//        return n * n * n;
//    }
//} // shakes head, blammed math.