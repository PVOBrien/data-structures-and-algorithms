package hackerRankChallenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SockPairs {

    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Boolean> socks = new HashMap<>();
        int pairs = 0;
        ar.stream().forEach(sock -> {
            if (socks.containsKey(sock)) {
                socks.replace(sock, true);
            } else {
                socks.put(sock, false);
            }
        });
        pairs = (int) socks.values().stream().filter(value -> value).count();
        return pairs;
    }

}
