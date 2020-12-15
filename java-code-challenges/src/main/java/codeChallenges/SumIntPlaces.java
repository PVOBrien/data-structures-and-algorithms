package codeChallenges;

public class SumIntPlaces {

    public static int digital_root(int n) {

        int sum = 0;
        String stringN = String.valueOf(n); // https://www.baeldung.com/java-number-of-digits-in-int
        for (int i = stringN.length()-1; i > -1; i--) {
            int addNum = Integer.parseInt(stringN.substring(i, i+1)); // https://www.freecodecamp.org/news/java-string-to-int-how-to-convert-a-string-to-an-integer/
            sum += addNum;
        }

        return n < 10 ? sum : intSumDown(n);
    }

    private static int intSumDown(int n) {
        int sum = 0;
        String stringN = String.valueOf(n);

        for (int i = stringN.length()-1; i > -1; i--) {
            int addNum = Integer.parseInt(stringN.substring(i,i+1));
            sum += addNum;
        }

        return sum < 10 ? sum : intSumDown(sum);
    }
}
