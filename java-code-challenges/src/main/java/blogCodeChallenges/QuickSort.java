package blogCodeChallenges;

import java.util.Arrays;

public class QuickSort {

    public int[] quickSort(int[] arr, int left, int right){      // declare method and its parameters

        if(left < right){                                        // if left(start) is less than right(end)...
//            System.out.println(Arrays.toString(arr));
            int position = partition(arr, left, right);          // position is equal to partition(go to line 15)
            quickSort(arr, left, position -1);
            quickSort(arr, position +1, right);
        }
        return arr;
    }

    private static int partition( int[] arr, int left, int right){   // declare methods and its parameters

        int pivot = arr[right];                                   // pivot is assigned to array with value of right(end) TODO: is this right???
        int low = left - 1;                                       // low(start) is assigned left minus one

        for(int i = left; i < right; i++){                          // for integer starting at left value is less than right value...
            if(arr[i] <= pivot){                                    //
                low++;                                              //
                swap(arr, i ,low);                                 //
                System.out.println(Arrays.toString(arr));
            }
        }
        swap(arr, right, low + 1);                              //
        return low +1;
    }

    private static void swap(int[] arr, int i, int low){

        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
        System.out.println("SWAP");
    }
}