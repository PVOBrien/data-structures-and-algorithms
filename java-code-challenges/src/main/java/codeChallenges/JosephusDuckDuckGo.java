package codeChallenges;

import java.util.ArrayList;
import java.util.List;

public class JosephusDuckDuckGo {

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> orderedList = new ArrayList<T>();
        int removeAt = k-1;

        while (items.size() > 0) { // .size() returns *the actual number of items* in the collection, NOT the numbers of index positions it has.
            if (removeAt < items.size()) {
                orderedList.add(items.get(removeAt));
                items.remove(removeAt);
                removeAt = (k-1)+removeAt;
                System.out.println(orderedList.toString());
            } else {
                removeAt = (removeAt % items.size());
            }
        }
        return orderedList;
    }
}
