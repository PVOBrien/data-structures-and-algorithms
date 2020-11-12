package graph;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.Assert.*;


public class GraphTest {

    @Test
    public void createGraphNodeTest(){
        Graph.GraphNode<Integer> graphNode = new Graph.GraphNode<>();
        graphNode.setValue(10);
        assertEquals("This is a graph's vertex: ", "10", graphNode.getValue().toString());
    }

    @Test
    public void createGraphAddNodeTest(){
        Graph.GraphNode<Integer> graphNode = new Graph.GraphNode<>();
        graphNode.setValue(10);
        Graph graph = new Graph();
        assertEquals("this is an graph w basically nothing in it.", "Graph{vertexes=[]}", graph.toString());
        graph.getVertexes().add(graphNode);
        graph.addNode(15);
        assertEquals("Now it does have a GraphNode in it.", "Graph{vertexes=[GraphNode{value=15, edges=[]}, GraphNode{value=10, edges=[]}]}", graph.toString());
    }

    @Test
    public void createBidirectionalEdgeTest(){
        Graph.GraphNode<Integer> graphNodeOne = new Graph.GraphNode<>();
        graphNodeOne.setValue(1);
        Graph.GraphNode<Integer> graphNodeTwo = new Graph.GraphNode<>();
        graphNodeTwo.setValue(14);
        Graph graph = new Graph();
        graph.getVertexes().add(graphNodeOne);
        graph.getVertexes().add(graphNodeTwo);
        graph.addEdge(graphNodeOne, graphNodeTwo, 6);
        assertEquals("two vertices, connected both ways.","Graph{vertexes=[GraphNode{value=1, edges=[Edge{origin=1, destination=14}]}, GraphNode{value=14, edges=[Edge{origin=14, destination=1}]}]}", graph.toString());
    }

    @Test
    public void getNodesTest(){
        Graph.GraphNode<Integer> graphNodeOne = new Graph.GraphNode<>();
        graphNodeOne.setValue(1);
        Graph.GraphNode<Integer> graphNodeTwo = new Graph.GraphNode<>();
        graphNodeTwo.setValue(14);
        Graph graph = new Graph();
        graph.getVertexes().add(graphNodeOne);
        graph.getVertexes().add(graphNodeTwo);
        graph.addEdge(graphNodeOne, graphNodeTwo, 6);
        Object[] verticesArray = graph.getVertexes().toArray();
        assertEquals("This is 2 vertices graph.", 2, graph.getVertexes().size());
        Set<Graph.GraphNode> results = graph.getVertexes();
        ArrayList<Graph.GraphNode<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(graphNodeOne);
        expectedResults.add(graphNodeTwo);
        assertTrue(results.containsAll(expectedResults));
    }

    @Test
    public void getNeighborsTest() {
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
        assertEquals("Here are some neighbors!", "[Neighbor{weight=14, destination=6}, Neighbor{weight=23, destination=10}]", graph.getNeighbors(graphNodeOne).toString()); // TODO the nature of hashmaps is making these values switch. How to write a test to just ensure that both are included, not necessarily in that order?
        assertEquals("This is 2 vertices graph.", 3, graph.getVertexes().size());
        Collection<Graph.GraphNode<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(graphNodeOne);
        expectedResults.add(graphNodeTwo);
        expectedResults.add(graphNodeThree);
    }

    @Test
    public void breadthFirstTraversalTest() {
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
        LinkedList<Integer> results = graph.breadthFirstTraversal(graphNodeOne);
        ArrayList<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(1);
        expectedResults.add(14);
        expectedResults.add(23);
        System.out.println(expectedResults.toString());
        assertTrue(results.containsAll(expectedResults) && expectedResults.containsAll(results));
    }

    @Test
    public void bftExceptionTest() {
        Graph.GraphNode<Integer> graphNodeOne = new Graph.GraphNode<>();
        Graph graph = new Graph();
        graph.getVertexes().add(graphNodeOne);
        assertThrows(Exception.class, () -> graph.breadthFirstTraversal(graphNodeOne));
    }

    @Test
    public void preOrderDepthTest() {
        GetEdge graph = new GetEdge();
        Graph.GraphNode<String> pandora = new Graph.GraphNode<>();
        Graph.GraphNode<String> metroville = new Graph.GraphNode<>();
        Graph.GraphNode<String> arendelle = new Graph.GraphNode<>();
        Graph.GraphNode<String> monstropolis = new Graph.GraphNode<>();
        Graph.GraphNode<String> naboo = new Graph.GraphNode<>();
        Graph.GraphNode<String> narnia = new Graph.GraphNode<>();
        pandora.setValue("Pandora");
        metroville.setValue("Metroville");
        arendelle.setValue("Arendelle");
        monstropolis.setValue("Monstropolis");
        naboo.setValue("Naboo");
        narnia.setValue("Narnia");
        graph.addEdge(pandora, arendelle, 150);
        graph.addEdge(pandora, metroville, 82);
        graph.addEdge(arendelle, metroville, 99);
        graph.addEdge(arendelle, monstropolis, 42);
        graph.addEdge(monstropolis, metroville, 105);
        graph.addEdge(monstropolis, naboo, 73);
        graph.addEdge(metroville, naboo, 26);
        graph.addEdge(metroville, narnia, 250);
        graph.addEdge(narnia, naboo, 37);
        graph.getVertexes().add(pandora);
        graph.getVertexes().add(metroville);
        graph.getVertexes().add(arendelle);
        graph.getVertexes().add(monstropolis);
        graph.getVertexes().add(naboo);
        graph.getVertexes().add(narnia);
        ArrayList<String> results = graph.depthFirstPreOrder(pandora);
        ArrayList<String> expectedResults = new ArrayList<>();
        expectedResults.add("Pandora");
        expectedResults.add("Arendelle");
        expectedResults.add("Metroville");
        expectedResults.add("Monstropolis");
        expectedResults.add("Naboo");
        expectedResults.add("Narnia");
        Assert.assertTrue(results.containsAll(expectedResults) && expectedResults.containsAll(results));
    }

    @Test
    public void straightForwardDepthFirstTest() {
        Graph.GraphNode<String> graphNodeOne = new Graph.GraphNode<>();
        Graph.GraphNode<String> graphNodeTwo = new Graph.GraphNode<>();
        Graph.GraphNode<String> graphNodeThree = new Graph.GraphNode<>();
        graphNodeOne.setValue("1");
        graphNodeTwo.setValue("14");
        graphNodeThree.setValue("23");
        Graph graph = new Graph();
        graph.getVertexes().add(graphNodeOne);
        graph.getVertexes().add(graphNodeTwo);
        graph.getVertexes().add(graphNodeThree);
        graph.addEdge(graphNodeOne, graphNodeTwo, 6);
        graph.addEdge(graphNodeTwo, graphNodeThree, 10);
        ArrayList<String> results = graph.depthFirstPreOrder(graphNodeOne);
        assertEquals("This is straightforward and correct.", "[1, 14, 23]", results.toString());
    }
}
