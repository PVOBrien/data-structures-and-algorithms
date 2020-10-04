package tree;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {

    @Test public void testNullNode(){
        Node newNode = new Node(6);
        assertNotNull(newNode);
        assertEquals("This should be 6.", 6, newNode.getValue()); // why does Integer need to be cast as int?
        assertNull("Left node should be null.", newNode.getLeft());
        assertNull("Right node should be null.", newNode.getRight());

    }

    @Test public void testNewNodeValue() {
        Node newNode = new Node(6);
        newNode.setValue(8);
        assertEquals("This is the newNodes value: 8", 8, newNode.getValue());
    }

    @Test public void testNodeLRValues(){
        Node newNode = new Node(6);
        Node newLeftNode = new Node(1);
        Node newRightNode = new Node(8);
        newNode.setLeft(newLeftNode);
        newNode.setRight(newRightNode);
        assertEquals("This should be left node", 1, newNode.getLeft().getValue());
        assertEquals("This should be right node", 8, newNode.getRight().getValue());
    }
}
