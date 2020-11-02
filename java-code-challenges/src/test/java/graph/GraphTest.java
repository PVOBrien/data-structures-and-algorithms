package graph;

import org.junit.Test;


import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;


public class GraphTest {

    @Test
    public void createGraphNode(){
        Graph.GraphNode<Integer> graphNode = new Graph.GraphNode<>();;
        graphNode.setValue(10);
        System.out.println(graphNode.getValue());
        assertEquals("This is a graph's vertex: ", "10", graphNode.getValue().toString());
    }

    @Test
    public void createGraphAddNode(){
        Graph.GraphNode<Integer> graphNode = new Graph.GraphNode<>();
        graphNode.setValue(10);
        Graph graph = new Graph();
        System.out.println(graph);
        assertEquals("this is an graph w basically nothing in it.", "Graph{vertexes=[]}", graph.toString());
        System.out.println(graphNode.toString());
        graph.getVertexes().add(graphNode);
        assertEquals("Now it does have a GraphNode in it.", "Graph{vertexes=[GraphNode{value=10, edges=[]}]}", graph.toString());
    }

    @Test
    public void createBidirectionalEdge(){
        Graph.GraphNode<Integer> graphNodeOne = new Graph.GraphNode<>();
        graphNodeOne.setValue(1);
        Graph.GraphNode<Integer> graphNodeTwo = new Graph.GraphNode<>();
        graphNodeTwo.setValue(14);
        Graph graph = new Graph();
        graph.getVertexes().add(graphNodeOne);
        graph.getVertexes().add(graphNodeTwo);
        graph.addEdge(graphNodeOne, graphNodeTwo, 6);
        System.out.println(graph);
        assertEquals("two vertices, connected both ways.","Graph{vertexes=[GraphNode{value=1, edges=[Edge{origin=1, destination=14}]}, GraphNode{value=14, edges=[Edge{origin=14, destination=1}]}]}", graph.toString());
    }

    @Test
    public void getNodes(){
        Graph.GraphNode<Integer> graphNodeOne = new Graph.GraphNode<>();
        graphNodeOne.setValue(1);
        Graph.GraphNode<Integer> graphNodeTwo = new Graph.GraphNode<>();
        graphNodeTwo.setValue(14);
        Graph graph = new Graph();
        graph.getVertexes().add(graphNodeOne);
        graph.getVertexes().add(graphNodeTwo);
        graph.addEdge(graphNodeOne, graphNodeTwo, 6);
        Object[] verticesArray = graph.getVertexes().toArray();
        System.out.println(Arrays.toString(verticesArray));
        assertEquals("This is 2 vertices graph.", 2, graph.getVertexes().size());
        assertEquals("here are a graph's nodes.", "[GraphNode{value=1, edges=[Edge{origin=1, destination=14}]}, GraphNode{value=14, edges=[Edge{origin=14, destination=1}]}]", Arrays.toString(verticesArray)); // This line breaks the full test suite, but will pass if it is only tested.
    }

    @Test
    public void getNeighbors() {
        Graph.GraphNode<Integer> graphNodeOne = new Graph.GraphNode<>();
        Graph.GraphNode<Integer> graphNodeTwo = new Graph.GraphNode<>();
        Graph.GraphNode<Integer> graphNodeThree = new Graph.GraphNode<>();
        graphNodeOne.setValue(1);
        graphNodeTwo.setValue(14);
        graphNodeThree.setValue(23);
        Graph graph = new Graph();
        graph.getVertexes().add(graphNodeOne);
        graph.getVertexes().add(graphNodeTwo);
        graph.getVertexes().add(graphNodeThree);
        graph.addEdge(graphNodeOne, graphNodeTwo, 6);
        graph.addEdge(graphNodeOne, graphNodeThree, 10);
        assertEquals("Here are some neighbors!", "[Neighbor{weight=23, destination=10}, Neighbor{weight=14, destination=6}]", graph.getNeighbors(graphNodeOne).toString()); // TODO the nature of hashmaps is making these values switch. How to write a test to just ensure that both are included, not necessarily in that order?
        assertEquals("This is 2 vertices graph.", 3, graph.getVertexes().size());
    }

}
