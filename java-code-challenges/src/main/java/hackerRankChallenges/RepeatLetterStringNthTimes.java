package hackerRankChallenges;

import java.util.Arrays;

public class RepeatLetterStringNthTimes {

    public static long repeatedString(String s, long n) {

        if (s.length() == 1 && s.charAt(0) == 'a') return n;

        if (s.length() > n) {
            return Arrays.stream(s.substring(0, (int) n).split("")).filter(letter -> letter.equals("a")).count();
        }

        long multCount = n / s.length(); // see how many times to multiple the string to have a full count of the letter count.
        long fullLengthLetterCount = Arrays.stream(s.split("")).filter(letter -> letter.equals("a")).count()*multCount; // find the count of letters, then multiple the necessary times.

        long remainder = n % (s.length()*multCount); // if there is a remainder, we only need up to that letter position, once.
        long remainderCount = Arrays.stream(s.substring(0, (int) remainder).split(""))
                .filter(letter -> letter.equals("a")).count();

        return fullLengthLetterCount+remainderCount;
    }

}

