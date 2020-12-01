package codeChallenges;

//import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class AdjacencyMatrix {

    HashMap<Integer, TestGraphNode> map = new HashMap<>();

    public class Edge {
        TestGraphNode origin;
        TestGraphNode destination;
    }

    public class TestGraphNode {
        Integer value;
        HashSet<Edge> edges;
    }

    public void addVertex(Integer newValue) {
        TestGraphNode newTestGraphNode = new TestGraphNode();
        newTestGraphNode.value = newValue;
        map.put(newValue, newTestGraphNode);
    }

    public void createEdge(TestGraphNode origin, TestGraphNode destination) {
        Edge edge1 = new Edge();
        edge1.destination = destination;
        edge1.origin = origin;
        origin.edges.add(edge1);
        Edge edge2 = new Edge();
        edge2.destination = origin;
        edge2.origin = destination;
        destination.edges.add(edge2);
    }

    public void createByAdjacencyList(Integer[][] adjacencyList) {
        for (int i = 0; i < adjacencyList.length; i++) {
            TestGraphNode testGraphNode = new TestGraphNode();
            testGraphNode.value = i;
        }
        for (int i = 0; i < adjacencyList.length; i++) {
            for (int j = 0; j < adjacencyList[i].length; j++) {
                if (adjacencyList[i][j] == 1) {
                    createEdge(map.get(i), map.get(j));
                }
            }
        }
    }

}
