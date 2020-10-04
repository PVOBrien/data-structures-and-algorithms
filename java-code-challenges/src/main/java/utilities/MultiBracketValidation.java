package utilities;

import java.util.regex.Pattern;

public class MultiBracketValidation {

    public static boolean testForMirrors(String toTest){
        if (toTest.length() == 0) return false;
        String charToCheck;

        for (int i = 0; i < toTest.length(); i++) {
            charToCheck = String.valueOf(toTest.charAt(i));
            if (Pattern.matches("[})\\]]", charToCheck)) return false;
            if (Pattern.matches("[\\[{(]", charToCheck)) {
                switch (charToCheck) {
                    case "{" :
                        for (int j = i; j < toTest.length(); j++) {
                            String endChar = Character.toString(toTest.charAt(j));
                            if (Pattern.matches("[(\\[)\\]]", endChar)) return false;
                            if (endChar.equals("}")) { // Strings are tested with .equals("") not ==
                                toTest = spliceEmptyChar(toTest, j);
                                toTest = spliceEmptyChar(toTest, i);
                                break;
                            }
                        }
                        break;
                    case "(" :
                        for (int j = i; j < toTest.length(); j++) {
                            String endChar = Character.toString(toTest.charAt(j));
                            if (Pattern.matches("[{\\[\\]}]", endChar)) return false;
                            if (endChar.equals(")")) {
                                toTest = spliceEmptyChar(toTest, j);
                                toTest = spliceEmptyChar(toTest, i);
                                break;
                            }
                        }
                        break;
                    case "[" :
                        for (int j = i; j < toTest.length(); j++) {
                            String endChar = Character.toString(toTest.charAt(j));
                            if (Pattern.matches("[({})]", endChar)) return false;
                            if (endChar.equals("]")) {
                                toTest = spliceEmptyChar(toTest, j);
                                toTest = spliceEmptyChar(toTest, i);
                                break;
                            }
                        }
                        break;
                }
            }
        }
        return true;
    }

    private static String spliceEmptyChar(String toChange, Integer whereToSplice) { // got this helper from here https://stackoverflow.com/questions/13386107/how-to-remove-single-character-from-a-string
        String front = toChange.substring(0, whereToSplice);
        String back = toChange.substring(whereToSplice+1);
        return front + " " + back;
    }

}