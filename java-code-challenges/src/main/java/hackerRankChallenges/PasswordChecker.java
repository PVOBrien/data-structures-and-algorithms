package hackerRankChallenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {

    private static String thePassword;

    public static int minimumNumber(int n, String password) {
        thePassword = password;
        int minimumPw = 0;
        String numbers = "\\d";
        String lower_case = "[a-z]";
        String upper_case = "[A-Z]";
        String special_characters = "[!@#$%^&*()+-]";

        if (patternCheck(numbers)) minimumPw++;
        if (patternCheck(special_characters)) minimumPw++;
        if (patternCheck(lower_case)) minimumPw++;
        if (patternCheck(upper_case)) minimumPw++;

        if (6 - password.length() > minimumPw) {
            minimumPw = 6 - password.length();
        }
        return minimumPw;
    }

    private static boolean patternCheck(String passedInPattern) {
        Pattern pattern = Pattern.compile(passedInPattern);
        Matcher matcher = pattern.matcher(thePassword);
        return !matcher.find();
    }
}


//        if (!matcher.find()){
//                System.out.println(message);
//                return true;
//                }else{
//                return false;
//                }