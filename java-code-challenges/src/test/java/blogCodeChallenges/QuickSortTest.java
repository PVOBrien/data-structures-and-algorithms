package blogCodeChallenges;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void quickSortTest(){
        int[] lostNumbers = {42, 8, 4, 23, 16, 15};
        QuickSort quickSort = new QuickSort();
        int[] quickNumbers = quickSort.quickSort(lostNumbers, 0, 5);
        int[] sortedLostNumbers = {4, 8, 15, 16, 23, 42};
        System.out.println(Arrays.toString(quickNumbers));
        assertArrayEquals(sortedLostNumbers, lostNumbers);
    }

    @Test
    public void otherQuickSortTest(){
        int[] numsToSort = {5, 0, 20, 12, 3};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(numsToSort, 0, numsToSort.length-1);
        int[] sorted = {0, 3, 5, 12, 20};
        assertArrayEquals(sorted, quickSort.quickSort(numsToSort, 0, numsToSort.length-1));
    }
}