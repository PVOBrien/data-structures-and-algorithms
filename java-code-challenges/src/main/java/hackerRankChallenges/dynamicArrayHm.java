package hackerRankChallenges;

import java.util.ArrayList;
import java.util.List;

public class dynamicArrayHm {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // https://www.hackerrank.com/challenges/dynamic-array/problem
        // answer modelled from this https://www.hackerrank.com/challenges/dynamic-array/forum/comments/255447
        int lastAns = 0;
        ArrayList<Integer> lastAnsAL = new ArrayList<>();

        /* Create 2-D ArrayList */
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            lists.add(new ArrayList<>());
        }

        /* Perform Q Queries */
        for (List<Integer> query : queries) {
            int q = query.get(0);
            int x = query.get(1);
            int y = query.get(2);
            ArrayList<Integer> seq = lists.get((x ^ lastAns) % n);
            if (q == 1) {
                seq.add(y);
            } else if (q == 2) {
                lastAns = seq.get(y % seq.size());
                System.out.println(lastAns);
                lastAnsAL.add(lastAns);
            }
        }

    return lastAnsAL;

    }
}