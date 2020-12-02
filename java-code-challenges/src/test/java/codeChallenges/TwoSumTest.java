package codeChallenges;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TwoSumTest {

    @Test
    public void failingTwoSumTest() throws NoSuchElementException {
        Integer[] testArray = new Integer[2];
        Integer firstInt = 3;
        Integer secondInt = 7;
        testArray[0] = firstInt;
        testArray[1] = secondInt;
        assertThrows(NoSuchElementException.class, ()-> TwoSum.twoSum(testArray, 20)); // if a method is static, it's class also has to be called when using a lambda/arrow expressions
    }

    @Test
    public void passingTwoSumTest() {
        Integer[] testArray = new Integer[8];
        Integer firstInt = 3;
        Integer secondInt = 7;
        Integer third = 3;
        Integer fourth = 4;
        Integer fifth = 5;
        Integer sixth = 6;
        Integer seventh = 7;
        Integer eight = 8;
        testArray[0] = firstInt;
        testArray[1] = secondInt;
        testArray[2] = third;
        testArray[3] = fourth;
        testArray[4] = fifth;
        testArray[5] = sixth;
        testArray[6] = seventh;
        testArray[7] = eight;
        int[] resultArray = TwoSum.twoSum(testArray, 6);
        int[] result = {2, 0};
        assertArrayEquals(result, resultArray);
    }

}
