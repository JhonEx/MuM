package lesson9.prob5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> result = new Main().streamSection(nextStream(), 3, 5);
        result.forEach(System.out::println);
    }

    private static Stream<String> nextStream() {
        return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
                "iii").stream();
    }

    Stream<String> streamSection(Stream<String> stream, int m, int n) {
        return stream.skip(m).limit(n - (m - 1));
    }
}
