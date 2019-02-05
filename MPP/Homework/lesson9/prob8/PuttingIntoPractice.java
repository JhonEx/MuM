package lesson9.prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        System.out.println("\nAll transaction from 2011 and order by value: ");
        List<Transaction> transactionList = transactions.stream()
                .filter(t -> t.getYear() >= 2011)
                .sorted(Comparator.comparing(t -> t.getValue()))
                .collect(Collectors.toList());
        transactionList.forEach(System.out::println);

        // Query 2: What are all the unique cities where the traders work?
        System.out.println("\nUnique City: ");
        List<Transaction> uniqueCities = transactions.stream()
                .filter(distinctBy(t -> t.getTrader().getCity()))
                .collect(toList());
        uniqueCities.forEach(System.out::println);

        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println("\nAll trader from Cambridge: ");
        List<Transaction> fromCambridge = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(t -> t.getTrader().getName()))
                .collect(toList());
        fromCambridge.forEach(System.out::println);

        // Query 4: Return a string of all traders names sorted alphabetically.
        System.out.println("\nSort alphabetically of trader name: ");
        List<Transaction> traders = transactions.stream()
                .filter(distinctBy(t -> t.getTrader().getName()))
                .sorted(Comparator.comparing(t -> t.getTrader().getName()))
                .collect(toList());
        traders.forEach(System.out::println);

        // Query 5: Are there any trader based in Milan?
        System.out.println("\nTraders based in Milan: ");
        List<Transaction> milanTraders = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Milan"))
                .filter(distinctBy(t -> t.getTrader().getName()))
                .collect(toList());
        milanTraders.forEach(System.out::println);

        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        System.out.println("\nSet Milan to Cambridge: ");
        List<Transaction> milanToCambridge = transactions.stream()
                .map(t -> updateMilan(t))
                .collect(toList());
        milanToCambridge.forEach(System.out::println);

        // Query 7: What's the highest value in all the transactions?
        System.out.println("\nHighest Value");
        Transaction highestValue = transactions.stream()
                .max(Comparator.comparing(t -> t.getValue()))
                .get();
        System.out.println(highestValue.getValue());
    }

    public static <T> Predicate<T> distinctBy(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static Transaction updateMilan(Transaction tr) {
        if (tr.getTrader().getCity().equals("Milan")) {
            tr.getTrader().setCity("Cambridge");
        }
        return tr;
    }
}
