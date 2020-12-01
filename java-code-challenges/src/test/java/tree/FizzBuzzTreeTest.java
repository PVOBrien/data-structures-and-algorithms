package tree;

import org.junit.jupiter.api.Test;
import utilities.NodeGenericForQueue;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTreeTest {

    @Test
    public void fizzingBuzzingTest(){
        NodeGenericForQueue<String> gNode1 = new NodeGenericForQueue<>();
        gNode1.setValue("3");
        NodeGenericForQueue<String> gNode2 = new NodeGenericForQueue<>();
        gNode2.setValue("5");
        NodeGenericForQueue<String> gNode3 = new NodeGenericForQueue<>();
        gNode3.setValue("7");
        NodeGenericForQueue<String> gNode4 = new NodeGenericForQueue<>();
        gNode4.setValue("15");
        assertEquals("This should be Fizz", "fizz", FizzBuzzTree.fizzingBuzzingFunction(gNode1.getValue()));
        assertEquals("This should be Buzz", "buzz", FizzBuzzTree.fizzingBuzzingFunction(gNode2.getValue()));
        assertEquals("This should be 7", "7", FizzBuzzTree.fizzingBuzzingFunction(gNode3.getValue()));
        assertEquals("This should be FizzBuzz", "fizzbuzz", FizzBuzzTree.fizzingBuzzingFunction(gNode4.getValue()));
    }

    @Test
    public void fizzBuzzTreeTestException(){
        Gtree tree = new Gtree();
        assertThrows(Exception.class, ()-> FizzBuzzTree.fizzBuzzTree(tree));
    }

    @Test
    public void fizzBuzzTreeTestOneRoot() throws Exception {
        Gtree<GtreeNode> tree = new Gtree<>();
        GtreeNode<String> thisOne = new GtreeNode<>();
        thisOne.setValue("500");
        tree.setRoot(thisOne);
        assertEquals("Gtree{root=GtreeNode{value=500, left=null, right=null}}", tree.toString());
    }
}