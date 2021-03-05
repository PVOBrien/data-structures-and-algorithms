package codeChallengesLeet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class AppleCollector { // https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/

    HashMap<Integer, int[]> appleRoutes = new HashMap<>();
    HashSet<int[]> visitedRoutes = new HashSet<>();
    HashSet<int[]> routeWApple = new HashSet<>();

        public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
            int initialCount = (int) hasApple.stream().filter(apple -> apple).count();
            if (initialCount == 0 || hasApple.get(0)) return initialCount;

            for (int i = 0; i < hasApple.size(); i++) {
                int edgeFrom = edges[i][1]; // or goingto but...
                for (int j = 0; j < hasApple.size(); j++) {
                    if (edges[j][0] == edgeFrom) {
                        if (hasApple.get(j)) {
                            routeWApple.add(edges[i]);
                            routeWApple.add(edges[j]);
                        }
                        // TODO: recursive helper function to track when the deepest node/hasApple[index] is true, then add to hashset both "going from" and "going to" edges.
                    }
            }
        }
    return 0;
    }
}


//  Input: n = 7, edges = [[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], hasApple = [false,false,true,false,true,true,false]
//  Output: 8