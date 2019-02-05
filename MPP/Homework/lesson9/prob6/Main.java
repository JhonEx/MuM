package lesson9.prob6;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Set<String>> sets = Arrays.asList(
                new HashSet<>(Arrays.asList("A", "B")),
                new HashSet<>(Arrays.asList("D")),
                new HashSet<>(Arrays.asList("1", "3", "5"))
        );

        Set<String> result = new Main().union(sets);
        System.out.println(result);
    }

    public Set<String> union(List<Set<String>> sets) {
        return sets.stream().reduce(sets.get(0), (a, b) -> new HashSet<String>(){
            {
                addAll(a);
                addAll(b);
            }
        });
    }
}
