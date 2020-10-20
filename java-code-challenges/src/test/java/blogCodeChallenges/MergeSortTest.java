package blogCodeChallenges;

//import org.junit.jupiter.api.Test;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;


public class MergeSortTest {

    @Test
    public void mergeSortTest() {
        int[] lostNumbers = {42,8,4,23,16,15};
        MergeSort mergeSort = new MergeSort();
        int[] sortedNumbers = mergeSort.mergeSort(lostNumbers);
        int[] sortedLostNumbers = {4, 8, 15, 16, 23,42};
        assertArrayEquals(sortedLostNumbers, sortedNumbers);
    }

    @Test
    public void mergeSort2Test() {
        int[] lostNumbers = {1};
        MergeSort mergeSort = new MergeSort();
        int[] sortedNumbers = mergeSort.mergeSort(lostNumbers);
        int[] sortedLostNumbers = {1};
        assertArrayEquals(sortedLostNumbers, sortedNumbers);
    }

    @Test
    public void mergeSort3Test() {
        int[] lostNumbers = {8,10,20,3,-15};
        MergeSort mergeSort = new MergeSort();
        int[] sortedNumbers = mergeSort.mergeSort(lostNumbers);
        int[] sortedLostNumbers = {-15, 3, 8, 10,20};
        assertArrayEquals(sortedLostNumbers, sortedNumbers);
    }
}
