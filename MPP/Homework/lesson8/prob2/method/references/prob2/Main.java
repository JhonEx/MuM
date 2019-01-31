package lesson8.prob2.method.references.prob2;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // Using method reference
        Supplier<Double> randomNumber = Math::random;
        System.out.println(randomNumber.get());

        // Using lambda expression
        Supplier<Double> lambdaRandom = () -> Math.random();
        System.out.println(lambdaRandom.get());

        // Using Inner Class
        PrintRandom innerClass = new Main().new PrintRandom();
        System.out.println(innerClass.get());
    }

    public class PrintRandom implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }
}
