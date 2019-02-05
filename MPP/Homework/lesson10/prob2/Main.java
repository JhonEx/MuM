package lesson10.prob2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        int result = secondSmallest(list);
        System.out.println("secondSmallest: " + result);
    }

    public static <T extends Comparable> T secondSmallest(List<T> items) {
        Optional<T> result = items.stream()
                .sorted(Comparator.comparing(x -> x))
                .limit(2)
                .skip(1)
                .findFirst();
        return result.get();
    }
}
