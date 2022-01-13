package codeChallenges;

import java.util.Arrays;
import java.util.OptionalDouble;

public class averageStream {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        System.out.println(Arrays.toString(classPoints));
        System.out.println(yourPoints);
        OptionalDouble theAverage = Arrays.stream(classPoints).average();
        return yourPoints > theAverage.getAsDouble();
    }
}
