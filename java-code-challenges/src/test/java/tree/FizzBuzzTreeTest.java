package tree;

import org.junit.Test;
import utilities.NodeGenericForQueue;
import static org.junit.Assert.*;


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
        assertThrows("It is an empty tree", Exception.class, ()->FizzBuzzTree.fizzBuzzTree(tree));

    }

    @Test
    public void fizzBuzzTreeTestOneRoot() throws Exception {
        Gtree<GtreeNode> tree = new Gtree<>();
        GtreeNode<String> thisOne = new GtreeNode<>();
        thisOne.setValue("500");
        tree.setRoot(thisOne);
        assertEquals("Gtree{root=GtreeNode{value=500, left=null, right=null}}", tree.toString());
    }

//    @Test
//    public void fizzBuzzTreeTestThreeNodes() throws Exception {
//        Gtree<GtreeNode> tree = new Gtree();
////        tree.setRoot("500");
//        tree.add("15");
//        tree.add("3");
//        assertEquals("root=GtreeNode{value=buzz, left=GtreeNode{value=fizzbuzz, left=null, right=null}, right=GtreeNode{value=fizz, left=null, right=null}}", FizzBuzzTree.fizzBuzzTree(tree).toString());
//    }
//
//
//    @Test
//    public void fizzBuzzTreeTestSixNodes() throws Exception {
//        Gtree tree = new Gtree();
//        tree.add("500");
//        tree.add("15");
//        tree.add("3");
//        tree.add("1");
//        tree.add("6");
//        tree.add("7");
//        assertEquals("root=GtreeNode{value=buzz, left=GtreeNode{value=fizzbuzz, left=GtreeNode{value=1, left=null, right=null}, right=GtreeNode{value=fizz, left=null, right=null}}, right=GtreeNode{value=fizz, left=GtreeNode{value=7, left=null, right=null}, right=null}}", FizzBuzzTree.fizzBuzzTree(tree).toString());
//    }

}