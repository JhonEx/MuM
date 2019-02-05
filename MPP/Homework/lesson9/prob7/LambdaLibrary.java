package lesson9.prob7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, String> FILTER = (list, salary, empName) ->
            list.stream()
                    .filter(emp -> emp.getSalary() > salary)
                    .filter(emp -> emp.getLastName().charAt(0) > empName)
                    .map(emp -> emp.getFirstName() + " " + emp.getLastName())
                    .sorted(Comparator.comparing(name -> name))
                    .collect(Collectors.joining(", "));
}
