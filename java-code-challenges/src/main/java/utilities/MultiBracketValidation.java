package utilities;

import java.util.regex.Pattern;

public class MultiBracketValidation {


    public static boolean testForMirrors(String toTest){
        if (toTest.length() == 0 || Pattern.matches("[})\\]]", Character.toString(toTest.charAt(0)))) return false;

        String charToCheck;

        for (int i = 0; i < toTest.length(); i++) {
//            if (i == toTest.length()-1) return false; // TODO turn on when passing in actual string
                charToCheck = toTest.substring(i, i + 1);
            if (Pattern.matches("[\\[{(]", charToCheck)) { // this returns true.
                switch (charToCheck) {
                    case "{" :
                                System.out.println("Checking for {}" + toTest);
                                for (int j = 0; j < toTest.length(); j++) {
                                    String endChar = Character.toString(toTest.charAt(j));
                                    if (Pattern.matches("[(\\[\\)\\]]", endChar)) return false;
                                    if (endChar.equals("}")) { // Strings are tested with .equals("") not ==
                                        toTest = removeChar(toTest, j);
                                        toTest = removeChar(toTest, i);
                                        System.out.println("Here is one less pair" + toTest);
//                                        return true;
                                    } else {
                                        System.out.println("here we are.");
                                    }
                                }
                    case "(" :
                                System.out.println("Checking for ()" + toTest);
                                for (int j = 0; j < toTest.length(); j++) {
                                    String endChar = Character.toString(toTest.charAt(j));
                                    if (Pattern.matches("[{\\[\\]}]", endChar)) return false;
                                    if (endChar.equals("}")) { // Strings are tested with .equals("") not ==
                                        toTest = removeChar(toTest, j);
                                        toTest = removeChar(toTest, i);
                                        System.out.println("Here is one less pair" + toTest);
        //                                        return true;
                                    } else {
                                        return false;
                                    }
                                }
                    case "[" : charToCheck = "[";
                            // CODE
                }
            }
        }
        return true;
    }

    private static String removeChar(String toChange, Integer whereToSlice) { // got this helper from here https://stackoverflow.com/questions/13386107/how-to-remove-single-character-from-a-string
        String front = toChange.substring(0, whereToSlice);
        String back = toChange.substring(whereToSlice+1);
        return front + back;
    }

}

