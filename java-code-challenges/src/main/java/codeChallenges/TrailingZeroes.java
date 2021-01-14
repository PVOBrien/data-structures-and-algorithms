package codeChallenges;

public class TrailingZeroes { // https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/java

    public static int zeros(int n) {

        int count = 0;
        int divider = 5;

        while ((n/divider) > 0) {
            count += n/divider;
            divider = divider*5;
        }

        return count;
    }
}

// to find trailing zeroes only by n (the number to factorialize by), check out this code and explanation https://javabypatel.blogspot.com/2017/05/count-trailing-zeros-in-factorial-of-number.html?m=1
