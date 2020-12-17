package codeChallenges;

public class FizzBuzzVvSimple {

    public int solution(int number) {
        int sum = 0;
        for (int  i= 1; i < number + 1; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        return sum;
    }
}