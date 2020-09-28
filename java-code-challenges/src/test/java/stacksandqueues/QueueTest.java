package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;


public class QueueTest {

    @Test
    public void emptyQueueTest() {
        Queue queue = new Queue();
        assertNull("This is null.", queue.back);
        assertNull("This is null.", queue.front);
    }

    @Test
    public void enqueueTest() {
        Queue queue = new Queue();
        queue.enqueue(12);
        assertEquals("This should be 12.", 12, queue.front.value);
        assertEquals("This should be 12.", 12, queue.back.value);
        queue.enqueue(8);
        assertEquals("This should be 8.", 8, queue.back.value);
        assertEquals("This should be 12.", 12, queue.front.value);
        assertEquals("This should be 12.", 12, queue.front.value);
    }

    @Test
    public void dequeueTest() {
        Queue queue = new Queue();
        queue.enqueue(9);
        queue.enqueue(22);
        assertEquals("This should equal 9.", 9, queue.dequeue());
        assertEquals("The front should now be 22.", 22, queue.front.value);
        queue.dequeue();
        assertNull("This is empty", queue.front); // is this really empty though? or can it be more thoroughly emptied?
        assertNull("This is empty", queue.back); // is this really empty though? or can it be more thoroughly emptied?
    }

    @Test
    public void dequeueThrowTest() {
        Queue queue = new Queue();
        queue.enqueue(9);
        assertEquals("This should equal 9.", 9, queue.dequeue());
        assertThrows(NullPointerException.class, queue::dequeue);
    }

    @Test
    public void peekTest() {
        Queue queue = new Queue();
        queue.enqueue(23);
        queue.enqueue(4);
        assertEquals("this is going to be 23", 23, queue.peek());
    }

    @Test
    public void peekEmptyExceptionThrowTest() {
        Queue queue = new Queue();
        assertThrows("this should catch a NullPointerException", NullPointerException.class, queue::peek); // OR () -> queue.peek())
    }

    @Test
    public void isEmptyTest() {
        Queue queue = new Queue();
        assertTrue("This is empty", queue.isEmpty());
        queue.enqueue(5);
        assertFalse("This is not empty", queue.isEmpty());
    }
}