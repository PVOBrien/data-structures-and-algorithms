package codeChallenges;

public class StringNumbersTogether {

    public static String rangeExtraction(int[] arr) {
        int current, betweenLimitToCheck, betweenCounter = 0;
        boolean throughTrue = false;
        StringBuilder arrString = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            current = arr[i];

            if (i + 1 < arr.length) { // if there are more numbers to check...
                betweenLimitToCheck = arr[i];

                if (arr[i + 1] == betweenLimitToCheck + 1) {
                    if (!throughTrue) arrString.append(current); // print the current number out.
                    throughTrue = true;
                    betweenCounter++;
                } else if (arr[i + 1] != betweenLimitToCheck + 1 && throughTrue) {
                    Character eitherOr = betweenCounter < 2 ? ',' : '-';
                    arrString.append(String.format("%c%d%c", eitherOr, current, ',')); // can't do standard concatenation on .append(), otherwise it does math if there's a digit involved.
                    throughTrue = false;
                    betweenCounter = 0;
                } else {
                    arrString.append(String.format("%d%c", current,','));
                }
            } else {
                if (throughTrue && betweenCounter > 1) {
                    arrString.append(String.format("%c%d", '-',current));
                } else if (throughTrue && betweenCounter < 2) {
                    arrString.append(',');
                }
                arrString.append(current);
            }
        }
        return arrString.toString();
    }
}