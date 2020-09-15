package javachallenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayShiftTest {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test
    public void arrayShiftTest() {
        ArrayShift theWorking = new ArrayShift();
        int[] originalArray = {1, 2, 3, 4};
        int value = 7;
        int[] newArr = theWorking.arrayShift(originalArray, value);
        assertEquals(newArr[2],7);


    }
}
