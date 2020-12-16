package codeChallenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DubWordCleanUp {

    public static String SongDecoder (String song)
    {
        Pattern wubPattern = Pattern.compile("(WUB)+"); // have to put a phrase in parentheses then the + in order for it to take.
        Matcher matcher = wubPattern.matcher(song);
        String result = matcher.replaceAll( " ");

//        Pattern spaces = Pattern.compile("\\s+");
//        Matcher spaceMatcher = spaces.matcher(result);
//        result = spaceMatcher.replaceAll(" ");

        return result.stripLeading().stripTrailing();
    }

}
