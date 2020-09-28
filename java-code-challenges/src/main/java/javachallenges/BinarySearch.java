package javachallenges;

public class BinarySearch {
  public int binarySearch(int[] arrayToSearch, int searchKey){
    int low = 0;
    int high = arrayToSearch.length - 1;
    int middle = (low + high) /2;

//    if (searchKey<arrayToSearch[low] || searchKey>arrayToSearch[high]){
//      return -1; //this returns if the search key is not between the min and max values of the array
//    }

    while (0 <= arrayToSearch.length) { // https://www.geeksforgeeks.org/java-program-for-binary-search-recursive-and-iterative/#:~:text=Java%20Program%20for%20Binary%20Search%20%28Recursive%20and%20Iterative%29,%28x%20is%20smaller%29%20recur%20for%20the%20left%20half.
      // where I found a binarySearch to walk through. Also provided a recursive option, but we didn't go that crazy.
      if(searchKey == arrayToSearch[middle]){
//        System.out.println(middle);
        return middle;
      }

      if (arrayToSearch[middle] < searchKey) {
        low = middle + 1;
      } else {
        high = middle - 1;
      }
      return middle = -1;
    }
    return middle;
  }
}
