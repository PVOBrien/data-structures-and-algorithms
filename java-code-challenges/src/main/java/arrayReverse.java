import java.util.Arrays;

public class ArrayReverse {   
  public static void main(String[] args) {
    int[] original = new int[]{89, 2354, 3546, 23, 10, -923, 823, -12};

    int[] theReversed = arrayReverse(original);

    System.out.println(Arrays.toString(theReversed)); // https://www.wikihow.com/Print-an-Array-in-Java#:~:text=How%20to%20Print%20an%20Array%20in%20Java%20-,of%20one%20dimensional%20arrays...%203%20Run%20the%20program. to find out how to print an array.

  }
    public static int[] arrayReverse(int[] original) {
      int theLength = original.length;
      int[] reversed = new int[theLength];
      for (int i = 0; i < original.length; i++){
        reversed[original.length - i - 1] = original[i];
      } 
      return reversed;
    }
}       