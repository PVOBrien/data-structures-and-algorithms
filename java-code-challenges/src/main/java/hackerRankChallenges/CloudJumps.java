package hackerRankChallenges;

import java.util.ArrayList;
import java.util.List;

public class CloudJumps {
    public static int jumpingOnClouds(List<Integer> c) {
        ArrayList<Integer> jumps = new ArrayList<>();
        jumps.add(0);
        int jumpCount = 0;
        for (int i = 0; i < c.size()-1;) {
            if (i + 2 < c.size() && c.get(i + 2) != 1) {
                jumps.add(i + 2);
                jumpCount++;
                i += 2;
            } else {
                jumps.add(i + 1);
                jumpCount++;
                i++;
            }
        }
        return jumpCount;
    }
}
