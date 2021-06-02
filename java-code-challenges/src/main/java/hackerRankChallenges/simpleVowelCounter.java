package hackerRankChallenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class simpleVowelCounter {

    public static int getCount(String str) {
        int vowelsCount = 0;
        System.out.println("str: " + str);

        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher;

        for (int i = 0; i < str.length(); i++) {
            CharSequence charSeq = str.subSequence(i,i+1);
            matcher = pattern.matcher(charSeq);
            if (matcher.matches()) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
