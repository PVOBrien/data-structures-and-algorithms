package graph;

import java.util.*;

public class Graph {

    public Graph() {}

    private Set<GraphNode> vertexes = new HashSet<>(); // it's a HASHset, not just a Set. :facepalm:
    public Set<GraphNode> getVertexes() { return vertexes; }

    public void addNode(int value) {
        GraphNode<Integer> node = new GraphNode();
        node.setValue(value);
        vertexes.add(node);
    }

    public static class GraphNode<T> {
        private T value;

        private Set<Edge> edges = new HashSet<>();

        public Set<Edge> getEdges() { return edges; }
        public void setEdges(Set<Edge> edges) { this.edges = edges; }

        public T getValue() { return value;}
        public void setValue(T value) { this.value = value; }

        @Override
        public String toString() {
            return "GraphNode{" + "value=" + value + ", edges=" + edges + '}';
        }
    }

    private class Edge{

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
        for (int i = 0; i < neighbors.size(); i++) {
//            System.out.println("Here be a destination: " + neighbors.get(i).getDestination().getValue() + " and it's weight: " + neighbors.get(i).getWeight());
            Neighbor thisNeighbor = new Neighbor((Integer) neighbors.get(i).getDestination().getValue(), neighbors.get(i).getWeight());
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

    @Override
    public String toString() {
        return "Graph{" + "vertexes=" + vertexes + '}';
    }
}
