package codeChallenges;

import java.util.regex.Pattern;

public class SimpleRegex {

    public static boolean validatePin (String pin) {
        return Pattern.matches("\\d{4}", pin) || Pattern.matches("\\d{6}", pin);
    }

}
