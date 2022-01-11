package hackerRankChallenges;

import java.util.ArrayList;
import java.util.List;

public class dynamicArrayHm {

    public static int  dynamicArray(int n, List<List<Integer>> queries) { //List<Integer>
        // https://www.hackerrank.com/challenges/dynamic-array/problem
        // answer modelled from this https://www.hackerrank.com/challenges/dynamic-array/forum/comments/255447
        int lastAns = 0;
        ArrayList<Integer> lastAnsAL = new ArrayList<>();

        /* Create 2-D ArrayList */
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lists.add(new ArrayList<>());
        }

        System.out.println("Lists: " + lists);
        /* Perform Q Queries */
        for (List<Integer> query : queries) {
            int queryType = query.get(0);
            System.out.println("queryType: " + queryType);
            int qNumOne = query.get(1);
            System.out.println("qNumOne: " + qNumOne);
            int qNumTwo = query.get(2);
            System.out.println("qNumTwo: " + qNumTwo);
            ArrayList<Integer> targetSeq = lists.get((qNumOne ^ lastAns) % n);
            System.out.println("targetSeq: " + targetSeq);
            if (queryType == 1) {
                targetSeq.add(qNumTwo);
            } else if (queryType == 2) {
                lastAns = targetSeq.get(qNumTwo % targetSeq.size());
                System.out.println("lastAns: " + lastAns);
                lastAnsAL.add(lastAns);
            }
        }

    return lastAnsAL.get(0);

    }
}