package lesson9.prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream myIntStream = IntStream.of(1, 2, 3);
        IntSummaryStatistics intStatistic = myIntStream.summaryStatistics();

        System.out.println("Min number: " + intStatistic.getMin());
        System.out.println("Max number: " + intStatistic.getMax());
    }
}
