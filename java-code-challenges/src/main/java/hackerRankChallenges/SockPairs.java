package hackerRankChallenges;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SockPairs {

    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> socks = new HashMap<>();
        int pairs = 0;
        ar.forEach(sock -> {
            if (!socks.containsKey(sock)) {
                socks.put(sock, 1);
            } else if (socks.containsKey(sock)) {
                int count = socks.get(sock);
                socks.replace(sock, count+1);
            }
        });

//        socks.entrySet().forEach((entry -> System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue())));

        pairs = socks.values().stream()
                .reduce(0, (accum, thisValue) -> {
                    System.out.println("what is thisValue: " + thisValue);
                    return thisValue/2 + accum;
                });

        return pairs;
    }
}
