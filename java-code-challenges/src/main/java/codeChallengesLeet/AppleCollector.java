package codeChallengesLeet;

import java.util.*;

// use & understand this solution - https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/discuss/873885/My-Java-Solution-creating-graph-and-doing-DFS
public class AppleCollector { // https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {

        List<List<Integer>> adjacencyList = new ArrayList<>(); // to hold adjacency/routes
        for (int i = 0; i < n; i++) {
            adjacencyList.add(i, new LinkedList<>()); // making the adjacency list
        }
        for (int[] edgeToMake : edges) {
            adjacencyList.get(edgeToMake[0]).add(edgeToMake[1]); // poor man's edgesList...
            adjacencyList.get(edgeToMake[1]).add(edgeToMake[0]); // this is two way, so both can visit both...
        }

        boolean[] visited = new boolean[n]; // where we've been, the size of the # of trees to visit. They all start false
        visited[0] = true; // we start here, so yes.
        return depthFirstSearch(adjacencyList, hasApple, 0, visited); // RECURSION!!!
    }

    private int depthFirstSearch(List<List<Integer>> adjacencyList, List<Boolean> hasApple, int v, boolean[] visited) {
        if (adjacencyList.get(v) == null) return 0;
        int count = 0; // how many routes to go?
        List<Integer> edgesToCheck = adjacencyList.get(v); // where we'll be going...
        for (int child : edgesToCheck) { // we're going down the paths...
            if (!visited[child]) { // this is this specific path, to check this tree... we going DEPTH FIRST.
                visited[child] = true;
                count += depthFirstSearch(adjacencyList, hasApple, child, visited);
            }
        }
        if ((count > 0 || hasApple.get(v)) && v != 0) { // if there is ANY apples down this route... it'll be hit once going up, and once going down
            // OR if there is an apple at this location (poor man's node all messed up),
            // and the node location is not the root (because the root can't be traveled up/down
            count += 2;                                 // then add two to the route necessary to get there.
        }
        return count;
    }

//    int initialCount = (int) hasApple.stream().filter(apple -> apple).count();
//    if (initialCount == 0) return initialCount;

//    HashSet<int[]> visitedRoutes = new HashSet<>();
//    ArrayList<int[]> currentPath = new ArrayList<>();
//    HashSet<String> routeWApple = new HashSet<>();
//    int[][] globalEdges;

//        globalEdges = edges;
//        for (int i = 0; i < globalEdges.length; i++) {
//            if (!visitedRoutes.contains(edges[i])) {
//                visitedRoutes.add(edges[i]);
//                applePathFinder(currentPath, edges[i], hasApple, n);
//            }
//        }
//        return routeWApple.size();
//    }
//
//    public boolean applePathFinder(ArrayList<int[]> followedPath, int[] thisEdge, List<Boolean> hasApple, int n) {
//        boolean isApple = false;
//        if (thisEdge[1] < n) {
//            followedPath.add(thisEdge);
//            for (int i = 0; i < globalEdges.length; i++) {
//                if (globalEdges[i][0] == thisEdge[1]) {
//                    isApple = applePathFinder(followedPath, globalEdges[i], hasApple, n);
//                }
//            }
//        }
//        if (hasApple.get(thisEdge[1])) isApple = true;
//        if (isApple) {
//            int[] tempArr = {thisEdge[1], thisEdge[0]};
//            routeWApple.add(Arrays.toString(thisEdge));
//            routeWApple.add(Arrays.toString(tempArr));
//        }
//        System.out.println(routeWApple.toString());
//        return isApple;
//    }
}