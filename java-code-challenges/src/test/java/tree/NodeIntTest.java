package tree;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeIntTest {

    @Test public void testNullNode(){
        NodeInt newNodeInt = new NodeInt(6);
        assertNotNull(newNodeInt);
        assertEquals("This should be 6.", 6, newNodeInt.getValue()); // why does Integer need to be cast as int?
        assertNull("Left node should be null.", newNodeInt.getLeft());
        assertNull("Right node should be null.", newNodeInt.getRight());

    }

    @Test public void testNewNodeValue() {
        NodeInt newNodeInt = new NodeInt(6);
        newNodeInt.setValue(8);
        assertEquals("This is the newNodes value: 8", 8, newNodeInt.getValue());
    }

    @Test public void testNodeLRValues(){
        NodeInt newNodeInt = new NodeInt(6);
        NodeInt newLeftNodeInt = new NodeInt(1);
        NodeInt newRightNodeInt = new NodeInt(8);
        newNodeInt.setLeft(newLeftNodeInt);
        newNodeInt.setRight(newRightNodeInt);
        assertEquals("This should be left node", 1, newNodeInt.getLeft().getValue());
        assertEquals("This should be right node", 8, newNodeInt.getRight().getValue());
    }
}
