package graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;


public class GraphTest {

    @Test
    public void createGraphNodeTest(){
        Graph.GraphNode<Integer> graphNode = new Graph.GraphNode<>();
        graphNode.setValue(10);
//        System.out.println(graphNode.getValue());
        assertEquals("This is a graph's vertex: ", "10", graphNode.getValue().toString());
    }

    @Test
    public void createGraphAddNodeTest(){
        Graph.GraphNode<Integer> graphNode = new Graph.GraphNode<>();
        graphNode.setValue(10);
        Graph graph = new Graph();
//        System.out.println(graph);
        assertEquals("this is an graph w basically nothing in it.", "Graph{vertexes=[]}", graph.toString());
//        System.out.println(graphNode.toString());
        graph.getVertexes().add(graphNode);
        graph.addNode(15);
        assertEquals("Now it does have a GraphNode in it.", "Graph{vertexes=[GraphNode{value=10, edges=[]}, GraphNode{value=15, edges=[]}]}", graph.toString());
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
//        System.out.println(graph);
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
//        System.out.println(Arrays.toString(verticesArray));
        assertEquals("This is 2 vertices graph.", 2, graph.getVertexes().size());
        assertEquals("here are a graph's nodes.", "[GraphNode{value=1, edges=[Edge{origin=1, destination=14}]}, GraphNode{value=14, edges=[Edge{origin=14, destination=1}]}]", Arrays.toString(verticesArray)); // This line breaks the full test suite, but will pass if it is only tested.
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
        assertEquals("Here are results.", "[1, 14, 23]", results.toString());
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
        assertEquals("This is all of them.", "[Pandora, Metroville, Naboo, Monstropolis, Arendelle, Narnia]", results.toString());
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
