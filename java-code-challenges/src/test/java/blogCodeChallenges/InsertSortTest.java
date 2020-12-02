package blogCodeChallenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertSortTest {
    @Test
    public void testInsertSorter(){
        int[] lostNumber = {8,4,23,42,16,15};
        InsertSort insertSort = new InsertSort();
        int[] correctNumber =  {4, 8, 15, 16, 23, 42};
        int[] fromInsertSort = insertSort.insertSort(lostNumber);
        assertEquals(Arrays.toString(correctNumber), Arrays.toString(fromInsertSort));
    }
}