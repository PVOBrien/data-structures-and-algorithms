package hackerRankChallenges;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SockPairs {

    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Boolean> socks = new HashMap<>();
        AtomicInteger newPairs = new AtomicInteger(0);
        ar.forEach(sock -> {
            if (!socks.containsKey(sock)) {
                socks.put(sock, false);
            } else if (socks.containsKey(sock) && !socks.get(sock)) {
//                int count = newPairs.get();
                newPairs.getAndIncrement();
                System.out.println(newPairs);
                socks.remove(sock);
            }
        });

        return newPairs.get();
    }
}
