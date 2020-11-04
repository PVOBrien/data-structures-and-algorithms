package graph;

import org.junit.Test;
import static org.junit.Assert.*;

public class GetEdgeTest extends Graph {

    @Test
    public void directFlightHappyCaseTest() {
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

        GetEdge.DirectFlight result = graph.takeATrip(new String[]{"Pandora", "Arendelle"});
        assertEquals("This is a thing.", "DirectFlight{available=true, price=150}", result.toString());
        GetEdge.DirectFlight result2 = graph.takeATrip(new String[]{"Pandora", "Arendelle", "Metroville"});
        assertEquals("happy case #2 is happy", "DirectFlight{available=true, price=249}", result2.toString());
        GetEdge.DirectFlight result3 = graph.takeATrip(new String[]{"Pandora", "Naboo"});
        assertEquals("This is not possible.", "DirectFlight{available=false, price=0}", result3.toString());
        GetEdge.DirectFlight result4 = graph.takeATrip(new String[]{"Pandora", "Arendelle", "Naboo"});
        assertEquals("This too will break", "DirectFlight{available=false, price=0}", result4.toString());
        }

    @Test
    public void directFlightBreakTest() {
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

        GetEdge.DirectFlight result = graph.takeATrip(new String[]{"Pandora", "Arendelle"});
        assertEquals("This is a thing.", "DirectFlight{available=true, price=150}", result.toString());
        GetEdge.DirectFlight result2 = graph.takeATrip(new String[]{"Pandora", "Arendelle", "Metroville"});
        assertEquals("happy case #2 is happy", "DirectFlight{available=true, price=249}", result2.toString());
        GetEdge.DirectFlight result3 = graph.takeATrip(new String[]{"Pandora", "Naboo"});
        assertEquals("This is not possible.", "DirectFlight{available=false, price=0}", result3.toString());
        GetEdge.DirectFlight result4 = graph.takeATrip(new String[]{"Pandora", "Arendelle", "Naboo"});
        assertEquals("This too will break", "DirectFlight{available=false, price=0}", result4.toString());
    }

}
