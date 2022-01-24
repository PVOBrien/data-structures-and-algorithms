package codeChallenges;

import java.lang.StringBuilder;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CamelCaser { // going to use recursion. if (matcher.matches()) -> recurse, fix, if matcher.matches() ->->-> until return string.
    static String toCamelCase(String s) {
        Pattern pattern = Pattern.compile("[_|-]", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(s);
        StringBuilder returnString = new StringBuilder();

        if (matcher.find()) {
            returnString.append(s);
            return CamelCaser.camelCaseHelper(returnString, pattern, matcher);
        }
        return s;
    }

    private static String camelCaseHelper(StringBuilder sb, Pattern pattern, Matcher matcher) {
        char[] sArray = sb.toString().toCharArray();
        char toUpper = Character.toUpperCase(sArray[matcher.end()]);
        sb.replace(matcher.start(), matcher.end(), Character.toString(toUpper));
        sb.delete(matcher.start() + 1, matcher.end() + 1);
        matcher = pattern.matcher(sb.toString());

        if (matcher.find()) {
            camelCaseHelper(sb, pattern, matcher);
        }
        return sb.toString();
    }
}
