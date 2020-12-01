package stacksandqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void emptyQueueTest() {
        Queue queue = new Queue();
        assertNull(queue.back);
        assertNull(queue.front);
    }

    @Test
    public void enqueueTest() {
        Queue queue = new Queue();
        queue.enqueue(12);
        assertEquals(12, queue.front.getValue());
        assertEquals(12, queue.back.getValue());
        queue.enqueue(8);
        assertEquals(8, queue.back.getValue());
        assertEquals(12, queue.front.getValue());
        assertEquals(12, queue.front.getValue());
    }

    @Test
    public void dequeueTest() {
        Queue queue = new Queue();
        queue.enqueue(9);
        queue.enqueue(22);
        assertEquals(9, queue.dequeue());
        assertEquals(22, queue.front.getValue());
        queue.dequeue();
        assertNull(queue.front); // is this really empty though? or can it be more thoroughly emptied?
        assertNull(queue.back); // is this really empty though? or can it be more thoroughly emptied?
    }

    @Test
    public void dequeueThrowTest() {
        Queue queue = new Queue();
        queue.enqueue(9);
        assertEquals(9, queue.dequeue());
        assertThrows(NullPointerException.class, queue::dequeue);
    }

    @Test
    public void peekTest() {
        Queue queue = new Queue();
        queue.enqueue(23);
        queue.enqueue(4);
        assertEquals(23, queue.peek());
    }

    @Test
    public void peekEmptyExceptionThrowTest() {
        Queue queue = new Queue();
        assertThrows(NullPointerException.class, queue::peek); // OR () -> queue.peek())
    }

    @Test
    public void isEmptyTest() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
        queue.enqueue(5);
        assertFalse(queue.isEmpty());
    }
}