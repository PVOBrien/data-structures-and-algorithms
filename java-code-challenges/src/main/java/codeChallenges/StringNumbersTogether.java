package codeChallenges;

import java.util.Arrays;

public class StringNumbersTogether {

    public static String rangeExtraction(int[] arr) {
        int current;
        boolean throughTrue = false;
        int betweenLimitToCheck;
        int betweenLimit = 0;

        StringBuilder arrString = new StringBuilder();
        System.out.println("here's arr: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            current = arr[i];

            if (i + 1 < arr.length) { // if there are more numbers to check...
                betweenLimitToCheck = arr[i];

                if (arr[i + 1] == betweenLimitToCheck + 1) {
                    if (!throughTrue) arrString.append(current); // print the current number out.
                    betweenLimit = betweenLimitToCheck;
                    throughTrue = true;
//                    System.out.println("here's betweenLimit: " + betweenLimit);
                } else if (arr[i + 1] != betweenLimitToCheck + 1 && throughTrue) {
                    System.out.println("w/in One Range Hit.");
                    System.out.println("The last to check: " + arr[i-1]);
                    System.out.println("The betweenLimit in the Range:" + betweenLimit);
                    if (arr[i-1] == betweenLimit-1) { // TODO: if the numbers are only 1 difference, then it should still just be a comma.
//                        arrString.append(",");
//                        arrString.append(current);
//                        throughTrue = false;
                    } else {
//                        System.out.println("bump");
                        arrString.append('-'); // TODO: concatenate these all after getting correct answer.
                        arrString.append(current);
                        arrString.append(",");
                        throughTrue = false;
                    }
                } else {
                    System.out.println("else hit: " + betweenLimit);
                    arrString.append(current);
                    arrString.append(",");
                }
            } else {
                if (throughTrue) {
                    arrString.append("-" + current);
                } else {
                    arrString.append(current);
                }
            }
        }
        System.out.println("here's the arrString: " + arrString.toString());
        return arrString.toString();
    }

}
