package stacksandqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeIntTest {

    @Test
    public void nodeTest() {
        Node newNode = new Node(6);
        System.out.println(newNode);
        assertEquals(6, newNode.getValue());
    }
}
