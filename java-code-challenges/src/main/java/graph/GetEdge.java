package graph;

import java.util.Set;

public class GetEdge extends Graph {

    public DirectFlight takeATrip(String[] input){
        int counter = 0;
        GraphNode theNode;
        DirectFlight directFlight = new DirectFlight(false, counter);

        for (int i = 0; i < input.length-1; i++) {
            directFlight.available = false;
            for (GraphNode vertex : this.getVertexes()) {
                if (vertex.getValue().equals(input[i])) {
                    theNode = vertex;
                    Set<Edge> edges = theNode.getEdges();
                    for (Edge edge : edges) {
                        if (edge.getDestination().getValue().equals(input[i+1])) {
                            counter += edge.getWeight();
                            directFlight.available = true;
                            directFlight.price = counter;
                        }
                    }
                    if (!directFlight.available) {
                        directFlight.price = 0;
                        return directFlight;
                    }
                }
            }
        }
        return directFlight;
    }

    public static class DirectFlight {
        boolean available;
        int price;

        public DirectFlight(boolean available, int price) {
            this.available = available;
            this.price = price;
        }

        @Override
        public String toString() {
            return "DirectFlight{" + "available=" + available + ", price=" + price + '}';
        }
    }
}
