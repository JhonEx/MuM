package lesson9.prob9;

import java.util.List;

import static lesson9.prob9.Dish.Type.MEAT;
import static lesson9.prob9.Dish.Type.FISH;

public class Main {
    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;

        // a. Is there any Vegetarian meal available ( return type boolean)
        System.out.println(menu.stream().anyMatch(m -> m.isVegetarian()));

        // b. Is there any healthy menu have calories less than 1000 ( return type boolean)
        System.out.println(menu.stream().anyMatch(m -> m.getType() == FISH && m.getCalories() < 1_000));

        // c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
        System.out.println(menu.stream().anyMatch(m -> m.getType() == MEAT && m.getCalories() > 1_000));

        // d. find and return the first item for the type of MEAT( return type Optional<Dish>)
        System.out.println(menu.stream().filter(m -> m.getType() == MEAT).findFirst());

        // e. calculateTotalCalories() in the menu using reduce. (return int)
        System.out.println(menu.stream().map(m -> m.getCalories()).reduce(0, (a, b) -> a + b));

        // f. calculateTotalCalories MethodReference() in the menu using MethodReferences. (return int)
        System.out.println(menu.stream().map(Dish::getCalories).reduce(0, Integer::sum));
    }
}
