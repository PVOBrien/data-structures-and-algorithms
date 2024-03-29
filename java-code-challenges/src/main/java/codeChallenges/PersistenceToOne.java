package codeChallenges;

public class PersistenceToOne {

    public static int persistence(long n) {
        int perseNum = 0;
        if (n < 10) return perseNum;
        return persistenceHelper(n, perseNum);
    }

    private static int persistenceHelper(long n, int perseNum) {
        if (n < 10) return (int) n;
        perseNum++;
        long newN = 1;
        char[] longArray = String.valueOf(n).toCharArray();

        for (int i = 0; i < longArray.length; i++) {
            newN *= Integer.parseInt(String.valueOf(longArray[i])); // https://howtodoinjava.com/java/string/convert-long-to-string/
        }

        if (newN > 9) return persistenceHelper(newN, perseNum);
        return perseNum;
    }
}

//class Persist {
//    public static int persistence(long n) {
//        int times = 0;
//        while (n >= 10) {
//            n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0')); // this is where I want to get to.
//            times++;
//        }
//        return times;
//    }
//}