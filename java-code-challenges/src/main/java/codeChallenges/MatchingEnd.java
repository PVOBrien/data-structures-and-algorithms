package codeChallenges;

public class MatchingEnd {
    public static boolean solution(String str, String ending) {

        if (str.length() == 0 || ending.length() > str.length()) return false;
        return ending.equals(str.substring(str.length()-ending.length()));

    }
}
