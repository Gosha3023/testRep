package org.example.testHh;

import java.util.*;

public class Premium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();

        System.out.println(calculatePremium(n, m, list));
    }

    public static int countManagersReceivingPremium(int m, int premium, List<Integer> list) {
        int k = 0;
        Iterator<Integer> iterator = list.iterator();
        if (premium == 0)
            return 0;
        while (iterator.hasNext() && k <= m)
            k += iterator.next() / premium;
        return k;
//        return list.stream().map(x -> x/premium).reduce(0, (acc, x) -> acc + x);
    }

    public static int calculatePremium(int n, int m, List<Integer> list) {
        Collections.sort(list);
        int lowerBound = 0;
        int upperBound = n - 1;
        int k = 0;
        int i = 0;
        do {
            i = (lowerBound + upperBound) / 2;
            int premium = list.get(i);
            if (premium != 0) {
                k = countManagersReceivingPremium(m, premium, list);
                if (k == m)
                    return premium;
                if (k < m)
                    upperBound = i;
                if (k > m)
                    lowerBound = i;
            } else {
                lowerBound = i;
            }
        } while (upperBound - lowerBound > 1);
        if (k < m)
            return reducePremium(m, lowerBound, upperBound, list);
        return list.get(list.size() - 1);
    }

    public static int reducePremium(int m, int li, int ui, List<Integer> list) {
        int lowerLimitPremium = 0;
        if (countManagersReceivingPremium(m, list.get(li), list) > m)
            lowerLimitPremium = list.get(li);
        int upperLimitPremium = list.get(ui);
        while (upperLimitPremium - lowerLimitPremium > 1) {
            int premium = (lowerLimitPremium + upperLimitPremium) / 2;
            int k = countManagersReceivingPremium(m, premium, list);
            if (k > m) {
                lowerLimitPremium = premium;
            }
            if (k < m) {
                upperLimitPremium = premium;
            }
            if (k == m) {
                return increasePremium(premium, list);
            }
        }
        return lowerLimitPremium;
    }

    public static int increasePremium(int premium, List<Integer> list) {
        return premium + list.stream().filter(p -> p > premium).map(x -> (x % premium) / (x / premium)).min(Integer::compare).get();
    }
}