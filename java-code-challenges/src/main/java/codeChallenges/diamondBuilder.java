package codeChallenges;

public class diamondBuilder { // https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java

    public static String print(int n) {

        String diamondLine = new String();
        StringBuilder diamond = new StringBuilder(); // why to use StringBuilder https://redfin.engineering/java-string-concatenation-which-way-is-best-8f590a7d22a8
        if (n < 1 || n % 2 == 0) return null;
        if (n == 1) return "*\n";

        for (int i = 0; i < n / 2; i++) {
            String addItIn = " ".repeat(n/2 - i).concat("*");
            String moreStars = addItIn.concat("*".repeat(2*i).concat("\n"));
            diamondLine = moreStars;
            diamondLine = diamondLine.concat(moreStars);
            diamond.insert(diamond.length()/2, diamondLine); // add the diamondLine to the correct location in the diamond.
        }

        String starLine = "*".repeat(n).concat("\n");
        diamond.insert(diamond.length()/2, starLine);

        return diamond.toString();
    }
}
