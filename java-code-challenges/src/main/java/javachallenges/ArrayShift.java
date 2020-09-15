package javachallenges;

public class ArrayShift {
  public int[] arrayShift (int[] originalArray, int numToAdd) {
    int[] newArr = new int[originalArray.length + 1]; // https://stackoverflow.com/questions/1200621/how-do-i-declare-and-initialize-an-array-in-java
    int midIndex;
    int j = 0;

    if (originalArray.length % 2 == 0) {
      midIndex = originalArray.length / 2;
    } else {
      midIndex = originalArray.length / 2 + 1;
    }

    for (int i = 0; i < newArr.length; i++){
      if (i == midIndex){
        newArr[i] = numToAdd;
      } else {
        newArr[i] = originalArray[j];
        j++;
      }
    }
    return newArr;
  }
}
