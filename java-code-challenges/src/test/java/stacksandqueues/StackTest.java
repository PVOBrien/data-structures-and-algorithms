package stacksandqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void stackEmptyTest() {
        Stack testStack = new Stack();
        assertNull(testStack.front);
    }

    @Test public void pushTest() {
        Stack testStack = new Stack();
        testStack.push(5);
        assertEquals(5, testStack.front.getValue());
    }

    @Test public void pushMultipleTest() {
        Stack testStack = new Stack();
        testStack.push(5);
        assertEquals(5, testStack.front.getValue());
        testStack.push(13);
        assertEquals(13, testStack.front.getValue());
        testStack.push(22);
        assertEquals(22, testStack.front.getValue());
        testStack.push(30);
        System.out.println(testStack);
        assertEquals(30, testStack.front.getValue());
    }

    @Test public void popTest() {
        Stack testStack = new Stack();
        testStack.push(5);
        testStack.push(10);
        testStack.push(15);
        assertEquals(15, testStack.pop());
        assertEquals(10, testStack.pop());
        assertEquals(5, testStack.pop());
    }

    @Test public void multiplePopToEmptyStackTest() {
        Stack testStack = new Stack();
        testStack.push(9);
        testStack.push(14);
        assertEquals(14, testStack.pop());
        assertEquals(9, testStack.pop());
        assertThrows(NullPointerException.class, testStack::pop);
    }

    @Test public void popThrowsTest() {
        Stack testStack = new Stack();
        assertThrows(NullPointerException.class, testStack::pop); // () -> testStack.pop()
    }

    @Test public void peekTest() {
        Stack testStack = new Stack();
        testStack.push(9);
        assertEquals(9, testStack.peek());
        testStack.push(17);
        assertEquals(17, testStack.peek());
    }

    @Test public void peekThrowTest() {
        Stack testStack = new Stack();
        assertThrows(NullPointerException.class, testStack::peek);
    }

    @Test public void isEmptyTrueTest() {
        Stack testStack = new Stack();
        assertTrue(testStack.isEmpty());
    }

    @Test public void isEmptyFalseTest() {
        Stack testStack = new Stack();
        testStack.push(5);
        assertFalse(testStack.isEmpty());
    }
}
