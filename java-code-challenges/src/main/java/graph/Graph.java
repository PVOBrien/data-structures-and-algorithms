package graph;

import java.util.*;

public class Graph {

    public Graph() {}
    private Set<GraphNode> visited = new HashSet<>();

    private final Set<GraphNode> vertexes = new HashSet<>(); // it's a HASHset, not just a Set. :facepalm:
    public Set<GraphNode> getVertexes() { return vertexes; }
//    public Map<String, GraphNode> mappedVertexes; TODO: this is a better way to store vertices for retrieval (in most cases).

    public void addNode(int value) {
        GraphNode node = new GraphNode();
        node.setValue(value);
        vertexes.add(node);
    }

    public void addNode(String value) {
        GraphNode node = new GraphNode();
        node.setValue(value);
        vertexes.add(node);
    }

    public static class GraphNode<T> {

        private T value;
        private final Set<Edge> edges = new HashSet<>();

        public Set<Edge> getEdges() { return edges; }
//        public void setEdges(Set<Edge> edges) { this.edges = edges; }

        public T getValue() { return value;}
        public void setValue(T value) { this.value = value; }

        @Override
        public String toString() {
            return "GraphNode{" + "value=" + value + ", edges=" + edges + '}';
        }
    }

    public  class Edge{

        private GraphNode origin;
        private GraphNode destination;
        private Integer weight;

        public Edge(GraphNode origin, GraphNode destination, int weight) {
            this.origin = origin;
            this.destination = destination;
            this.weight = weight;
        }

        public GraphNode getOrigin() { return origin; }
        public void setOrigin(GraphNode origin) { this.origin = origin; }

        public GraphNode getDestination() { return destination; }
        public void setDestination(GraphNode destination) { this.destination = destination; }

        public Integer getWeight() { return weight; }
        public void setWeight(Integer weight) { this.weight = weight; }

        @Override public String toString() {
            return "Edge{" + "origin=" + origin.getValue() + ", destination=" + destination.getValue() + '}';
        }
    }

    public void addEdge(GraphNode origin, GraphNode destination, int weight){
        Edge edgeOne = new Edge(origin, destination, weight);
        Edge edgeTwo = new Edge(destination, origin, weight);
        origin.getEdges().add(edgeOne);
        destination.getEdges().add(edgeTwo);
    }

    private class Neighbor<T> {

        private Integer weight;
        private T destination;

        public Neighbor(Integer weight, T destination) {
            this.weight = weight;
            this.destination = destination;
        }

        public Integer getWeight() { return weight; }
        public void setWeight(Integer weight) { this.weight = weight; }

        public T getDestination() { return destination; }
        public void setDestination(T destination) { this.destination = destination; }

        @Override
        public String toString() {
            return "Neighbor{" +  "weight=" + weight + ", destination=" + destination + '}';
        }
    }

    public ArrayList<Neighbor> getNeighbors(GraphNode node) {
        ArrayList<Edge> neighbors = new ArrayList<>(node.getEdges());
        ArrayList<Neighbor> destinations = new ArrayList<>();
        for (Edge neighbor : neighbors) {
//            System.out.println("Here be a destination: " + neighbors.get(i).getDestination().getValue() + " and it's weight: " + neighbors.get(i).getWeight());
            Neighbor thisNeighbor = new Neighbor((Integer) neighbor.getDestination().getValue(), neighbor.getWeight());
            destinations.add(thisNeighbor);
        }
        return destinations;
    }

    public LinkedList<Integer> breadthFirstTraversal (GraphNode nodeToCheck) { // credit to: https://github.com/emd5/data-structures-and-algorithms-java/blob/master/src/main/java/graph/Graph.java

        LinkedList<Integer> resultList = new LinkedList<>(); // TODO: create a full list of nodes to check against that each were visited.
        HashSet<GraphNode> visited = new HashSet<>();

        if (nodeToCheck.getValue() == null){
            throw new NullPointerException("Nothing here.");
        }

        Queue queue = new LinkedList();
        queue.add(nodeToCheck);
        visited.add(nodeToCheck);

        while (!queue.isEmpty()) {
            GraphNode nodeBeingChecked = (GraphNode) queue.remove();
            resultList.add((Integer) nodeBeingChecked.getValue());

            for (Edge neighbor: (HashSet<Edge>) nodeBeingChecked.getEdges()){
                if(!visited.contains(neighbor.destination)){
                    queue.add(neighbor.getDestination());
                    visited.add(neighbor.getDestination());
                }
            }
        }
        return resultList;
    }

    public ArrayList<String> depthFirstPreOrder (GraphNode nodeToStart) { // Code referenced from: https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/#:~:text=%20Solution%3A%20%201%20Approach%3A%20Depth-first%20search%20is,node%20as%20visited%20and%20print%20the...%20More%20
            visited.clear();
            ArrayList<String> depthFirst = new ArrayList<>();
            depthFirstPreOrderHelper(nodeToStart, depthFirst);
            return depthFirst;
    }

    private ArrayList<String> depthFirstPreOrderHelper (GraphNode nodeToCheck, ArrayList<String> visitedInThisOrder) {
        visited.add(nodeToCheck);
        visitedInThisOrder.add((String) nodeToCheck.getValue()); // has to be cast because my node is generic.

        for (Edge edge : (HashSet<Edge>) nodeToCheck.getEdges()) {
            if (!visited.contains(edge.getDestination())) {
                depthFirstPreOrderHelper(edge.destination, visitedInThisOrder);
            }
        }
        return visitedInThisOrder;
    }

    // TODO: https://www.programiz.com/dsa/graph-dfs check this for iterative approach.


    @Override
    public String toString() {
        return "Graph{" + "vertexes=" + vertexes + '}';
    }
}
