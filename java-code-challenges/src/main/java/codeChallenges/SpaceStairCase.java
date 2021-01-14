package codeChallenges;

public class SpaceStairCase {

    static String staircase(int n) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < n + 1; i++) {
            String spaces = " ";
            stringBuilder.append(spaces.repeat(n - i));
            stringBuilder.append("#".repeat(i));
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());

        return stringBuilder.toString();
    }
}