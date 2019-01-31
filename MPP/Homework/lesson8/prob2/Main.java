package lesson8.prob2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Toyota", 35000.0, 2019),
                new Product("Mercedes", 62000.0, 2019),
                new Product("Ford", 42000.0, 2019)
        );

        Collections.sort(products, new ComparePrice());
        System.out.println("Compare by Price: ");
        products.forEach(System.out::println);

        System.out.println("\n");

        Collections.sort(products, new CompareTitle());
        System.out.println("Compare by Title:");
        products.forEach(System.out::println);

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                }else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("Compare by Price (closure):");
        products.forEach(System.out::println);
    }
}
