package javachallenges;

import org.junit.Test;

public class BinarySearchTest {
  @Test
  public void BinarySearching() {   // function takes in an array and a search key
    BinarySearch bananaSearch = new BinarySearch();
    int[] searchInput = {4, 8, 15, 16, 23, 42};
    int searchKey = 15;

    System.out.println(bananaSearch.binarySearch(searchInput,searchKey));

  }
}
