package treeIntersection;

import org.junit.Before;
import org.junit.Test;
import tree.GtreeNode;
import tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    tree.Tree tree1 = new Tree();
    tree.Tree tree2 = new Tree();

    @Before
    public void treeCreation() throws Exception {

        GtreeNode<Integer> rootNode = new GtreeNode<>(150);
        tree1.makeRoot(rootNode);
        GtreeNode<Integer> nodeOne = new GtreeNode<>(100);
        GtreeNode<Integer> nodeTwo = new GtreeNode<>(250);
        GtreeNode<Integer> nodeThreeOne = new GtreeNode<>(75);
        GtreeNode<Integer> nodeThreeTwo = new GtreeNode<>(160);
        GtreeNode<Integer> nodeThreeThree = new GtreeNode<>(200);
        GtreeNode<Integer> nodeThreeFour = new GtreeNode<>(350);
        GtreeNode<Integer> nodeFourTwo = new GtreeNode<>(125);
        GtreeNode<Integer> nodeFourThree = new GtreeNode<>(175);
        GtreeNode<Integer> nodeFourFour = new GtreeNode<>(300);
        GtreeNode<Integer> nodeFourFive = new GtreeNode<>(500);
        rootNode.setRight(nodeOne);
        rootNode.setLeft(nodeTwo);
        nodeOne.setLeft(nodeThreeOne);
        nodeOne.setRight(nodeThreeTwo);
        nodeTwo.setLeft(nodeThreeThree);
        nodeTwo.setRight(nodeThreeFour);
        nodeThreeTwo.setLeft(nodeFourTwo);
        nodeThreeTwo.setRight(nodeFourThree);
        nodeThreeFour.setLeft(nodeFourFour);
        nodeThreeFour.setRight(nodeFourFive);

        // Tree 2 Creation

        GtreeNode<Integer> rootNode2 = new GtreeNode<>(42);
        tree2.makeRoot(rootNode2);
        GtreeNode<Integer> nodeOne2 = new GtreeNode<>(100);
        GtreeNode<Integer> nodeTwo2 = new GtreeNode<>(600);
        GtreeNode<Integer> nodeThreeOne2 = new GtreeNode<>(15);
        GtreeNode<Integer> nodeThreeTwo2 = new GtreeNode<>(160);
        GtreeNode<Integer> nodeThreeThree2 = new GtreeNode<>(200);
        GtreeNode<Integer> nodeThreeFour2 = new GtreeNode<>(350);
        GtreeNode<Integer> nodeFourTwo2 = new GtreeNode<>(125);
        GtreeNode<Integer> nodeFourThree2 = new GtreeNode<>(175);
        GtreeNode<Integer> nodeFourFour2 = new GtreeNode<>(4);
        GtreeNode<Integer> nodeFourFive2 = new GtreeNode<>(500);
        rootNode2.setRight(nodeOne2);
        rootNode2.setLeft(nodeTwo2);
        nodeOne2.setLeft(nodeThreeOne2);
        nodeOne2.setRight(nodeThreeTwo2);
        nodeTwo2.setLeft(nodeThreeThree2);
        nodeTwo2.setRight(nodeThreeFour2);
        nodeThreeTwo2.setLeft(nodeFourTwo2);
        nodeThreeTwo2.setRight(nodeFourThree2);
        nodeThreeFour2.setLeft(nodeFourFour2);
        nodeThreeFour2.setRight(nodeFourFive2);

    }

    @Test
    public void treeCreationTest() {
        Tree functionTree = new Tree();
        ArrayList<Integer> treeOneAL = functionTree.preOrder(tree1);
        assertEquals("tree1: ", "[150, 250, 200, 350, 300, 500, 100, 75, 160, 125, 175]", treeOneAL.toString());
        ArrayList<Integer> treeTwoAL = functionTree.preOrder(tree2);
        assertEquals("tree1: ", "[42, 600, 200, 350, 4, 500, 100, 15, 160, 125, 175]", treeTwoAL.toString());
    }

    @Test
    public void treeHashMapTest() {
        TreeIntersection treeIntersection = new TreeIntersection();
        HashMap treeOneHash = treeIntersection.preOrderHashMapCreation(tree1);
        System.out.println(treeOneHash);
        assertEquals("here's the hash: ", "{160=160, 500=500, 100=100, 150=150, 200=200, 250=250, 75=75, 300=300, 125=125, 350=350, 175=175}", treeOneHash.toString());
    }

    @Test
    public void collisionTest() {
        TreeIntersection treeIntersection = new TreeIntersection();
        HashMap treeOneHash = treeIntersection.preOrderHashMapCreation(tree1);
        treeIntersection.preOrderWalkWHashMap(tree2.root, treeOneHash);
        assertEquals("Here are the results: ", "[200, 350, 500, 100, 160, 125, 175]", treeIntersection.collisionList.toString());
    }

}
