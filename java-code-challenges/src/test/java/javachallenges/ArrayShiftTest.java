package javachallenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayShiftTest {
    @Test
    public void arrayShiftTest() {
        ArrayShift theWorking = new ArrayShift();
        int[] originalArray = {1, 2, 3, 4};
        int value = 7;
        int[] newArr = theWorking.arrayShift(originalArray, value);
        assertEquals(newArr[2],7);

        int[] secondArray = {1, 2, 3, 4, 5};
        int secondValue = 12;
        int[] secondTest = theWorking.arrayShift(secondArray, secondValue);
        assertEquals(secondTest[3], 12);
    }
}
