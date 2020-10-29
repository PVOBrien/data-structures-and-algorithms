package leftJoin;

import java.util.*;

public class LeftJoin {

    String[][] returnArr;

    public String[][] leftJoin(HashMap left, HashMap right) {


        returnArr = new String[left.size()][];

        List<String> keys = new ArrayList<>(left.keySet());

//        Iterator<String> leftItrtr = left.keySet().iterator(); //https://howtodoinjava.com/java-hashmap/

//        Set<String> keySet = left.keySet();
//        String [] keys = (String[]) keySet.toArray();

        for (int i = 0; i < left.size(); i++) {
            returnArr[i] = new String[3];
            returnArr[i][0] = keys.get(i);
            returnArr[i][1] = left.get(keys.get(i)).toString();

            if (right.containsKey(keys.get(i))) {
                returnArr[i][2] = right.get(keys.get(i)).toString();
            }
        }
        return returnArr;
    }

    // ==== toString ==== // This only works if it's ON the LeftJoin class.
    @Override
    public String toString() {
        String string = "[ ";
        for (int i = 0; i < returnArr.length; i++) {
            string += "[";
            for (int j = 0; j < returnArr[i].length; j++) {
                if (j > 0) {
                    string += ", ";
                }
                string += returnArr[i][j];
            }
            string += "] ";
        }
        string += "]";
        return string;
    }
}
