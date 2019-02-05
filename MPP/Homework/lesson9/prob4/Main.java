package lesson9.prob4;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        printSquares(4);
    }

    public static void printSquares(int num) {
        IntStream intStream = IntStream.iterate(1, x -> x + 1).limit(num);
        intStream.forEach(x -> System.out.print(" " + powerBy(x, 2)));
    }

    private static double powerBy(double a, double b) {
        return Math.pow(a, b);
    }
}
