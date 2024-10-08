package Atlassian.Easy;

import java.util.*;

public class LoggerRateLimiter {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(List.of("foo", "bar", "foo", "fba", "foo"));
        List<Integer> timeStamp = new ArrayList<>(List.of(1, 2, 3, 8, 11));
        List<Boolean> result = new ArrayList<>();
        result = rateLimit(result, str, timeStamp);
        printList(result);
    }

    public static void printList(List<Boolean> x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.print(x.get(i) + " ");
        }
        System.out.println();
    }

    public static List<Boolean> rateLimit(List<Boolean> result, List<String> str, List<Integer> timeStamp) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.size(); i++) {
            result.add(false);
        }
        for (int i = 0; i < str.size(); i++) {
            String s = str.get(i);
            int time = timeStamp.get(i);
            if (!hm.containsKey(s)) {
                result.set(i, true);
                hm.put(s, timeStamp.get(i));

            } else {
                if (hm.get(s) + 10 > time)
                    result.set(i, false);
                else {
                    hm.put(s, time);
                    result.set(i, true);
                }

            }
        }
        return result;
    }
}
