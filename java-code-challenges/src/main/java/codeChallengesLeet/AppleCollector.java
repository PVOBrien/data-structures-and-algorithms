package codeChallengesLeet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AppleCollector { // https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/
    HashSet<int[]> visitedRoutes = new HashSet<>();
    ArrayList<int[]> currentPath = new ArrayList<>();
    HashSet<String> routeWApple = new HashSet<>();
    int[][] globalEdges;

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        int initialCount = (int) hasApple.stream().filter(apple -> apple).count();
        if (initialCount == 0 || hasApple.get(0)) return initialCount;

        globalEdges = edges;
        for (int i = 0; i < globalEdges.length; i++) {
            if (!visitedRoutes.contains(edges[i])) {
                visitedRoutes.add(edges[i]);
                applePathFinder(currentPath, edges[i], hasApple, n);
            }
        }
        return routeWApple.size();
    }

    public boolean applePathFinder(ArrayList<int[]> followedPath, int[] thisEdge, List<Boolean> hasApple, int n) {
        boolean isApple = false;
        if (thisEdge[1] < n) {
            followedPath.add(thisEdge);
            for (int i = 0; i < globalEdges.length; i++) {
                if (globalEdges[i][0] == thisEdge[1]) {
                    isApple = applePathFinder(followedPath, globalEdges[i], hasApple, n);
                }
            }
        }
        if (hasApple.get(thisEdge[1])) isApple = true;
        if (isApple) {
            int[] tempArr = {thisEdge[1], thisEdge[0]};
            routeWApple.add(Arrays.toString(thisEdge));
            routeWApple.add(Arrays.toString(tempArr));
        }
        System.out.println();
        routeWApple.forEach(item -> System.out.println(Arrays.toString(item)));
        return isApple;
    }
}
//  Input: n = 7, edges = [[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], hasApple = [false,false,true,false,true,true,false]
//  Output: 8