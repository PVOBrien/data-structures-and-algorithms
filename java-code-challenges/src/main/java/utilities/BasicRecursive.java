package utilities;

public class BasicRecursive {

    public int additionRecursive(int addingNumber, int howManyTimes) {
        if (howManyTimes == 0) return addingNumber; // base case : what will stop be from looping? when I go out of recursion to return.
        return additionRecursive(addingNumber + 1, howManyTimes - 1);
    }
}
