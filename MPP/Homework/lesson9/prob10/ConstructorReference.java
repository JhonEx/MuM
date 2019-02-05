package lesson9.prob10;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

class Human {
    String name;
    int age;
    String gender;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}

interface TriFunction<T, U, Y, R> {
    R apply(T t, U u, Y y);
}

public class ConstructorReference {
    public static void main(String args[]) {
        Human[] list = new Human[] {
                new Human("Joe", 35, "Male"),
                new Human("Jane", 45, "Female"),
                new Human("John", 30, "Male")
        };

        // Query 1  : Print only Female candidates names
        List<Human> females = Arrays.stream(list)
                .filter(x -> x.getGender().equals("Female"))
                .collect(Collectors.toList());
        females.forEach(System.out::println);

        // Query 2 : Create an object by choosing suitable
        // Interface to the specified constructors (Totally 3 constructors)
        // using fourth type of Method Reference ClassName::new. Then print the object status
        Function<String, Human> firstConstructor = name -> new Human(name);
        BiFunction<String, Integer, Human> secondConstructor = (name, age) -> new Human(name, age);
        TriFunction<String, Integer, String, Human> thirdConstructor = (name, age, gender) -> new Human(name, age, gender);
        System.out.println("\nOne parameter constructor: " + firstConstructor.apply("John"));
        System.out.println("Two parameters constructor: " + secondConstructor.apply("John", 30));
        System.out.println("Three parameters constructor: " + thirdConstructor.apply("John", 30, "Male") + "\n");

        // Query 3 : Count the male candidates whose age is more than 30
        List<Human> malesOlderThan30 = Arrays.stream(list)
                .filter(x -> x.getGender().equals("Male"))
                .filter(x -> x.getAge() > 30)
                .collect(Collectors.toList());

        malesOlderThan30.forEach(System.out::println);
    }
}
