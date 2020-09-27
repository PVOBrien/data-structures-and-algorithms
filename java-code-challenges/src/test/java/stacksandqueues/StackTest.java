package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test public void stackEmptyTest() {
        Stack testStack = new Stack();
        assertNull(testStack.front);
    }

    @Test public void pushTest() {
        Stack testStack = new Stack();
        testStack.push(5);
        assertEquals("this should be a 5", 5, testStack.front.value);
    }

    @Test public void pushMultipleTest() {
        Stack testStack = new Stack();
        testStack.push(5);
        assertEquals("this should be a 5", 5, testStack.front.value);
        testStack.push(13);
        assertEquals("this should be a 13", 13, testStack.front.value);
        testStack.push(22);
        assertEquals("this should be a 22", 22, testStack.front.value);
        testStack.push(30);
        System.out.println(testStack);
        assertEquals("this should be a 30", 30, testStack.front.value);
    }

    @Test public void popTest() {
        Stack testStack = new Stack();
        testStack.push(5);
        testStack.push(10);
        testStack.push(15);
        assertEquals("It should return an int of 15", 15, testStack.pop());
        assertEquals("It should return an int of 10", 10, testStack.pop());
        assertEquals("It should return an int of 5", 5, testStack.pop());
        assertThrows(NullPointerException.class, () -> testStack.pop());
    }

    @Test public void popThrowsTest() {
        Stack testStack = new Stack();
        assertThrows(NullPointerException.class, testStack::pop); // () -> testStack.pop()
    }

    @Test public void peekTest() {
        Stack testStack = new Stack();
        testStack.push(9);
        assertEquals("This should equal 9.", 9, testStack.peek());
        testStack.push(17);
        assertEquals("This should equal 17.", 17, testStack.peek());
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
