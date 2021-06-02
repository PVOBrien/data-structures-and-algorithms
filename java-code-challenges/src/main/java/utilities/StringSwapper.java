package utilities;

import java.util.Arrays;

public class StringSwapper {

    public static String swapperBackToFront(String toSwap) {
        StringBuilder revString = new StringBuilder();

        for (int i = 0; i < toSwap.length(); i++) {
            revString.append(toSwap.charAt(toSwap.length()-(i+1)));
        }
        return revString.toString();
    }

    public static String swapperBackToFrontInPlace(String toSwap) { // https://www.codepuppet.com/2013/03/24/reversing-a-string-in-java-in-place/
        char[] revString = toSwap.toCharArray();

        for (int i = 0; i < toSwap.length()/2; i++) {
            Character heldChar = toSwap.charAt(toSwap.length()-(i+1));
            revString[toSwap.length()-(i+1)] = revString[i];
            revString[i] = heldChar;
        }
        return String.valueOf(revString); // https://www.javatpoint.com/how-to-convert-char-array-to-string-in-java
    }

    public static char[] swapperBackToFrontInPlaceCharArray(String toSwap) { // https://www.codepuppet.com/2013/03/24/reversing-a-string-in-java-in-place/
        char[] revString = toSwap.toCharArray();

        for (int i = 0; i < toSwap.length()/2; i++) {
            Character heldChar = toSwap.charAt(toSwap.length()-(i+1));
            revString[toSwap.length()-(i+1)] = revString[i];
            revString[i] = heldChar;
        }
        return revString; // https://www.javatpoint.com/how-to-convert-char-array-to-string-in-java
    }
}
