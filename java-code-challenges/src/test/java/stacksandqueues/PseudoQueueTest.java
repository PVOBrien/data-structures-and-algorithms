package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test public void emptyPseudoQueue() {
        PseudoQueue empty = new PseudoQueue();
        assertEquals("There should be nothing in here", "NULL", empty.toString());
    }

    @Test public void enqueuePseudoQueueTest() throws Exception {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.enqueue(5);
        testQueue.enqueue(10);
        testQueue.enqueue(15);
        testQueue.enqueue(20);
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
    }

    @Test public void dequeuePseudoQueueTest() throws Exception {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.enqueue(5);
        testQueue.enqueue(10);
        assertEquals("this should be 5", "10 -> 5 -> NULL", testQueue.toString());
        assertEquals("this should be 5, null", 5, testQueue.dequeue());
        assertEquals("this should be 5, null", 10, testQueue.dequeue());
        assertThrows(NullPointerException.class, testQueue::dequeue);
    }
}
