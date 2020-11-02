package graph;

import java.util.*;

public class Graph {

    public Graph() {}

    private final Set<GraphNode> vertexes = new HashSet<>(); // it's a HASHset, not just a Set. :facepalm:
    public Set<GraphNode> getVertexes() { return vertexes; }

    public void addNode(int value) {
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

    private static class Edge{

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

//        Iterator<GraphNode> neighborIterator = node.getEdges().;
//        while (neighborIterator.hasNext()) {
//            neighbors.add();
//            neighborIterator.next();
//        }
//        neighborIterator.forEachRemaining(thing -> neighbors.add((String) thing.)); // Todo: might work? https://learnjava.co.in/java-8-iterator-foreachremaining/ if it did.
//        return neighbors;
        return destinations;
    }

//    public ArrayList<String> breadthFirstTraversal(Graph graph) {
//        Set<String> visitedVertices = new HashSet<>();
////        ArrayList<String> visitedVerticesArrayL;
//        Iterator<GraphNode> graphNodeIterator = (Iterator<GraphNode>) graph.getVertexes();
//        while (graphNodeIterator.hasNext()) {
//            GraphNode currentNode = graphNodeIterator.next();
//            if (!visitedVertices.contains(currentNode.getValue())) {
//                visitedVertices.add(currentNode.getValue().toString());
//            }
//        }
//        return new ArrayList<>(visitedVertices);
//    }

    public LinkedList<Integer> breadthFirstTraversal (GraphNode nodeToCheck) { // credit to: https://github.com/emd5/data-structures-and-algorithms-java/blob/master/src/main/java/graph/Graph.java

        LinkedList<Integer> resultList = new LinkedList<>(); // TODO: create a full list of nodes to check against that each were visited.
        HashSet<GraphNode> visited = new HashSet<>();

        if (nodeToCheck == null){
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

    @Override
    public String toString() {
        return "Graph{" + "vertexes=" + vertexes + '}';
    }
}
