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
        System.out.println(testStack);
        assertEquals("this should be a 5", 5, testStack.front.value);
    }

    @Test public void popTest() {
        Stack testStack = new Stack();
        testStack.push(5);
        assertEquals("It should return an int of 5", 5, testStack.pop());
    }

    @Test public void peekTest() {
        Stack testStack = new Stack();
        testStack.push(9);
        assertEquals("This should equal 9.", 9, testStack.peek());
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
