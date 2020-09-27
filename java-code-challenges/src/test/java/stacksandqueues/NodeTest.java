package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {

    @Test public void emptyNodeTest() {
        Node newNode = new Node(6);
        System.out.println(newNode);
        assertEquals("That newNode is value 6.", 6, newNode.value);
    }
}
