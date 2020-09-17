package javachallenges;

public class BinarySearch {
  public int binarySearch(int[] arrayToSearch, int searchKey){
    int low = 0;
    int high = arrayToSearch.length - 1;
    int middle = (low + high) /2;

//    if (searchKey<arrayToSearch[low] || searchKey>arrayToSearch[high]){
//      return -1; //this returns if the search key is not between the min and max values of the array
//    }

    while (0 <= 4) {
      if(searchKey == arrayToSearch[middle]){
        System.out.println(middle);
        return middle;
      }

      if (arrayToSearch[middle] < searchKey) {
        low = middle + 1;
      } else {
        high = middle - 1;
      }
      return middle = -1;
    }
//    return middle;
  }
}
