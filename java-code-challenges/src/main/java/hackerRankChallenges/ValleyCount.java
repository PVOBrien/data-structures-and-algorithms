package hackerRankChallenges;

public class ValleyCount {

    public static int valleyCount(int steps, String path) {
        boolean isValley = false;
        int valleyCount = 0;
        int height = 0;

        for (char thisChar : path.toCharArray()) {
            if (thisChar == 'D') height--;
            if (thisChar == 'U') height++;

            if (height < 0 && !isValley) {
                isValley = true;
                valleyCount++;
            }

            if (height == 0 && isValley) isValley = false;
        }

        return valleyCount;
    }
}
