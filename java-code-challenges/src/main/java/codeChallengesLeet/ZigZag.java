package codeChallengesLeet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ZigZag {

    public static String zigZagger(String string, int rows) {
        if (rows==1) return string;
        HashMap<Integer, StringBuilder> zigZagBucketer = new HashMap<>();
        int zagCounter = 0;
        boolean zagUp = false;

        for (int i = 0; i < rows; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            zigZagBucketer.put(i, stringBuilder);
        }

        for (char theChar : string.toCharArray()) {
            zigZagBucketer.get(zagCounter).append(theChar); // https://stackoverflow.com/questions/12134687/how-to-add-element-into-arraylist-in-hashmap
            zagCounter += zagUp ? -1 : 1 ;
            if (zagCounter == 0 || zagCounter == rows - 1) zagUp = !zagUp; // nice.
        }

        return zigZagBucketer.values().stream() // you can just get values from a hashmap!!!
                .reduce(new StringBuilder(), StringBuilder::append)
                .toString();
    }
}

//            if (zagCounter == rows - 1) { // or:
//                zagUp = true;
//            } else if (zagCounter == 0) {
//                zagUp = false;
//            }