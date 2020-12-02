package tree;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodeIntTest {

    @Test
    public void testNullNode(){
        NodeInt newNodeInt = new NodeInt(6);
        assertNotNull(newNodeInt);
        assertEquals(6, newNodeInt.getValue()); // why does Integer need to be cast as int?
        assertNull(newNodeInt.getLeft());
        assertNull(newNodeInt.getRight());

    }

    @Test public void testNewNodeValue() {
        NodeInt newNodeInt = new NodeInt(6);
        newNodeInt.setValue(8);
        assertEquals(8, newNodeInt.getValue());
    }

    @Test public void testNodeLRValues(){
        NodeInt newNodeInt = new NodeInt(6);
        NodeInt newLeftNodeInt = new NodeInt(1);
        NodeInt newRightNodeInt = new NodeInt(8);
        newNodeInt.setLeft(newLeftNodeInt);
        newNodeInt.setRight(newRightNodeInt);
        assertEquals(1, newNodeInt.getLeft().getValue());
        assertEquals(8, newNodeInt.getRight().getValue());
    }
}
